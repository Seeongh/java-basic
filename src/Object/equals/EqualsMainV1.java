package Object.equals;

public class EqualsMainV1 {

    public static void main(String[] args) {
        UserV1 u1 = new UserV1("1");
        UserV1 u2 = new UserV1("1");

        System.out.println(u1==u2);

        //object가 기본으로 제공하는 equals는 ==
        System.out.println(u1.equals(u2));
    }

}
