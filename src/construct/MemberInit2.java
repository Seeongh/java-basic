package construct;

public class MemberInit2 {
    String name;
    int age;
    int grade;

    void initMember(String name, int age, int grade) {
        this.name = name; //this는 자기자신의 instance
        this.age = age;
        this.grade = grade;

    }
}
