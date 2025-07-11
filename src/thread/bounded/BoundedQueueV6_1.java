package thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * concurrent의 blockingqueue 사용하기
 * BoundedQueueV5와 동일함
 *
 * notEmpty : 소비자 condition
 * notfull : 생산자 condition
 *
 * 큐 찼을떄 선택지
 * 1. 예외 던지기
 * 2. 즉시 false
 * 3. 대기(interrupt 제공)
 * 4. 특정시간만큼만 대기(interrupt 제공)
 */
public class BoundedQueueV6_1 implements BoundedQueue{
    private BlockingQueue<String> queue;

    public BoundedQueueV6_1(int max) {
        this.queue = new ArrayBlockingQueue<>(max);
    }

    @Override
    public void put(String data) {
        try {
            queue.put(data);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String take() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
