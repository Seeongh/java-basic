package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

//    MemberConstruct(String name, int age) {
//        System.out.println(name+", "+ age+","+ grade);
//        this.name = name;
//        this.age = age;
//
//    }

    MemberConstruct(String name, int age) {
        this(name, age, 50); //자기자신을 생성자로 씀
    }

    MemberConstruct(String name, int age, int grade) {
        System.out.println(name+", "+ age+","+ grade);
        this.name = name;
        this.age = age;
        this.grade = grade;

    }
}
