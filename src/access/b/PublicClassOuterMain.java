package access.b;

//import access.a.DefaultClass1;
import access.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
        //DefaultClass1 dc = new DefaultClass1(); //같은 패키지 내에서만 접근 가능함.
    }
}
