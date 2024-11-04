package anonymous.ex0;

/**
 * 중복 제거와 효율성의 핵심은 변하는 부분을 분리하여 재사용
 */
public class Ex2RefMain {
    public static void hello(String helloStr) {
        System.out.println("시작");
        System.out.println(helloStr);
        System.out.println("종료");
    }

    public static void main(String[] args) {
        hello("java");
        hello("spring");

    }
}
