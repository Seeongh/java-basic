package poly.car0;

/**
 * 다형성 활용 - 사용안한경우
 */
public class CarMain0 {

    public static void main(String[] args) {
        Driver d = new Driver();
        K3Car k = new K3Car();

        d.setK3(k);
        d.drive();

        //추가
        Model3Car m = new Model3Car();
        d.setK3(null); //k3참조 제거
        d.setM3(m);

        d.drive();
    }
}
