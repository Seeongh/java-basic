package generic.ex1;

/**
 * Object를 사용함으로 중복에러는 개선했으나 문제가 있음
 * 1. 반환 타입이 맞지 않음 *다운캐스팅
 * 2. 잘못된 타입의 인수 전달 문제 (타입안정성이 낮음)
 */
public class BoxMain2 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.set(10) ;
        Object obj = integerBox.get();
        Integer integer = (Integer) obj;
        System.out.println("integer  = " + integer); //Object => Integer 캐스팅

        ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        String str = (String) stringBox.get(); // Object => String 캐스팅

        System.out.println("string = " + str);

        // 잘못된 타입의 인수 전달
        integerBox.set("문자100");
        Integer result = (Integer) integerBox.get();  // String -> Integer  캐스팅 예외
        System.out.println("error = " + result);


    }
}
