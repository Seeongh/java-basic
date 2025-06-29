package thread.bounded;

import java.util.ArrayList;
import java.util.List;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

/**
 * 생산자/소비자 이슈
 * 생산자 3개 소비자 3개가 동작
 *
 * SYNCRONIZED 의 THREAD 대기
 * 1. 락 획득 하기 위해 대기 (BLOCKED 상태) -> 자바 내부 락 대기 집합에서 관리
 * 2. WAIT() 호출되어 대기(NOTIFY) -> 락 안의 스레드 대기 집합에서 관리
 *
 * 자바는 락, 락대기집합, 스레드 대기 집합이 객체 내부에 생성되어있음
 *
 * Reentrant Lock 의 대기
 * lock 대기 큐가 있음 (WAITING 상태로 대기)
 * Condition 객체 thread 대기 공간에서 WAITING 상태로 대기하다가 signal호출시 빠져나감
 */
public class BoundedMain {
    public static void main(String[] args) {

        //1. queue 생성
        //BoundedQueue queue = new BoundedQueueV1(2); //자원을 낭비
        //BoundedQueue queue = new BoundedQueueV2(2); //while돌면서 sleep으로 대기
        //BoundedQueue queue = new BoundedQueueV3(2); // Object의 wait(), notify()사용
        //BoundedQueue queue = new BoundedQueueV4(2); // ReentrantLock 사용
        //BoundedQueue queue = new BoundedQueueV5(2); // ReentrantLock 사용 - Condition 분리
        //BoundedQueue queue = new BoundedQueueV6_1(2); // ReentrantLock 사용 - Blockingqueue 사용
        //BoundedQueue queue = new BoundedQueueV6_2(2); // ReentrantLock 사용 - 바로 반환(offer,pull)
        //BoundedQueue queue = new BoundedQueueV6_3(2); // ReentrantLock 사용 - 시간대기 후 반환(offer,pull)
        BoundedQueue queue = new BoundedQueueV6_4(2); // ReentrantLock 사용 - 예외반환(add, remove)


        //2. 생t산자, 소비자 실행 순서 선택, 반드시 하나만 선택!
        
        //producerFirst(queue); //생산자 먼저 실행
        consumerFirst(queue); //소비자 먼저 실행
    }

    // 소비자 생성
    private static void startConsumer(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        log("소비자 시작");
        for (int i = 1; i <= 3; i++) {
            Thread consumer = new Thread(new ConsumerTask(queue), "consumer" + i);
            threads.add(consumer);
            consumer.start();
            sleep(100);
        }
    }

    // 쓰레드 상태 출력
    private static void printAllState(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        log("현재상태 출력 , 큐 데이터 : " + queue);
        for (Thread thread : threads) {
            log(thread.getName() +" :" + thread.getState());

        }
    }

    //thread 3개 만듦 생산자
    private static void startProducer(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        log("생산자 시작");
        for (int i = 1; i <=3 ; i++) {
            Thread producer = new Thread(new ProducerTask(queue, "data" + i));
            threads.add(producer);
            producer.start();
            sleep(100);
        }
    }

    private static void producerFirst(BoundedQueue queue) {
        log("==[생산자 먼저 실행] 시작, " + queue.getClass().getSimpleName() +" ===");

        List<Thread> threads  = new ArrayList<>();
        startProducer(queue, threads);
        printAllState(queue, threads);
        startConsumer(queue, threads);
        printAllState(queue, threads);
        log("==[생산자 먼저실행] 종료, " + queue.getClass().getSimpleName() +" ===");
    }


    private static void consumerFirst(BoundedQueue queue) {
        log("==[소비자 먼저 실행] 시작, " + queue.getClass().getSimpleName() +" ===");

        List<Thread> threads  = new ArrayList<>();
        startConsumer(queue, threads);
        printAllState(queue, threads);
        startProducer(queue, threads);
        printAllState(queue, threads);
        log("==[소비자 먼저실행] 종료, " + queue.getClass().getSimpleName() +" ===");
    }

}
