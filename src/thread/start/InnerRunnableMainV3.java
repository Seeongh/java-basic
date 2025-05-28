package thread.start;

import static thread.util.MyLogger.log;

/**
 * runnable을 이 클래스에서만 쓸거같으면
 * 익명 class를 만든다 -> 변수없이 바로 전달하는 버전
 */
public class InnerRunnableMainV3 {
    public static void main(String[] args) {
        log("main() start");
        
        Thread thread = new Thread(new Runnable() {

            @Override
            public void run() {
                log("run()");
            }
        });

        thread.start();
        log("main() end");
    }

}
