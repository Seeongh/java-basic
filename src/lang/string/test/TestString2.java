package lang.string.test;

/**
 * length를 사요애 arr배열의 모든 문자열 길이 합 구하기
 */
public class TestString2{
    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        StringBuilder sb = new StringBuilder();
        String result = "";

        for (String s : arr) {
            sb.append(s);
        }

        result = sb.toString();

        System.out.println("result length = " + result.length());

    }
}
