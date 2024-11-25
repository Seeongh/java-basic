package exception.ex4;


import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {
    public static void main(String[] args) {
        NetworkServiceV4 s = new NetworkServiceV4();

        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("전송할 문자");
            String str = sc.nextLine();

            if(str.equals("exit")) {
                break;
            }

            try{
                s.sendMessage(str);
            }
            catch(Exception e) {

                exceptionHandler(e);
            }

            System.out.println();
        }

        System.out.println("프로그램 종료");
    }

    //공통 예외 로직
    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메세지 : " +  e.getMessage());
        //e.printStackTrace();
        e.printStackTrace(System.out); // System.error : 흐름이 다름

        //별도 예외추가
        if( e instanceof SendExceptionV4 sendEx) {
            System.out.println("전송 데이터 : " + sendEx);
        }
    }
}
