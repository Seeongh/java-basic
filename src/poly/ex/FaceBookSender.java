package poly.ex;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String message) {
        System.out.println("facebook 메세지 보냅니다."+ message);
    }
}
