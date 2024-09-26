package poly.basic;

/**
 * instanceof
 */
public class CastingMain6 {

    public static void main(String[] args) {
        Parent p = new Parent();
        call(p);

        Parent p2 = new Child();
        call(p2);

    }

    private static void call(Parent parent) {
        if(parent instanceof Child) { //casting을 하고있음
            //child가 parent를 담을수 있는가
            //instance가 child면
            System.out.println("child 인스턴스가 맞음");
            Child c = (Child)parent;
            c.childMethod();
        } else {
            System.out.println("child 아님");
        }

        //JAVA16이후
        if(parent instanceof Child c) { //변수를 선언한 상태에서 바로 메소드 호출 가능
            c.childMethod();
        }
    }
}
