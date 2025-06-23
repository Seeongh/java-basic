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
 * 1. 시간대기
 * offer( data, 시간설정, 시간단위)
 * poll(시간설정, 시간단위)
 */
public class BoundedQueueV6_3 implements BoundedQueue{
    private BlockingQueue<String> queue;

    public BoundedQueueV6_3(int max) {
        this.queue = new ArrayBlockingQueue<>(max);
    }

    @Override
    public void put(String data) {


        try {
            boolean offer = queue.offer(data, 1, TimeUnit.NANOSECONDS);offer = false; //실패를 보려고 nanosec으로 잡음

              log("저장 시도 결과 = " + offer);
        } catch (InterruptedException e) {

            throw new RuntimeException(e);
        }
    }

    @Override
    public String take() {
        try {
            return queue.poll(2,TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
