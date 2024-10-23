package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // 새로 만든 이너는 참조를 통해 만들어줌

        inner.print();
        System.out.println("innerClass = " + inner.getClass());
    }
}
