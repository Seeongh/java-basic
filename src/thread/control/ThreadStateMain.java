package thread.control;

import static thread.util.MyLogger.log;

/**
 * new : 쓰레드가 생성되고 시작되진 않았다
 * runnable : 실행될 준비가 됨(start()상태에서)-> 운영체제 스케줄러 따라서 대기열에 있다가 차례로 실행됨
 * block : 동기화락을 얻기위해 기다리는 상태
 * waiting : wait이나 join 호출시 이상태가 됨
 * Timed waiting : 시간 제한이 있는 대기 상태
 * Terminated : 실행 완료(thread stack frame이 빔)
 */

public class ThreadStateMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "myThread");
        log("myTHread.state1 = " +thread.getState()); //new

        thread.start();
        Thread.sleep(1000); //이 sleep으로 현재 main thread를 sleep해야 mythread가 sleep까지 갈 확률이 높음
        log("myThread.state3 =" + thread.getState()); //timed_waiting

        Thread.sleep(4000);
        log("myTremad.state4=" + thread.getState()); //Terminated
    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {

            try {
                log("start" );
                log("myThread.state2 = " + Thread.currentThread().getState()); //runnable

                log("sleep() start");
                Thread.sleep(3000);

                log("sleep()end");
                log("myThread.state2 = " + Thread.currentThread().getState()); //RUNNABLE
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
