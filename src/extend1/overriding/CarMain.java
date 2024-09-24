package extend1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.move(); //새로 정의됨
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
