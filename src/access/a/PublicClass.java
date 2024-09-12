package access.a;

public class PublicClass {
    public static void main(String[] args) {
        PublicClass pc = new PublicClass();
        DefaultClass1 d = new DefaultClass1(); // 같은 패키지 내부에서만 접근 가능함
    }
}


class DefaultClass1{

}