package poly.car0;

public class Driver {

    private K3Car k3;
    private Model3Car m3;

    public void setK3(K3Car k3) {
        this.k3 = k3;
    }

    public void setM3(Model3Car m3) {
        this.m3 = m3;
    }

    public void drive() {
        System.out.println("자동차운전");

        if(k3!= null) {
            k3.startEngine();
            k3.pressAcc();
            k3.offEngine();
        }
        else if(m3 !=null) {
            m3.startEngine();
            m3.pressAcc();
            m3.offEngine();
        }

        System.out.println("끝");
    }
}
