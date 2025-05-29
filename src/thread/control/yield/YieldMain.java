package thread.control.yield;

import static thread.util.ThreadUtils.sleep;

/**
 * 내 쓰레드가 좀 한가하면 다른 쓰레드에게 cpu 를 양보하는 yield
 */
public class YieldMain {

    static final int THREAD_COUNT = 1000;
    public static void main(String[] args) {

        for (int i = 0; i < THREAD_COUNT; i++) {
            Thread thread = new Thread(new myRunnable());
            thread.start();

        }
    }


    static class myRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName()+" -" + i);
                //empty //그래도 거의 하나의 쓰레드가 뭉쳐있는 결과 보통 0.01 초에 쓰레드를 바뀌는데 그중에 10개는 찍을수있어서
                //sleep(1); //쓰레드들이 서로 왔다갔다하는 결과 :state는 timed_waiting , 양보할게없는데 불필요하게 양보
                //Thread.yield(); //thread runnable은 유지하되 cpu 실행하는 queue에서 빠져서 다시 queue로 들어감
                /**
                 * Runnable의 2상태
                 * 1. 실행상태 : 실제실행중
                 * 2. 실행 대기 상태 : cpu 가 바빠서 스케줄링 큐에서 대기중
                 * yield는 실행대기로 만들었다가 실행하는 형태 즉 Runnable을 유지(Running->Ready)
                 */
                
            }
        }
    }

}
