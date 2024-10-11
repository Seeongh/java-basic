package lang.string.method;

public class StringUtilsMain1 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();

        String str = "Hello, java!";

        //valueOF메서드
        String numString =String.valueOf(num);
        String boolString = String.valueOf(bool);
        String objString = String.valueOf(obj); //toString

        String numString2 = ""+ num; //문자 + 숫자 = 문자

        //toCharArray메서드
        char[] strArray= str.toCharArray();
        for (char c : strArray) {
            System.out.print(c);
        }

    }
}
