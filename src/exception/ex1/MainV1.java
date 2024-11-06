package exception.ex1;

import exception.ex1.NetworkServiceV1_1;

import java.util.Scanner;

public class MainV1 {
    public static void main(String[] args) {
        NetworkServiceV1_1 s = new NetworkServiceV1_1();

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
