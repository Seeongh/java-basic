package lang.immutable.address;

public class RefMain1_1 {
    private static Address b;

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유
        Address a = new Address("서울");
        Address b = a;

        System.out.println("a = " +a.getValue() + "  b = " + b.getValue());
        b.setValue("부산");

        System.out.println("a = " + a.getValue() + " b = " + b.getValue());
    }
}
