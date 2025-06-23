package thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static thread.util.MyLogger.log;

/**
 * concurrent의 BlockingQueue 사용하기
 * BoundedQueueV5와 동일함
 *
 * notEmpty : 소비자 condition
 * notfull : 생산자 condition
 *
 * 큐 찼을떄 선택지
 * 1. 즉시 반환
 * offer() -> 확인하고 큐가 가득 찼으면 false
 * poll() -> 데이터없으면 null반환
 *
 */
public class BoundedQueueV6_2 implements BoundedQueue{
    private BlockingQueue<String> queue;

    public BoundedQueueV6_2(int max) {
        this.queue = new ArrayBlockingQueue<>(max);
    }

    @Override
    public void put(String data) {

        boolean offer = queue.offer(data);
        log("저장 시도 결과 = " + offer);
    }

    @Override
    public String take() {
            return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
