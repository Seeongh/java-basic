package lang.immutable.address;

public class MemberMainV1 {
    public static void main(String[] args) {
        Address address = new Address("서울");

        MemberV1 n =new MemberV1("회원a" , address ) ;
        MemberV1 m = new MemberV1("회워b", address);

        System.out.println("회원a = " + n);
        System.out.println("회원b= " + m);


        //m의 주소를 변경
//         m.getAddress().setValue("부산");
//        System.out.println("부산으로 변경");
//        System.out.println("회원a = " + n);
//        System.out.println("회원b= " + m);

    }

}
