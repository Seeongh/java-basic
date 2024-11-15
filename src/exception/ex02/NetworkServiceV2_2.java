package exception.ex02;

/**
 * 예외를 던지지 않고 처리하기
 */

public class NetworkServiceV2_2 {

    public void sendMessage(String data) {
        String address="http://example.com";

        NetworkClientV2 c = new NetworkClientV2(address);
        c.initError(data);

        try {

            c.connect();
        }catch(NetworkClientException2 e) {
            System.out.println("오류 코드 = " + e.getErrorCode() + " , 메세지 : " + e.getMessage());
            return;
            }

        try {

            c.send(data);
        }
        catch(NetworkClientException2 e)
        {
            System.out.println("오류 연결 실패 코드 = " + e.getErrorCode() + " , 메세지 : " + e.getMessage());
            return;
        }
        c.disconnect();
    }
}
