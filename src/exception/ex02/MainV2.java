package exception.ex02;

import exception.ex1.NetworkServiceV1_2;

import java.util.Scanner;

public class MainV2 {
    public static void main(String[] args) throws NetworkClientException2 {
        NetworkServiceV1_2 s = new NetworkServiceV1_2();

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
