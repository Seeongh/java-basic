package exception.basic.unChecked;

/**
 * Unchecked 예외는 잡거나 던지지 않아도 자동으로 밖으로 던진다.
 */
public class Service {

    Client c = new Client();

    public void callCatch() {
        try{
            c.call();
        }
        catch(MyUncheckedException e) {
            //예외처리
            System.out.println("예외처리 : " + e.getMessage());
        }
        System.out.println("정상 로직");
    }

    /**
     * 예오를 잡지않음
     */
    public void callThrow() {
        c.call();
    }
}
