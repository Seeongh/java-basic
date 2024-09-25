package poly.basic;

public class CastingMain2 {

    public static void main(String[] args) {
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        Parent poly = new Child() ; //다형적 참조
        //자식메서드 호출 불가
        //poly.childMethod();

        //다운캐스팅(부모 -> 자식)
        Child child = (Child) poly; //강제로 타입을 Child로 변경함.
        child.childMethod();

        ((Child) poly).childMethod(); //연산의 우선순위 때문에 괄호로 감싸줌
    }
}
