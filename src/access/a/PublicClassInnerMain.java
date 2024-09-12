package access.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
        DefaultClass1 d = new DefaultClass1(); //같은 패키지여서 호출 가능
    }
}
