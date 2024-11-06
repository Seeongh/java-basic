package exception.ex1;


public class NetworkServiceV1_2 {

    public void sendMessage(String data) {
        String address="http://example.com";

        NetworkClientV1 c = new NetworkClientV1(address);
        c.initError(data);


        String connect = c.connect();
        if(isError(connect)) {
            System.out.println("네트워크 오류 코드 : " + connect);
            return ;
        }

        String send = c.send(data);

        if(isError(send)) {
            System.out.println("네트워크 오류 코드 : " + send);
            return ;
        }

        c.disconnect();
    }

    private boolean isError(String str) {
        return str.equals("success");

    }
}
