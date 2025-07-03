package thread.collection.simple;

import static thread.util.MyLogger.log;

/**
 * 동시에 proxy 를 통한 add와 그냥 add에 접근했을때 동작
 * 예상 결과 : 임계영역이 지켜지지 않을것같음.
 */
public class MyTestMain {
    public static void main(String[] args) throws InterruptedException {

        SimpleList syncProxyList = new SyncProxyList(new BasicList()); //프록시 접근
        SimpleList basicList = new BasicList(); //직접 접근

        Thread thread1 = new Thread(new MyTestRunnable(syncProxyList, 1));
        Thread thread2 = new Thread(new MyTestRunnable(basicList, 2));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        log("proxy result = " + syncProxyList.toString());
        log("basic result = " + syncProxyList.toString());
    }
}
