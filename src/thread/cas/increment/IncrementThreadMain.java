package thread.cas.increment;

import java.util.ArrayList;
import java.util.List;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

/**
 * 원자적 연산
 * 연산이 딱 한번으로 끝나는 경우, 멀티쓰레드 상황의 위험에서 벗어난다( i = 10)
 * 그렇지만 연산이 나눠서 진행되는 경우 위험에 처하게된다( i = i+10)
 */
public class IncrementThreadMain {

    public static final int THREAD_COUNT = 1000;

    public static void main(String[] args) throws InterruptedException {
        //test(new BasicInteger());
        //test(new VolatileInteger()); // volatile 붙여도 똑같음 -> 변수를 메모리에서 바로 읽는다해도 해당 변수를 공유하기떄문에 다르지않음
        /**
         * 원자적 연산이 되지 않았기 때문에 임계영역이 보장되어야함
         */
        //test(new SyncInteger());  //안전한 임계영역
        test(new MyAtomicInteger());  //atomic integer 사용

    }

    private static void test(IncrementInteger incrementInteger) throws InterruptedException {
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                sleep(10); //너무 빨리 실행되기 때문에 다른 스레드와 동시 실행을 위해 잠깐쉰다.
                incrementInteger.increment();
            }
        };


        List<Thread> threads = new ArrayList<>();
        for(int i =0 ; i<THREAD_COUNT; i++) {
            Thread thread = new Thread(runnable);
            threads.add(thread);
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join(); //다 끝날때까지 기다림

        }

        int result = incrementInteger.get();
        log("incrementInteger = " + incrementInteger.getClass().getSimpleName() + " result = " + result) ;

    }
}
