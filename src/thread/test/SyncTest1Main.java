package thread.test;

/**
 * 공유 자원
 * 코드 결과가 20000이 되어야한다.
 * 문제점을 찾아 해결하라
 * 다른 부분 변경하면 안되고 Counter클래스 내부만 수정
 */
public class SyncTest1Main {

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                }
            }
        };

        Thread thread1 =new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("결과 : " + counter.getCount());
    }

    static class Counter{
        private int count = 0;

        public synchronized void increment() {
            count += 1;
        }

        public int getCount() {
            return count ;
        }
    }
}
