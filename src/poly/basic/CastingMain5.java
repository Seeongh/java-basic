package poly.basic;

/**
 * instanceof
 */
public class CastingMain5 {

    public static void main(String[] args) {
        Parent p = new Parent();
        call(p);

        Parent p2 = new Child();
        call(p2);

    }

    private static void call(Parent parent) {
        if(parent instanceof Child) {
            //child가 parent를 담을수 있는가
            //instance가 child면
            System.out.println("child 인스턴스가 맞음");
            ((Child) parent).childMethod();
        } else {
            System.out.println("child 아님");
        }
    }
}
