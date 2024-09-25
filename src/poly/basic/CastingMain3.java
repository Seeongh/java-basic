package poly.basic;

//upcasting, downcasting
public class CastingMain3 {

    public static void main(String[] args) {

        Child child = new Child();
        Parent p = (Parent)child; //업캐스팅은 생략 가능(생략권장)
        Parent p2= child; //업캐스팅 생략

        p.parentMethod();
        //p.childMehotd(); //타입을 기준으로 호출하기 떄문에 호출 불가
        p2.parentMethod();


    }
}
