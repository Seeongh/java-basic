package exception.ex4;

public class NetworkServiceV5 {

    public void sendMessage(String data) {
        String address="http://example.com";

        try(NetworkClientV5 client = new NetworkClientV5(address)) { //자원을 명시적으로 지정. try문이 끝나면 해당 자원의 close 자동 호출
            client.initError(data);
            client.connect();
            client.send(data);

        }
        catch(Exception e) {
            System.out.println("예외 : " + e.getMessage());
            throw e;
        }
    }
}
