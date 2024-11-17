package exception.ex02;

public class NetworkClientV2 {

    private final String address ;
    public boolean connectError;
    public boolean sendError;
    public NetworkClientV2(String address) {
        this.address = address;
    }

    public void  connect() throws NetworkClientException2 {
        //연결 성공
        if(connectError) {
            throw new NetworkClientException2("error", address+"서버 연결 상태");
        }
        System.out.println(address + " 서버 연결성공");
    }

    public void send (String data ) throws NetworkClientException2 {

        if(sendError) {
            throw new NetworkClientException2("sendError" , address +" 서버 데이터 전송실패");
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
