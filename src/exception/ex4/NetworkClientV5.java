package exception.ex4;


import exception.ex4.exception.ConnectExceptionV4;
import exception.ex4.exception.SendExceptionV4;

/**
 * TRY CATCH WITH RESOURCES
 */
public class NetworkClientV5 implements AutoCloseable{

    private final String address ;
    public boolean connectError;
    public boolean sendError;
    public NetworkClientV5(String address) {
        this.address = address;
    }

    public void  connect() { //runtimeException 을 상속 받으면서 throws하지 않아도 됨.
        //연결 성공
        if(connectError) {
            throw new ConnectExceptionV4("error", address+"서버 연결 상태");
        }
        System.out.println(address + " 서버 연결성공");
    }

    public void send (String data ) {

        if(sendError) {
            throw new SendExceptionV4("sendError" , address +" 서버 데이터 전송실패");
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

    @Override
    public void close() { //try 문이 끝나고 자동으로 호출
        System.out.println("v5.close");
        disconnect();
    }
}
