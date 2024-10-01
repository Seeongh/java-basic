package poly.car1;

public class K3Car implements Car{
    @Override
    public void startEngine() {
        System.out.println("k3시작");
    }

    @Override
    public void offEngine() {
        System.out.println("k3끝");
    }

    @Override
    public void pressAcc() {
        System.out.println("k3 엑셀 밟기");
    }
}
