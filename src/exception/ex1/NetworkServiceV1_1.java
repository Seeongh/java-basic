package exception.ex1;


public class NetworkServiceV1_1 {

    public void sendMessage(String data) {
        String address="http://example.com";

        NetworkClientV1 c = new NetworkClientV1(address);
        c.initError(data);
        c.connect();
        c.send(data);
        c.disconnect();
    }
}
