package thread.control;

import thread.start.HelloRunnable;

import static thread.util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {
        //main thread정보가지고오기
        Thread mainThread = Thread.currentThread();
        log("mainThread = " + mainThread);
        log("mainThread.getId=()" + mainThread.getId()); // jvm 고유 식별자
        log("mainThread.getName=()" + mainThread.getName());
        log("mainThread.getPriority=()" + mainThread.getPriority()); //우선순위가 높을수록 많이 실행됨

        //쓰레드를 그룹화하여 관리
        //보통 부모 쓰레드에 속하게 됨 (새로운 쓰레드를 생성하는 쓰레드)
        log("mainThread.getThreadGroup=()" + mainThread.getThreadGroup());
        log("mainThread.getState=()" + mainThread.getState());

        //MyThread
        Thread myThread = new Thread(new HelloRunnable(), "myThread");
        log("myThread = " + myThread);
        log("myThread.getId=()" + myThread.getId());
        log("myThread.getName=()" + myThread.getName());
        log("myThread.getPriority=()" + myThread.getPriority()); //우선순위가 높을수록 많이 실행됨
        log("myThread.getThreadGroup=()" + myThread.getThreadGroup());
        log("myThread.getState=()" + myThread.getState()); //state new는 생성하고 실행안한거!

    }
}
