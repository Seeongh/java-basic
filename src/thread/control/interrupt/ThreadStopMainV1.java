package thread.control.interrupt;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class ThreadStopMainV1 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(4000);
        log("작업 중단 지시 runflag");
        task.runFlag = false; //즉각 반응하지 않음.

    }

    static class MyTask implements Runnable {

        volatile boolean runFlag = true; //여러쓰레드에서 공유하는 자원
        
        @Override
        public void run() {
            while(runFlag) {
                log("작업 중");
                sleep(3000); //이걸 기다려야하기때문에 3초동안 쓰레드가 잠들수밖에 없음
            }
            
            log("자원정리");
            log("자원종료");
        }
    } 
}
