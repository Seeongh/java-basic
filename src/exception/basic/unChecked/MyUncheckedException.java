package exception.basic.unChecked;

/**
 * runtimeException을 상속받은 에러는 UncheckedException 이된다.
 */

public class MyUncheckedException extends RuntimeException{

    public MyUncheckedException(String message) {
        super(message);
    }
}
