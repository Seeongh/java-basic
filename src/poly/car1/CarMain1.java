package poly.car1;

import poly.car1.Model3Car;

public class CarMain1 {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택
        K3Car k = new K3Car();
        driver.setCar(k);
        driver.drive();

        //차량 변경
        Model3Car m3 = new Model3Car();
        driver.setCar(m3);
        driver.drive();

        //새차 추가
        NewCar n = new NewCar();
        driver.setCar(n);
        driver.drive();
    }
}
