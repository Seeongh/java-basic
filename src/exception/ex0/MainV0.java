package exception.ex0;

import java.util.Scanner;

public class MainV0 {
    public static void main(String[] args) {
        NetworkServiceV0 s = new NetworkServiceV0();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("전송할 문자");
            String str = sc.nextLine();

            if(str.equals("exit")) {
                break;
            }

            s.sendMessage(str);
            System.out.println();
        }

        System.out.println("프로그램 종료");
    }
}
