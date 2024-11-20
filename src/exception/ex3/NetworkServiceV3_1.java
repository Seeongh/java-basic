package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_1 {

    public void sendMessage(String data){
        String address="http://example.com";

        NetworkClientV3 c = new NetworkClientV3(address);
        c.initError(data);

        try {
            c.connect();
            c.send(data);
        } catch (ConnectExceptionV3 e) {
            throw new RuntimeException(e);
        } catch (SendExceptionV3 e) {
            throw new RuntimeException(e);
        }finally {
            c.disconnect();

        }
    }
}
