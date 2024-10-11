package lang.string.test;

/**
 * string이 "http://"로 시작하는지 확인
 */
public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";

        boolean result = url.startsWith("https://");
        System.out.println("Result = " + result);
    }
}
