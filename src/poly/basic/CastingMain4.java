package poly.basic;

/**
 * 다운 캐스팅의 문제점
 */
public class CastingMain4 {

    public static void main(String[] args) {
        Parent p = new Child();
        Child c = (Child) p;
        c.childMethod();

        Parent p2 = new Parent();
        Child c2 = (Child)p2; //Child가 생성이 안됐는데 child의 메소드를 호출함
        c2.childMethod();    //실행 불가
    }
}
