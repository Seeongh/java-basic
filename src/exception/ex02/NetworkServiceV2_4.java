package exception.ex02;

/**
 * 정상과 예외 명확한 분리
 */

public class NetworkServiceV2_4 {

    public void sendMessage(String data) {
        String address="http://example.com";

        NetworkClientV2 c = new NetworkClientV2(address);
        c.initError(data);

        try {

            c.connect();
            c.send(data);
        }catch(NetworkClientException2 e) {
            System.out.println("오류 코드 = " + e.getErrorCode() + " , 메세지 : " + e.getMessage());
        }finally {
            //반드시 호출
            c.disconnect();
        }


    }
}
