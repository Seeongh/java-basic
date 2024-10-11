package lang.string;

/**
 * String 불변객체
 * final 로 선언되어있기 때문에 메서드를 사용하면 무조건 다른 객체를 return 한다.
 */
public class StringImmutable2 {
    public static void main(String[] args) {
        String str = "hello" ;
        String str2 = str.concat("java");

        System.out.println("str = " + str2); //문자열 연결하기


    }
}
