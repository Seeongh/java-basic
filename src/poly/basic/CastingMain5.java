package poly.basic;

/**
 * instanceof
 */
public class CastingMain5 {

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();
        call(p);

        Parent p2 = new Child();
        call(p2);

    }

    private static void call(Parent parent) {
        if(parent instanceof Child) {
            //instance가 child면
            System.out.println("child 인스턴스가 맞음");
            ((Child) parent).childMethod();
        } else {
            System.out.println("child 아님");
        }
    }
}
