package poly.ex.pay1;

public class NewPay implements  Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("새로운 시스템");
        return true;
    }
}
