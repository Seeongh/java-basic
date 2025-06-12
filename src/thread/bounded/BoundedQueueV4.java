package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static thread.util.MyLogger.log;

/**
 * ReentrantLock으로 생산자/소비자 이슈 개선해보기
 */
public class BoundedQueueV4 implements BoundedQueue{

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition(); //thread 대기 집합

    public BoundedQueueV4(int max) {
        this.max = max;
    }

    @Override
    public void put(String data) { //여러쓰레드에서 호출할 수 있기 떄문에 sync
        lock.lock();

        try{
            while(queue.size()== max) {
                log("[put] 큐가 가득 참, 생산자 대기");
                try {
                    //wait(); //Object가 제공하는 wait Runnable -> Wating, 락 반납
                    /**
                     * 지정한 condition(쓰레드 대기)에 현재 쓰레드를 WAITING 상태로 보관한다.
                     * 획득한 락을 반납하고 대기상태로 보관.
                     */
                    condition.await();
                    log("[put] 생산자 꺠어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.offer(data);
            log("[put] 생산자 데이터 저장, notify()호출");
            //notify(); //대기 쓰레드 wait->blocked
            /**
             * condition에서 대기중인 스레드를 하나 깨움.
             */
            condition.signal();
            //notifyAll();

        }
        finally{
            lock.unlock();
        }

    }

    @Override
    public  String take() { //여러쓰레드에서 호출할 수 있기 떄문에 sync
        lock.lock();

        try{
            while(queue.isEmpty()) {
                log("[take] 큐에 데이터 없음, 소비자대기");
                try {

                    condition.await();
                    log("[take] 소비자 꺠어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            String data = queue.poll();
            log("[take] 소비자 데이터 획득, notify() 호출");
            //notify(); // 대기 쓰레드 하나가 wait->Blocked
            condition.signal();
            return data;
        }finally {
            lock.unlock();
        }

    }

    @Override
    public String toString() { //원칙적으로는 sync넣어줘야함
        return queue.toString();
    }
}
