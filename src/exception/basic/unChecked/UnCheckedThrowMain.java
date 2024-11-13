package exception.basic.unChecked;

/**
 * service에서 에러를 던졌지만 잡을수가 없어 에러가 뜸
 */
public class UnCheckedThrowMain {
    public static void main(String[] args) {
        Service s = new Service(); 
        s.callThrow();
        System.out.println("정상종료");
    }
}
