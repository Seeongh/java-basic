package lang.immutable.address;

/*
사이드 이펙트 방지
-> 여러변수가 하나의 객체를 공유하는걸 막을 방법이 없음
 */
public class RefMain1_2 {
    private static Address b;

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유
        Address a = new Address("서울");
        Address b = new Address("서울");

        System.out.println("a = " +a.getValue() + "  b = " + b.getValue());
        b.setValue("부산");

        System.out.println("a = " + a.getValue() + " b = " + b.getValue());
    }
}
