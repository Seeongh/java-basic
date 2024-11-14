package exception.ex02;


public class NetworkServiceV2_1 {

    public void sendMessage(String data) throws NetworkClientException2 {
        String address="http://example.com";

        NetworkClientV2 c = new NetworkClientV2(address);
        c.initError(data);
        c.connect();
        c.send(data);
        c.disconnect();
    }
}
