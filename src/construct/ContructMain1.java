package construct;

public class ContructMain1 {

    public static void main(String[] args) {
        MemberConstruct m = new MemberConstruct("user", 19, 90); //객체 생성자를 불러라
        MemberConstruct m2 = new MemberConstruct("user2", 18, 80);


        MemberConstruct m3 =new MemberConstruct("test", 20) ;
        System.out.println(m3.grade);
    }
}
