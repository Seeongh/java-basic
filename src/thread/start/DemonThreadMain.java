package thread.start;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * 사용자 쓰레드 : 일반 쓰레드, 사용중인 쓰레드가 없으면 자바를 종료한다.
 * 데몬 쓰레드 : 파일정리와 같은 업무리 처리하는 쓰레드로 사용자쓰레드가 종료되면 자바 종료와함께 종료된다. (보조적 역할)
 */
public class DemonThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()  + " : main start");

        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); //해당 쓰레드를 데몬 쓰레드로 설정
        daemonThread.start(); // 데몬 쓰레드라서 main 쓰레드 (사용자 쓰레드) 다 끝나면 종료됨
        System.out.println(Thread.currentThread().getName()  + " : main end");
    }

    static class DaemonThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run() daemon thread");

            try {
                Thread.sleep(10000); // 밖으로 던질 수 없음 (throw가안됨)
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() +": run() daemon end"); //main 쓰레드가 종료되기 때문에 실행되지 않음

        }
    }
}
