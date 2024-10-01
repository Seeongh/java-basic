package poly.ex;

public class SmsSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("sms 보냅니다." + message);
    }
}
