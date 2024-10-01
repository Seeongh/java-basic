package poly.ex.pay1;

import static poly.ex.pay1.PayStore.findPay;

public class PayService {

    private Pay pay;

    public void processPay(String option, int amount) {
        boolean result = false;

        System.out.println("결제를 시작합니다 : option " +  option + " , amount=" + amount);
        pay = PayStore.findPay(option);
            result = pay.pay(amount);

        if(result) {
            System.out.println("결제가 성공했습니다.");
        }
        else {
            System.out.println("결제가 실패했습니다.");
        }
    }
}
