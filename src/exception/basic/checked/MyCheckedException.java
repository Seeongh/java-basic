package exception.basic.checked;

/**
 * 체크 예외 - Exception 상속
 */
public class MyCheckedException  extends Exception{

    public MyCheckedException(String message) {
        super(message);
    }
}
