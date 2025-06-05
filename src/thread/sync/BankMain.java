package thread.sync;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

/**
 * SYNCHRONIZED
 * 모든 인스턴스는 내부에 자신만의 lock을 가지고 있음(모니터 락)
 * 쓰레드가 sync 키워드가 있는 메서드에 진입ㅈ하려면 반드시 해당 인스턴스의 락이 있어야함. (bankaccount 의 락을 가져야함)
 * 먼저 사용하는 쓰레드가 락을 가지고감!
 * 그럼 두번쨰 쓰레드는 락을 획득할수없어 기다리게됨(BLOCKED 상태로 무한정 대기 -> CPU 실행 스케줄링에 들어가지않음)
 * 첫번째 쓰레드가 락을 반환하면
 * 두번째 쓰레드가 기다렸던 락을 획득해서 코드를 실행
 *
 *락 획득 순서는 보장되지않음. 나머지는 다 BLOCKED
 * VOLATILE 를 사용하지 않아도 synchronized 안에서 접근하는 메모리 가시성 문제는 해결됨
 */
public class BankMain {
    public static void main(String[] args) throws InterruptedException {
        //BankAccount account = new BankAccountV1(100000); //10만원 입금 -> 공유 자원
        //BankAccount account = new BankAccountV2(100000); //10만원 입금 -> 공유 자원
        //BankAccount account = new BankAccountV3(100000); //10만원 입금 -> 공유 자원
        //BankAccount account = new BankAccountV4(100000); //ReentrantLock
        //BankAccount account = new BankAccountV5(100000); //ReentrantLock - tryLock()
        BankAccount account = new BankAccountV6(100000); //ReentrantLock - tryLock(ms)


        /**
         * 10만원 넣어놓고 7만원씩 2번 뺄 수 없을까?
         */
        Thread t1 = new Thread(new WithdrawTask(account, 70000), "t1");
        Thread t2 = new Thread(new WithdrawTask(account, 70000), "t2");

        t1.start();
        t2.start();

        sleep(500);

        log("t1 쓰레드 상태:" + t1.getState());
        log("t2 쓰레드 상태:" + t2.getState()); //TimedWaiting 이후 진입 실패 0.5초 대기 후
        t1.join();
        t2.join();
        log("Main 쓰레드 종료 남은 잔액 :" + account.getBalance());
    }
}
