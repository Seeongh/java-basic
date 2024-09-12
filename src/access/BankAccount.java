package access;

public class BankAccount {
    private int balance;

    public BankAccount() {
        this.balance = 0;
    }

    //public 메서드 : deposit
    public void deposit(int amount) {
        if(isAmountValid(amount)) {
            balance += amount;
        }else {
            System.out.println("유효하지 않음");
        }
    }

    public void withdraw(int amount) {
        if(isAmountValid(amount) && balance -amount >=0) {
            balance -= amount;
        }
        else {
            System.out.println("유효하지 않습니다.");
        }
    }

    public int getBalance() {
        return balance;
    }
    private boolean isAmountValid(int amount) { //외부에서 사용하게 된다면 비효율적, 중복코드 발생 등
        return amount > 0 ;
    }
}
