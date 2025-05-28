package thread.test;

import static thread.util.MyLogger.log;

public class CounterRunnable {
    public static void main(String[] args) {
        //inner class 로 돌리기
//        CRunnable cb = new CRunnable();
//        Thread th = new Thread(cb);

        //ramda로 돌리기
        Thread th = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {

                log("value : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        th.start();
    }

    public static class  CRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {

                log("value : " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
