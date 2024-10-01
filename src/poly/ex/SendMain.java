package poly.ex;

public class SendMain {
    public static void main(String[] args) {
        Sender[] senders = {new EmailSender(), new SmsSender(), new FaceBookSender()};
        for (Sender sender : senders) {
            String message ="환영합니다";
            sender.sendMessage(message);
        }
    }
}
