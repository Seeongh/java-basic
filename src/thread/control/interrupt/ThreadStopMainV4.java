package thread.control.interrupt;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

/**
 * interrupted :
 * 현재 쓰레드가 interrupt 상태이면 true를 반환하고, 해당 쓰레드의 인터럽트 상태를 false로 변경
 * 현재 쓰레드가 interrupt상태가 아니라면 fasle를 반환.
 */
public class ThreadStopMainV4 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(100);
        log("작업 중단 지시 thread.interrupt()");
        thread.interrupt();
        log("work 쓰레드 인터럽트 상태 1= " + thread.isInterrupted());

    }

    static class MyTask implements Runnable {

        @Override
        public void run() {

            while(!Thread.interrupted()) { //interrupt 상태를 변환하지 않음(예외가아님)
                log("작업중");
            }
                log("work thread interrupt 상태 2= " + Thread.currentThread().isInterrupted());
                log("work thread interrupt 상태 2= " + Thread.currentThread().getState()); //runnable

                log("자원정리");
                log("자원종료");

        }
    } 
}
