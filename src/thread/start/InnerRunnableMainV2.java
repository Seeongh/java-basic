package thread.start;

import static thread.util.MyLogger.log;

/**
 * runnable을 이 클래스에서만 쓸거같으면
 * 익명 class를 만든다.
 */
public class InnerRunnableMainV2 {
    public static void main(String[] args) {
        log("main() start");

        //익명 class 사용
        Runnable runnable = new Runnable() {

            @Override
            public void run() {
                log("run()");
            }
        };
        
        Thread thread = new Thread(runnable);

        thread.start();
        log("main() end");
    }

}
