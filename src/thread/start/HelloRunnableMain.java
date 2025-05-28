package thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " : main start");

        /**
         * Thread보다 Runnable을 사용하는 이유
         * runnable을 이용해서 작업과 쓰레드를 분리함(가독성)
         * 단일 상속을 원칙으로 하기때문에 Thread를 상속받으면 다른 클래스를 상속받기 어려움
         */
        HelloRunnable runnable = new HelloRunnable();
        Thread th = new Thread(runnable); //runnable을 받는 Thread 객체
        th.start();


        System.out.println(Thread.currentThread().getName() + " : main end");
    }
}
