package poly.ex.pay1;

public abstract class PayStore { //생성 불가

    public static Pay findPay(String Option) { //그냥 불러다 쓰라고 Pay를 만듦
        if (Option.equals("kakao")) {
            return  new KakaoPay();
        }else if (Option.equals("naver")) {
            return new NaverPay();
        }else if (Option.equals("new")) {
            return new NewPay();
        }
        else {
            return new DefaultPay();
        }
    }
}
