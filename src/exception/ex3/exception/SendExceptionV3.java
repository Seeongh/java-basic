package exception.ex3.exception;

/**
 * 데이터 보내는 중 발생한 Exception
 */
public class SendExceptionV3 extends NetworkClientExceptionV3{

    private final String sendDate;

    public SendExceptionV3(String message, String sendDate) {
        super(message);
        this.sendDate = sendDate;
    }

    public String getSendDate() {
        return sendDate;
    }
}
