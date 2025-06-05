package thread.sync;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

/**
 * ReenterantLock 사용
 * tryLock(ms)
 */
public class BankAccountV6 implements BankAccount{

    private int balance; //잔고 : volatile 도 해결을 못해줌
    private final Lock lock = new ReentrantLock();

    //생성하면 돈이 들어옴
    public BankAccountV6(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public  boolean withdraw(int amount) {
        log("Reentrant Lock 거래시작: " + getClass().getSimpleName());
        //==임계영역 시작==
        //잔고가 출금액 보다 적으면 false

        try {
            if(!lock.tryLock(500, TimeUnit.MILLISECONDS)) { //0.5초 대기 하면서 확인
                log("[진입실패] 이미 처리중인작업");
                return false;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        try { //waiting에 빠진 thread를 unlock해줘야함
            log("[검증시작] 출금액 : " + amount +" , 잔액:" + balance);
            if(balance < amount) {
                log("[검증실패] 출금액 : " + amount +" , 잔액:" + balance);
                return false;
            }
            log("[검증완료] 출금액 : " + amount +" , 잔액:" + balance);

            sleep(1000); //출금에 소요되는 시간으로 가정
            balance-=amount;

            log("[출금 완료] 출금액 : " + amount +" , 잔액:" + balance);
        }finally{

            //예외가 터지더라도 무조건 수행되어야함
            //계속 thread가 waiting 상태로 대기할 수 있는 위험
            lock.unlock();
        }

        
        //==임계영역 종료==
        //잔고가 출금액 보다 많으면 true
        log("거래 종료");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
