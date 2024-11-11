package exception.basic.checked;

public class CheckedThrowMain {
    public static void main(String[] args) throws MyCheckedException {
        Service s = new Service();

        s.catchThrows();
        System.out.println("정상 종료");
    }
}
