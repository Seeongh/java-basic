package access;

public class BandAccessMain {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(10000);
        b.withdraw(4000);
        System.out.println("balance = " + b.getBalance());
    }
}
