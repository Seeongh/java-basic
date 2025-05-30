package thread.sync;

import static thread.util.MyLogger.log;
import static thread.util.ThreadUtils.sleep;

/**
 * 임계영역인 withdraw를 한번에 한 쓰레드만 하도록 synchronized를 씀
 * syncronized는 인스턴스에 붙기떄문에
 * 쓰레드 하나가 withdraw에 붙어도 getBalance도 호출 못함
 */
public class BankAccountV2 implements BankAccount{

    private int balance; //잔고 : volatile 도 해결을 못해줌

    //생성하면 돈이 들어옴
    public BankAccountV2(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public synchronized boolean withdraw(int amount) {
        log("거래시작: " + getClass().getSimpleName());
        //잔고가 출금액 보다 적으면 false
        log("[검증시작] 출금액 : " + amount +" , 잔액:" + balance);
        if(balance < amount) {
            log("[검증실패] 출금액 : " + amount +" , 잔액:" + balance);
            return false;
        }
        log("[검증완료] 출금액 : " + amount +" , 잔액:" + balance);

        sleep(1000); //출금에 소요되는 시간으로 가정
        balance-=amount;

        log("[출금 완료] 출금액 : " + amount +" , 잔액:" + balance);
        //잔고가 출금액 보다 많으면 true
        log("거래 종료");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
