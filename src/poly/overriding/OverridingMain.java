package poly.overriding;

public class OverridingMain {

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println("child -> c");
        System.out.println("c value = " + c.value);
        c.parentMethod();

        Parent p = new Parent();
        System.out.println("parent -> p");
        System.out.println("p value = " + p.value);
        p.parentMethod();

        //부모가 자식 참조
        Parent pc = new Child();
        System.out.println("p->c");
        System.out.println("value= " + pc.value);
        pc.parentMethod(); //parent 가 나와야하는데 child가 나옴(오버라이딩)
        //-> 오버라이딩 메소드는 우선순위를 갖음

    }
}
