package thread.volatile1;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class VolatileFlagMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        log("runFlag = " + task.runFlag);
        t.start();

        sleep(1000);
        log("runFlag false로 변경시도") ;
        task.runFlag = false;
        log("main thread종료");
    }

    static class MyTask implements  Runnable{
        //boolean runFlag = true;
        volatile boolean runFlag = true; //main memory 에서 바로 읽어옴 (속도는 좀 줄어듦)
        //여러쓰레드에서 값을 공유해야하는 경우 사용함

        /**
         * 중간에 캐시 메모리를 활용함
         * 캐시 메모리 : cpu 에 가까이 붙어 빠른 메모리 (비쌈)
         * 효율적으로 처리하려고 캐시메모리가 runFlag를 불러옴
         * 캐시메모리의 runFlag값이 false로 바뀜 (메인메모리에 즉각 반영 x)
         * 메인메모리에 반영시점은 알 수 없음 (메모리 가시성)
         * 반영한다해도 runFlag를 다시 불러와야함
         * 보통 컨텍스트 스위칭할때 캐시 메모리를 비워주려고 하면서 갱신됨
         */
        //volatile boolean runFlag = true;

        @Override
        public void run() {
            log("task 시작");
            while(runFlag) {
                //runFlag 가 false면 탈출
                //먼가 출력을하면 context switching이 일어남
            }
            log("task 종료");
        }
    }
}
