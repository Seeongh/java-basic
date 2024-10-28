package nested.local;

import java.lang.reflect.Field;

/**
 * 지역변수의 캡처
 */
public class LocalOuterV3 {

    private int outInstanceVar = 3;

    //paramVar과 localVar은 지역변수로 인스턴스의 생명주기 보다 짧아 process의 스택프레임이 제거되면서 두 변수도 함께 제거된다.
    //하지만 localPrinter은 process가 종료되어도 생존하고있다.

    public Printer process(int paramVar) {
        int localVar = 1; //지역변수는 스택 영역이 종료되는 순간 함께 제거된다.
    //1. 지역변수를 복사해서 인스턴스 영역에 넣어버림(인스턴스에서 캠쳐)
        class LocalPrinter implements Printer {
            int value = 0;
            @Override
            public void print() {

                System.out.println("value"+ value);

                //인스턴스는 지역변수보다 더 오래 살아 남는다.
                System.out.println("localVal+" + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        //printer.print();
        return printer;
    }


    public static void main(String[] args) {
        LocalOuterV3 localouter = new LocalOuterV3();
        Printer printer = localouter.process(2); //이후에 지역변수가 없어짐

        //printer.print() 를 나중에 실행한다. process()스택 프레임이 사라진 이후에 실행
        printer.print();

        System.out.println("필드확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field); //인스턴스 변수 , 캡쳐한 지역변수, 바깥 클래스 주소값도 가지고있음
        }


    }

}


