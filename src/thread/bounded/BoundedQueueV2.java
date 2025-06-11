package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

/**
 * 생성자-소비자 문제
 * 한정된 버퍼 역할을 함 -> 생산자/소비자 대기이슈 개선 (sleep)
 *
 * producer3 이 timed_waiting이 되고,
 * 이후 실행되는 항목이 blocked 상태가 됨.
 */
public class BoundedQueueV2 implements BoundedQueue{

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV2(int max) {
        this.max = max;
    }

    @Override
    public synchronized  void put(String data) { //여러쓰레드에서 호출할 수 있기 떄문에 sync
        while(queue.size()== max) {
            log("[put] 큐가 가득 참, 생산자 대기");
            /**
             * timed_waiting이 된 thread 때문에
             * 나머지 thread(consumer)가 blocked됨
             */
            sleep(1000);
        }
        queue.offer(data);
    }

    @Override
    public  synchronized String take() { //여러쓰레드에서 호출할 수 있기 떄문에 sync
        while(queue.isEmpty()) {
            log("[take] 큐에 데이터 없음, 소비자대기");
            sleep(1000);
        }
        return queue.poll();
    }

    @Override
    public String toString() { //원칙적으로는 sync넣어줘야함
        return queue.toString();
    }
}
