package nested.inner.ex2;

/**
 * 내부 중첩 클래스 - 리팩토링
 * 1. 캡슐화
 */
public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("model y" , 100);
        //생성떄 new Engine이 호출되면서 car의 참조값도 같이 전달이 된다.
        car.start();
    }
}
