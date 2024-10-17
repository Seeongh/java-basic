package lang.wrapper;

/**
 * 래핑클래스
 * 기본형을 boxing!
 */
public class WrapperClassMain {
    public static void main(String[] args) {
        Integer newInteger = new Integer(10); //없어질 예정, 대신에 valueOf를 사용
        Integer i = Integer.valueOf(10); //-128~ 127 자주 사용하는 숫자 값 재사용, 불변
        Long longObj = Long.valueOf(100);
        Double doubleObj = Double.valueOf(0.5);

        System.out.println(newInteger.toString()); //오버라이딩
        System.out.println(i.intValue());
        System.out.println(longObj.longValue());

        System.out.println(newInteger == i); //false
        System.out.println(newInteger.equals(i)); //true
    }
}
