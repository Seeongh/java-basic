package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        //format 메서드
        String format = String.format("num : %d, bool : %b, str : %s", num, bool, str);
        System.out.println("포맷 : " + format);

        String format1 = String.format("숫자: %.2f", 10.1234);
        System.out.println("포맷 소숫점 두자리 : " + format1);

        //정규싟

        String regex ="Hello, (Java!|World)"; //java나 word가 들어오는지
        System.out.println("패턴 일치 여부 : " + str.matches(regex));
    }
}
