package poly.diamondExtends;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

        ExtendsDiamond e = new Child(); // child에서 오버라이딩 안했을때는 부모꺼 출력  - 오버라이딩 시에는 자식클래스 출력
        e.methodExtends();
    }
}
