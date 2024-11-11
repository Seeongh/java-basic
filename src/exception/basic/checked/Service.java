package exception.basic.checked;

public class Service {
    Client c = new Client();

    public void callCatch() {
        try {
            c.call(); //예외 발생
            //MyCheckedException 은 Exception의 하위 클래스여서 Exception으로 잡을 수 있다.
        } catch (MyCheckedException e) {
            //예욏 ㅓ리 로직
            System.out.println("예외 처리 = " + e.getMessage());
        }
        System.out.println("정상 호출");
    }

    /**
     * 체크 예외를밖으로 던지는 코드
     * -> thorws 예외를 메서드에 필수로 선언해야함
     */
    public void catchThrows() throws MyCheckedException{
        c.call();
    }
}
