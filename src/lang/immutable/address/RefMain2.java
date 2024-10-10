package lang.immutable.address;

public class RefMain2 {
    private static Address b;

    public static void main(String[] args) {
        //참조형 변수는 하나의 인스턴스를 공유
        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a;

        System.out.println("a = " +a.getValue() + "  b = " + b.getValue());
       // b.setValue("부산"); // 불편객체라 해당 부분에서 이슈 발생
        b = new ImmutableAddress("부산");

        System.out.println("a = " + a.getValue() + " b = " + b.getValue());
    }
}
