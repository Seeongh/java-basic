package exception.ex4.exception;


/**
 * 데이터 보내는 중 발생한 Exception
 */
public class SendExceptionV4 extends NetworkClientExceptionV4 {

    private final String sendDate;

    public SendExceptionV4(String message, String sendDate) {
        super(message);
        this.sendDate = sendDate;
    }

    public String getSendDate() {
        return sendDate;
    }
}
