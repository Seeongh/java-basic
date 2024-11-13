package exception.basic.unChecked;

public class Client {
    //unchecked exception은 throws를 던지지 않아도 알아서 나감
    public void call() {
        throw new MyUncheckedException("ex") ;
    }
}
