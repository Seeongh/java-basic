package nested.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        NestedOuter outer = new NestedOuter();

        //내부 클래스를 이렇게 생성할 수 있다.
        NestedOuter.Nested nested = new NestedOuter.Nested();

        nested.print();

        System.out.println("nestedClass = " + nested.getClass());
    }
}
