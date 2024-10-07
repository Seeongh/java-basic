package Object.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car c = new Car("model Y");
        Dog d1 = new Dog("멍1", 2);
        Dog d2 = new Dog("멍2", 5);

        System.out.println("단순 호출");
        System.out.println(c.toString());
        System.out.println(d1.toString());
        System.out.println(d2.toString());

        System.out.println("println 내부에서 toString호출");
        System.out.println(c);
        System.out.println(d1); //오버라이딩
        System.out.println(d2);

        System.out.println("Ojbect 다형성 활용");
        ObjectPrinter.print(c);
        ObjectPrinter.print(d1);
        ObjectPrinter.print(d2);

        Integer.toHexString(System.identityHashCode(d1)); //hash 주소 값 출력
    }
}
