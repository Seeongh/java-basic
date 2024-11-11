package exception.basic.checked;

public class CheckedCatchMain {
    public static void main(String[] args) {
        Service s = new Service();
        s.callCatch(); //서비스에서 EXCEPTION 처리
        System.out.println("정상종료");


    }
}
