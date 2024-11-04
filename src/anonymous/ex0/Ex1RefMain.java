package anonymous.ex0;

import java.util.Random;

/**
 * 중복제거 - 메소드
 */
public class Ex1RefMain {
    public static void helloFunction(MethodFnc fnc) {
        System.out.println("시작");
        fnc.exeFunc();
        System.out.println("종료");
    }

    public static void main(String[] args) {
        helloFunction(new MethodFnc() {
            @Override
            public void exeFunc() {
                int i = new Random().nextInt(6) + 1;
                System.out.println("주사위 :" + i);
            }
        });

        helloFunction(new MethodFnc() {
            @Override
            public void exeFunc() {
                for (int i =0 ; i < 3; i++) {
                    System.out.println(" i = " + i);
                }
            }
        });
    }
}
