package poly.car1;

public class NewCar implements  Car{
    @Override
    public void startEngine() {
        System.out.println("새 시작");
    }

    @Override
    public void offEngine() {
        System.out.println("새차 끔");
    }

    @Override
    public void pressAcc() {
        System.out.println("새차 엑셀");
    }
}
