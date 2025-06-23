package thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static thread.util.MyLogger.log;

/**
 * concurrent의 BlockingQueue 사용하기
 * BoundedQueueV5와 동일함
 *
 * notEmpty : 소비자 condition
 * notfull : 생산자 condition
 *
 * 큐 찼을떄 선택지
 * 3. 예외 반환
 * add()
 * remove()
 */
public class BoundedQueueV6_4 implements BoundedQueue{
    private BlockingQueue<String> queue;

    public BoundedQueueV6_4(int max) {
        this.queue = new ArrayBlockingQueue<>(max);
    }

    @Override
    public void put(String data) {

        queue.add(data); //java.lang.IllegalStateException 예외 - queue full
    }

    @Override
    public String take() {
        return queue.remove(); //java.util.NoSuchElementException
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
