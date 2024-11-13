package exception.basic.unChecked;

public class UnCheckedCatchMain {
    public static void main(String[] args) {
        Service s = new Service();
        s.callCatch();
        System.out.println("정상 종료" +
                "");
    }
}
