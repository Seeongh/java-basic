package poly.diamondExtends;

/**
 * interface- 다중상속 구현
 */
public class Child  extends ExtendsDiamond implements InterfaceA, InterfaceB{
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

    //굳이 오버라이드 할 필요는 없음
    @Override
    public void methodExtends() {
        System.out.println("child methodExtends");
    }
}
