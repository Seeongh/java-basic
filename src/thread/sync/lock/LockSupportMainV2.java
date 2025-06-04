package thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

/**
 * parkNanos : 특정 시간 뒤에 깨어남
 * waiting과 같이 interrupt하면 runnable됨
 */
public class LockSupportMainV2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ParkTest(), "THread-1");
        thread1.start();

        //잠시 대기하여 THread-1이 park상태에 빠질 시간을 준다.
        sleep(100); //LockSupport.park(); 를 호출하도록 대기
        log("Thread-1 state: " + thread1.getState()); //TIMED_WAITING

    }

    static class ParkTest implements  Runnable {

        @Override
        public void run() {
            log("park 시작");
            LockSupport.parkNanos(2000_000000); //2초
            log("park 종료, state: " + Thread.currentThread().getState());
            log("인터럽트 상태 :" + Thread.currentThread().isInterrupted());
        }
    }
}
