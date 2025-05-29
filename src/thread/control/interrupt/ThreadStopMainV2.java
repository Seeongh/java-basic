package thread.control.interrupt;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class ThreadStopMainV2 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(4000);
        log("작업 중단 지시 thread.interrupt()");
        thread.interrupt();
        log("work 쓰레드 인터럽트 상태 1= " + thread.isInterrupted());

    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            try {
                while(true) {
                    log("작업 중");
                    Thread.sleep(3000); //이때 터짐 sleep or join 등 interruptexception 이 터짐
                }
            } catch (InterruptedException e) { //이 익셉션이 즉각 터지진않음
                //이 interrupt를 맞아도 runnable이 되어야 밑에 동작을 수행할 수 있음
                log("work thread interrupt 상태 2= " + Thread.currentThread().isInterrupted()); //interrupt 상태는 끝남

                log("interrupt message = " + e.getMessage());
                log("state = " + Thread.currentThread().getState()); //Runnable 상태가 됨
            }
            
            log("자원정리");
            log("자원종료");
        }
    } 
}
