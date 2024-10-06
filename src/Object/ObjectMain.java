package Object;

public class ObjectMain {
    public static void main(String[] args) {
        Child child = new Child();
        child.childMethod();
        child.parentMethod();
        //toString 은 Object 클래스
        String string = child.toString();


    }
}
