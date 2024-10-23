package nested.inner.ex2;

import nested.inner.ex1.Engine;

public class Car {

    private String model;
    private int chargeLevel;

    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }


    public void start() {
        engine.start();
        System.out.println(model + "시작 완료");
    }

    public class Engine {

         // private Car car; //정보 없어도됨 접근이 가능해서

        public void start() {
            System.out.println("충전 레벨" + chargeLevel);
            System.out.println(model+"의 엔진 구동");
        }
    }

}
