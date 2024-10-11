package lang.string.test;

/**
 * str에서 hello와 .txt 문자열 분리
 */
public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int midIndex = str.indexOf(".txt");
        System.out.println("filename = " + str.substring(0,midIndex));
        System.out.println("extName = " + str.substring(midIndex));
    }
}
