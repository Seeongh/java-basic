package access;

import nested.local.Printer;

import java.lang.reflect.Field;

/**
 * 익명클래스
 * 이름이 없는 지역클래스를 선언하면서 동시에 생성(상속받거나 구현해야함)
 * 즉석구현을 통해 간결해짐
 * 단 한번만 인스턴스 생성 가능
 */
public class AnonymousOuter {

    private int outInstanceVar = 3;
    public void process(final int paramVar) {
        int localVar = 1;

        Printer printer = new Printer(){ //인터페이스를 구현하면서 new로 생성(익명클래스)

            int value = 0;
            @Override
            public void print() {

                System.out.println("value"+ value);

                //인스턴스는 지역변수보다 더 오래 살아 남는다.
                System.out.println("localVal+" + localVar);
                System.out.println("paramVar = " + paramVar);
             }

        };

        printer.print();
        System.out.println("printer class= " + printer.getClass());
    }


    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2); //$1  익명클래스는 이름이 없음

    }

}


