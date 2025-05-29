package thread.control.join;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

/**
 * 멀티 쓰레드에서 main 이 다른 쓰레드 종료시까지 기다리지않음
 */
public class JoinMainV0 {
    public static void main(String[] args) {
        log("start");

        Thread thread1 = new Thread(new Job(), "thread-1");
        Thread thread2 = new Thread(new Job(), "thread-2");

        thread1.start();
        thread2.start();

        log("end"); //main은 thread-1/2 실행되는거 기다리지 않음
    }

    static class Job implements Runnable {

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000); //timed_waiting state
            log("작업 끝");
        }
    }
}
