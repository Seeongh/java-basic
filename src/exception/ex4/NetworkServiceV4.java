package exception.ex4;



public class NetworkServiceV4 {

    public void sendMessage(String data){
        String address="http://example.com";

        NetworkClientV4 c = new NetworkClientV4(address);
        c.initError(data);

        //해당 에러는 잡더라도 해결 될 수 있는 에러가 아니기에 UncheckedException으로 변경하고
        //try - catch문 삭제
        c.connect();
        c.send(data);

        c.disconnect();

    }
}
