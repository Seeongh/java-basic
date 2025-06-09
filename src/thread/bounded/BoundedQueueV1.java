package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static thread.util.MyLogger.log;

/**
 * 생성자-소비자 문제
 * 한정된 버퍼 역할을 함
 */
public class BoundedQueueV1 implements BoundedQueue{

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV1(int max) {
        this.max = max;
    }

    @Override
    public synchronized  void put(String data) { //여러쓰레드에서 호출할 수 있기 떄문에 sync
        if(queue.size() == max) {
            log("[put] 큐가 가득 참, 버림");
            return;
        }
        queue.offer(data);
    }

    @Override
    public  synchronized String take() { //여러쓰레드에서 호출할 수 있기 떄문에 sync
        if(queue.isEmpty()) {
            return null;
        }
        return queue.poll();
    }

    @Override
    public String toString() { //원칙적으로는 sync넣어줘야함
        return queue.toString();
    }
}
