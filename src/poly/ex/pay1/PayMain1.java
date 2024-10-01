package poly.ex.pay1;

import java.util.Scanner;

public class PayMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while(true) {
            System.out.println("결제 수단을 입력하세요");
            String payOptions = sc.nextLine();

            if(payOptions.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.println("결제 금액 입력하세요");
            int amount = sc.nextInt();
            sc.nextLine(); //버퍼 뒤에 숫자만 읽어서 \n남을 수 있는 문제 방지

            payService.processPay(payOptions, amount);

        }


    }
}
