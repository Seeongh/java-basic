package extend1.overriding;

public class ElectricCar extends Car {

    @Override //없어도 동작에 이상이 없음. 부모의 기능을 재정의한다고 표시해줌으로 컴파일 오류 발생 ( 코드의 명확성 )
    public void move() {
        System.out.println("전기차 가자!");
    }
    public void charge() {

        System.out.println("충전");
    }
}
