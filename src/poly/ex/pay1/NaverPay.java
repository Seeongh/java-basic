package poly.ex.pay1;

public class NaverPay implements Pay{
    @Override
    public boolean pay(int amount) {
        System.out.println("네이버 페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제르 ㄹ시도합니다.");
        return true;
    }
}
