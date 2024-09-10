package class1;

import java.sql.SQLOutput;

/**
 * 배열로 만들기
 */
public class ClassStart2 {
    public static void main(String[] args) {
        String[] StudentName = {"학생1", "학생2"};
        int[] age = {15, 16};


        for(int i =0 ; i < StudentName.length; i++) {
            System.out.println("이름 : " + StudentName[i] + " 나이 : " + age[i]);
        }

        //배열로 최소화 하는데 성공했지만
        //데이터를 변경할때 번거로움

    }
}
