package poly.basic;

public class PolyMain {
    public static void main(String[] args) {
        //부모변수가 부모 인스턴스 참조
        System.out.println("parent -> parent");

        Parent p = new Parent();
        p.parentMethod();

        //자식이 자식 인스턴스 참조
        System.out.println("child -> child");
        Child c = new Child();
        c.parentMethod(); //상속받은 메서드
        c.childMethod();

        //부모변수가 자식 참조
        System.out.println("parent -> child");
        Parent poly = new Child();
        poly.parentMethod();
        // poly.childMethod(); //호출 불가

        //Child newPoly = new Parent(); //자식은 부모를 담을 수 없음


    }
}
