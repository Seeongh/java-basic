package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

/**
 * 생성자-소비자 문제
 * 한정된 버퍼 역할을 함 -> 생산자/소비자 대기이슈 개선 (sleep)
 *
 * thread가 sleep중 대기하는 시간에 lock을 가지지 않고
 * 대기하고(wait), lock 사용이 끝나면 고치함(notify)
 */
public class BoundedQueueV3 implements BoundedQueue{

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV3(int max) {
        this.max = max;
    }

    @Override
    public synchronized  void put(String data) { //여러쓰레드에서 호출할 수 있기 떄문에 sync
        while(queue.size()== max) {
            log("[put] 큐가 가득 참, 생산자 대기");
            try {
                wait(); //Object가 제공하는 wait Runnable -> Wating, 락 반납
                log("[put] 생산자 꺠어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.offer(data);
        log("[put] 생산자 데이터 저장, notify()호출");
        notify(); //대기 쓰레드 wait->blocked
        //notifyAll();

    }

    @Override
    public  synchronized String take() { //여러쓰레드에서 호출할 수 있기 떄문에 sync
        while(queue.isEmpty()) {
            log("[take] 큐에 데이터 없음, 소비자대기");
            try {
                wait();
                log("[take] 소비자 꺠어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String data = queue.poll();
        log("[take] 소비자 데이터 획득, notify() 호출");
        notify(); // 대기 쓰레드 하나가 wait->Blocked
        return data;
    }

    @Override
    public String toString() { //원칙적으로는 sync넣어줘야함
        return queue.toString();
    }
}
