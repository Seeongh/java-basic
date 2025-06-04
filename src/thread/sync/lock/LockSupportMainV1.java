package thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class LockSupportMainV1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ParkTest(), "THread-1");
        thread1.start();

        //잠시 대기하여 THread-1이 park상태에 빠질 시간을 준다.
        sleep(100); //LockSupport.park(); 를 호출하도록 대기
        log("Thread-1 state: " + thread1.getState()); //WAITING

        log("main-> unpark(THread-1)");
        LockSupport.unpark(thread1); // unpart사용(대상쓰레드 지정)
        //대기상태의 쓰레드는 코드를 호출할 수 없어서 외부에서 다른 쓰레드를 지정해야함

        //thread1.interrupt();; //interrrupt 사용 -> WAITING 상태의 THREAD는 INTERRUPT를 걸면 RUNNABLE이된다.
        log("Thread-1 state: " + thread1.getState());
    }

    static class ParkTest implements  Runnable {

        @Override
        public void run() {
            log("park 시작");
            LockSupport.park(); //이 코드를 호출한 thread는 RUNNABLE->WAITING 이됨
            log("park 종료, state: " + Thread.currentThread().getState());
            log("인터럽트 상태 :" + Thread.currentThread().isInterrupted());
        }
    }
}
