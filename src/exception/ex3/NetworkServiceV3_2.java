package exception.ex3;


import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

public class NetworkServiceV3_2 {

    public void sendMessage(String data){
        String address="http://example.com";

        NetworkClientV3 c = new NetworkClientV3(address);
        c.initError(data);

        try {
            c.connect();
            c.send(data);
        } catch (ConnectExceptionV3 e) {
            throw new RuntimeException(e);
        } catch (NetworkClientExceptionV3 e) {
            throw new RuntimeException(e); //나머지 exception은 한번에 잡기위해 상위 계층 class를 넘김
        } catch( Exception e) {
            System.out.println("알수 없는 예외");
        }
        finally {
            c.disconnect();

        }
    }
}
