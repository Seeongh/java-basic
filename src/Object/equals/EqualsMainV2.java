package Object.equals;

public class EqualsMainV2 {
    public static void main(String[] args) {
        UserV2 v1 = new UserV2("1");
        UserV2 v2 = new UserV2("1");

        System.out.println(v1==v2);
        System.out.println(v1.equals(v2));
    }
}
