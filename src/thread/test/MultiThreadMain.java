package thread.test;

import static thread.util.MyLogger.log;

public class MultiThreadMain {
    public static void main(String[] args) {
        //한클래스로 만들어서 thread를 두개 만들면 됐던 문제임
//        Thread A = new Thread(() -> {
//            while(true) {
//                log("A");
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }, "Thread-A");
//
//        Thread B = new Thread(() -> {
//            while(true){
//
//                log("B");
//                try {
//                    Thread.sleep(500);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//            }
//        }, "Thread-B");

        MultiClass A = new MultiClass("A", 1000);
        MultiClass B = new MultiClass("B", 500);


        Thread th1 = new Thread(A, "Thread-A");
        Thread th2 = new Thread(B, "Thread-B") ;

        th1.start();
        th2.start();

    }

    public static class MultiClass implements Runnable {

        private String str ;
        private int time;
        public  MultiClass(String str, int time) {
            this.str = str;
            this.time = time;

        }
        @Override
        public void run() {
            while(true) {
                log(this.str);
                try {
                    Thread.sleep(this.time);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }
}
