package exception.ex3;

import exception.ex3.exception.ConnectExceptionV3;
import exception.ex3.exception.NetworkClientExceptionV3;
import exception.ex3.exception.SendExceptionV3;

/**
 * 예외 계층
 * NetworkClientExceptionV3를 상속한 각종 EXCEPTION을 통해 분리
 */
public class NetworkClientV3 {

    private final String address ;
    public boolean connectError;
    public boolean sendError;
    public NetworkClientV3(String address) {
        this.address = address;
    }

    public void  connect() throws ConnectExceptionV3 {
        //연결 성공
        if(connectError) {
            throw new ConnectExceptionV3("error", address+"서버 연결 상태");
        }
        System.out.println(address + " 서버 연결성공");
    }

    public void send (String data ) throws SendExceptionV3 {

        if(sendError) {
            throw new SendExceptionV3("sendError" , address +" 서버 데이터 전송실패");
            //예상할 수 없는 다른 예외 발생
            //throw new RuntimeException("ex");

        }
        //전송 성공
        System.out.println(address+"서버에 데이터 전송" + data);
    }

    public void disconnect() {
        System.out.println(address+" 서버연결해제");
    }

    public void initError(String data) {
        if(data.contains("error1")) {
            connectError= true;
        }
        else  if(data.contains("error2")) {
            sendError= true;
        }
    }
}
