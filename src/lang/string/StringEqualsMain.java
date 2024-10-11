package lang.string;

public class StringEqualsMain {
    public static void main(String[] args) {
        String str = new String("hello");
        String str2 = new String("hello");
        System.out.println("메서드 호출 비교 1 =" + isSame(str,str2) );

        String str3= "hello";
        String str4= "hello";

        System.out.println("메서드 호출 비교 2= " + isSame(str3,str4));
    }

    private static boolean isSame(String x, String y) {
       // return x ==y;
        return x.equals(y); //뭐가 들어올지 모르기때문에 항상 equlas로 동등성 비교를 한다.
    }
}
