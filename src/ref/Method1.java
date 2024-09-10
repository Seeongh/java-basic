package ref;

import java.sql.SQLOutput;

/**
 * 데이터대로 변수를 증가시킴
 */
public class Method1 {
    public static void main(String[] args) {
         Student st1 = new Student();
        initStudent(st1, "학생1", 16, 90);

        Student st2 = new Student();
        initStudent(st2, "학생2", 15, 80);


        printStudent(st1);
        printStudent(st2);

    }
    static void initStudent(Student st, String name, int age, int grade) {
        st.name= name;
        st.age= age;
        st.grade= grade;
    }
    static void printStudent(Student st) {
        System.out.println("이름 : " + st.name);
    }
}
