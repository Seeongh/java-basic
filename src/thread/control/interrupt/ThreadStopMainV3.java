package thread.control.interrupt;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

/**
 * interruptException 을 터뜨리는 이유는 상태값을 다시 runnable로 돌려야
 * 이후에 exception 이 예상치 못하게 터뜨리는걸 방지하고 처리할 수 있음.
 */
public class ThreadStopMainV3 {
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

            while(!Thread.currentThread().isInterrupted()) { //interrupt 상태를 변환하지 않음(예외가아님)
                log("작업중");
            }
                log("work thread interrupt 상태 2= " + Thread.currentThread().isInterrupted()); //interrupt 상태는 끝남

                log("자원정리");
                log("자원종료");

        }
    } 
}
