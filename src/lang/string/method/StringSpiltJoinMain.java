package lang.string.method;

import java.sql.SQLOutput;

public class StringSpiltJoinMain {
    public static void main(String[] args) {
        String str ="Apple,Banana,Orange";

        //split
        String[] split = str.split(".");
        for (String s : split) {
            System.out.println(s);
        }

        //join
        //그냥 합치기
        String joinStr = "";

        for (String s : split) {
            joinStr += s +"-" ; //마지막에 붙는 - 빼는게 또 복잡

        }

        ///join 사용
        String joinedStr = String.join("-", "A","B","C");
        System.out.println("연결 문자열 : " + joinedStr);

        String result = String.join("-", split);
        System.out.println("배열 연결 문자열 : " + result);

    }
}
