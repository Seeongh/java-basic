package poly.ex3;

/**
 * 추상 클래스
 */
public abstract class AbstractAnimal {
    public abstract void sound(); //이건 호출되면 안됨. -> 오버라이딩의 목적

    public void move() {
        System.out.println("움직인다.");
    }
}
