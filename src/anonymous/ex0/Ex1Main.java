package anonymous.ex0;

import java.util.Random;

public class Ex1Main {

    public static void helloDice() {
        System.out.println("시작");

        int i = new Random().nextInt(6) + 1;
        System.out.println("주사위 : " + i);
        System.out.println("종료");
    }

    public static void helloSum() {
        System.out.println("시작");

        for (int i =0 ; i < 3; i++) {
            System.out.println(" i = " + i);
        }
        System.out.println("종료");
    }


    public static void main(String[] args) {
        helloDice();
        helloSum();
    }
}
