package static2.ex;

public class Car {
    public String car;
    public static int count;

    public Car(String car) {
        this.car = car;
        count++;
    }

    public static void showToTalCars() {
        System.out.println("구매한 차량 수 : " + count);
    }

}
