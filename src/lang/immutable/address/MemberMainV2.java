package lang.immutable.address;

public class MemberMainV2 {
    public static void main(String[] args) {
        ImmutableAddress address = new ImmutableAddress("서울");

        MemberV2 n =new MemberV2("회원a" , address ) ;
        MemberV2 m = new MemberV2("회워b", address);

        System.out.println("회원a = " + n);
        System.out.println("회원b= " + m);


        //m의 주소를 변경
        // m.getAddress().setValue("부산"); //컴파일 오류

        m.setAddress(new ImmutableAddress("부산"));
        System.out.println("부산으로 변경");
        System.out.println("회원a = " + n);
        System.out.println("회원b= " + m);

    }

}
