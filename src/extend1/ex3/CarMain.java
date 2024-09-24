package extend1.ex3;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.move();
        e.charge();

        GasCar g = new GasCar();
        g.move();
        g.fillup();


        //기능 추가 이후
        e.openDoor();
        g.openDoor();

        HydragenCar h = new HydragenCar();

        h.move();
        h.fillH();
        h.openDoor();

    }
}
