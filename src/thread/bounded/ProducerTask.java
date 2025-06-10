package thread.bounded;

import static thread.util.MyLogger.log;

/**
 * 버퍼(queue)를 채우는 생산자
 */

public class ProducerTask implements Runnable{

    private BoundedQueue queue; //어떤 큐에
    private String request; //어떤 데이터

    public ProducerTask(BoundedQueue queue, String request) {
        this.queue = queue;
        this.request = request;
    }

    @Override
    public void run() {
        log("[생산 시도] " + request +" ->" + queue);
        queue.put(request);
        log("[생산 완료] " + request +" ->" + queue);
    }
}
