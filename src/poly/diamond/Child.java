package poly.diamond;

import java.sql.SQLOutput;

/**
 * interface- 다중상속 구현
 */
public class Child implements InterfaceA, InterfaceB{
    @Override
    public void methodA() {
        System.out.println("child methodA");
    }

    @Override
    public void methodB() {
        System.out.println("child methodB");
    }

    @Override
    public void methodCommon() {
        System.out.println("common");
    }
}
