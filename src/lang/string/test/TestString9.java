package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String[] split = email.split("@");

        System.out.println(split[0] + " , " + split[1]);
    }
}
