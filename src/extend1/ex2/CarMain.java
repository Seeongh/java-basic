package extend1.ex2;

import extend1.ex2.GasCar;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.move();
        e.charge();

        GasCar g = new GasCar();
        g.move();
        g.fillup();

    }
}
