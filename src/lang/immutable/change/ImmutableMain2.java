package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {
        ImmutableObj obj = new ImmutableObj(30);
        obj.add(20);

        System.out.println(obj.getValue());
    }
}
