package construct;

public class MethodInitMain2 {

    public static void main(String[] args) {
        MemberInit2 m = new MemberInit2();
        m.initMember("user1", 15,90);
        MemberInit2 m2 = new MemberInit2();
        m2.initMember( "user2", 16,80);

        MemberInit2[] members = {m,m2};

        for (MemberInit2 member : members) {
            System.out.println("이름 " + member.name);
        }
    }


}
