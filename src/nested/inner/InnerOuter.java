package nested.inner;

import java.sql.SQLOutput;

public class InnerOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    class Inner {
        private int innerInstanceValue =1 ;

        public void print() {
            System.out.println(innerInstanceValue);

            //외부 클래스인스턴스 멤버 접근 가능 private도
            System.out.println(outInstanceValue);

            //외부 클래스 멤버 접근 가능
            System.out.println(outClassValue);
        }

    }
}
