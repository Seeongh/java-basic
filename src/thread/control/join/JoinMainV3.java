package thread.control.join;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class JoinMainV3 {
    public static void main(String[] args) throws InterruptedException {
        log("start");
        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);
        Thread thread1 = new Thread(task1, "thread-1");
        Thread thread2 = new Thread(task2, "thread-2");

        thread1.start();
        thread2.start();

        /**
         * 쓰레드가 종료될 때까지 대기
         * 예외를 우선 밖으로 던짐
         *
         */

        log("join() - main 쓰레드가 thread1, thread2 종료까지 대기");

        thread1.join(); //main 쓰레드는 waiting 상태가 됨 , 대상이 terminated까지 대기
        thread2.join();
        log("main 쓰레드 대기완료");

        log("task1.result = " + task1.result);
        log("task2.result = " + task2.result);

        int sumAll = task1.result + task2.result;
        log("task1+task2=" + sumAll);

        log("end");
    }

    static class SumTask implements Runnable {

        int startValue;
        int endValue;
        int result;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작") ;
            sleep(2000); //복잡한 계산으로 가정

            int sum = 0 ;
            for (int i = startValue; i <= endValue; i++) {
                sum += i;
            }
            result = sum;
            log("작업완료 : " + result);
        }
    }
}
