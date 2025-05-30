package thread.sync;

import static thread.util.MyLogger.log;

public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        BankAccount account = new BankAccountV1(100000); //10만원 입금 -> 공유 자원

        /**
         * 10만원 넣어놓고 7만원씩 2번 뺄 수 없을까?
         */
        Thread t1 = new Thread(new WithdrawTask(account, 70000), "t1");
        Thread t2 = new Thread(new WithdrawTask(account, 70000), "t2");


        t1.start();
        t2.start();

        t1.join();
        t2.join();
        log("Main 쓰레드 종료 남은 잔액 :" + account.getBalance());
    }
}
