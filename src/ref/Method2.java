package ref;

/**
 * 데이터대로 변수를 증가시킴
 */
public class Method2 {
    public static void main(String[] args) {
         Student st1 =create("학생1", 16, 90);

        Student st2 = create("학생2", 15, 80);


        printStudent(st1);
        printStudent(st2);

    }
    static Student create(String name, int age, int grade) {
        Student st = new Student();
        st.name = name;
        st.age = age;
        st.grade = grade;
        return st;
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
