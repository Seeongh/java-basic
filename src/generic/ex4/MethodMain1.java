package generic.ex4;

/**
 * 메서드 제네릭
 * 메서드를 호출하는 시점에 결정하고 호출
 * static 메서드는 사용할 수 없다. (객체 생성하는 시점에 정해지기 때문에)
 */
public class MethodMain1 {

    public static void main(String[] args) {
        Integer i = 10;
        Object object = GenericMethod.objMethod(i);

        //타입 인자(Type Argument)명시적 전달
        System.out.println("명시적 전달");

        Integer result = GenericMethod.<Integer>genericMethod(i);

        //<타입> 없어도 넘기는 매개변수로 추론이 가능하다.
        Integer result1 = GenericMethod.genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double v = GenericMethod.<Double>numberMethod(20.0);
    }
}
