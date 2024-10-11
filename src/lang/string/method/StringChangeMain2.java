package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String strWithSpace = "       Java Programing " ;

        System.out.println("소문자로 변환 : " + strWithSpace.toLowerCase());
        System.out.println("대문자로 변환 : " +  strWithSpace.toUpperCase());
        System.out.println("공백 제거 : " + strWithSpace.trim()+ "'");
        System.out.println("공백 제거 : " + strWithSpace.strip()+"'"); //unicode까지 제거
        System.out.println("앞뒤 공백제거 : " + strWithSpace.stripTrailing());
    }
}
