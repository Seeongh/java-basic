package thread.test;

import static thread.util.MyLogger.log;

public class CounterThreadMain {
    public static void main(String[] args) {
        log("start");

        CounterThread th = new CounterThread();
        th.start();

        log("end");
    }
}
