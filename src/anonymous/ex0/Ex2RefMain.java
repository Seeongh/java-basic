package anonymous.ex0;

import java.util.Random;

/**
 * 중복제거 - 지역클래스 넘겨보기
 */
public class Ex2RefMain {
    public static void helloFunction(MethodFnc fnc) {
        System.out.println("시작");
        fnc.exeFunc();
        System.out.println("종료");
    }

    public static void main(String[] args) {
        class dice implements MethodFnc {
            @Override
            public void exeFunc() {
                int i = new Random().nextInt(6) + 1;
                System.out.println("주사위 :" + i);
            }
        }
        helloFunction(new dice());


        class sum implements MethodFnc {

            @Override
            public void exeFunc() {
                for(int i =0 ; i < 3; i++) {
                    System.out.println(i);
                }
            }
        }

        helloFunction(new sum());
    }
}
