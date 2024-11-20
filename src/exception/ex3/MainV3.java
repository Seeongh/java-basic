package exception.ex3;

import exception.ex02.NetworkClientException2;
import exception.ex1.NetworkServiceV1_2;
import exception.ex3.exception.NetworkClientExceptionV3;

import java.util.Scanner;

public class MainV3 {
    public static void main(String[] args) throws NetworkClientExceptionV3 {
        NetworkServiceV3_1 s = new NetworkServiceV3_1();

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
