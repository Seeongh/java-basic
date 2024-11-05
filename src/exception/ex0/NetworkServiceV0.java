package exception.ex0;

public class NetworkServiceV0 {

    public void sendMessage(String data) {
        String address="http://example.com";

        NetworkClientV0 c = new NetworkClientV0(address);
        c.connect();
        c.send(data);
        c.disconnect();
    }
}
