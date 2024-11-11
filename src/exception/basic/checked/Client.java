package exception.basic.checked;

/**
 * 예외 발생 시, 밖으로 던지기 위해 throws해야함
 */
public class Client {

    public void call() throws MyCheckedException{
        //문제상황

        throw new MyCheckedException("ex");
    }
}
