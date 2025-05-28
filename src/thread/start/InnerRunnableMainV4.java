package thread.start;

import static thread.util.MyLogger.log;

/**
 * runnable을 이 클래스에서만 쓸거같으면
 * 익명 class를 만든다 -> 람다 버전
 */
public class InnerRunnableMainV4 {
    public static void main(String[] args) {
        log("main() start");
        
        Thread thread = new Thread(() -> log("run()"));

        thread.start();
        log("main() end");
    }

}
