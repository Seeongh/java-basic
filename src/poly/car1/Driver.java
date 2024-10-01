package poly.car1;

public class Driver {
    private Car car ;

    public void setCar(Car c) {
        this.car = c;
    }

    public void drive() {
        System.out.println("운전시작");
        car.startEngine();
        car.pressAcc();
        car.offEngine();
        System.out.println("운전 끝");
    }
}
