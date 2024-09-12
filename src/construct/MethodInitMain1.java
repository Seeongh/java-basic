package construct;

public class MethodInitMain1 {

    public static void main(String[] args) {
//        MemberInit1 m= new MemberInit1();
//        m.name = "user1";
//        m.age=15;
//        m.grade= 90;
//
//        MemberInit1 m2 = new MemberInit1();
//        m2.name = "user2";
//        m.age=16;
//        m.grade= 80;

        MemberInit1 m = new MemberInit1();
        initMember(m, "user1", 15,90);
        MemberInit1 m2 = new MemberInit1();
        initMember(m2, "user2", 16,80);

        MemberInit1[] members = {m,m2};

        for (MemberInit1 member : members) {
            System.out.println("이름 " + member.name);
        }
    }
    static void initMember(MemberInit1 member, String name, int age, int grade) {
        member.name = name;
        member.age = age;
        member.grade = grade;

    }

}
