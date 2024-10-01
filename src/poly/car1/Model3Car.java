package poly.car1;

public class Model3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("m3 시작");
    }

    @Override
    public void offEngine() {
        System.out.println("m3 끝");
    }

    @Override
    public void pressAcc() {
        System.out.println("m3 엑셀밟기");
    }
}
