package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data a = new Data();
        a.value= 10;
        System.out.println(a.value);
        changePrimitive(a);
        System.out.println(a);
    }

    static void changePrimitive(Data a) {
        a.value = 20;
    }
}
