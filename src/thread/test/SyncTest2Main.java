package thread.test;

import static thread.util.MyLogger.log;

/**
 * myTask run()은 두 스레드에서 동시에 실행되는데
 * 결과를 예측하고
 * localValue지역변수에 동시성 문제가 발생하는지 아닌지 생각해보기
 */
public class SyncTest2Main {
    public static void main(String[] args) {
        MyCounter myCounter = new MyCounter();

        Runnable task = new Runnable() {

            @Override
            public void run() {
                myCounter.count();
            }
        };

        Thread thread1 = new Thread(task,"Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");

        thread1.start();
        thread2.start();


    }

    public static class MyCounter{

        public void count(){ //synchronized 넣으면 성능만 드려짐
            int localValue = 0; //스택영역은 각자의 영역에 생성됨 지역변수는 스택영역에 할당(공유x)
            for (int i = 0; i < 1000; i++) {
                localValue = localValue +1 ;
            }
            log("결과 : " + localValue);

        }
    }
}
