package thread.volatile1;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {

        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(1000);
        task.flag = false;
        log("flag =" + task.flag +" , count :" + task.count +"in main()");


    }

    static class MyTask implements Runnable {
//        boolean flag = true;
//        long count ;
        
        //성능은 떨어짐
        //메인메모리에서 읽어서 바로 적용됨
        volatile boolean flag = true;
        volatile  long count ;


        @Override
        public void run() {
            while(flag) {
                count++;
                //1억번에 한번 확인
                if(count % 100_000_000  == 0 ) {
                    log("flag =" + flag +" , count :" + count +"in while()"); //false로 바뀐 시점이 다름
                }
            }
            log("flag=" + flag+",cont = " + count+" 종료");
        }
    }
}
