package generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("Object print = " + obj);
        return obj;
    }

    //제네릭 메서드 선언
    public static <T> T genericMethod(T obj) {
        System.out.println("Object print = " + obj);
        return obj;
    }

    //제네릭 메서드 -타입의 제약
    public static <T extends Number> T numberMethod(T obj) {
        System.out.println("Object print = " + obj);
        return obj;
    }
}
