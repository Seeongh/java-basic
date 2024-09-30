package poly.ex4;

/**
 * 순수 추상 클래스 : 모든 메서드가 추상 메서드
 */
public abstract class AbstractAnimal {
    public abstract void sound(); //이건 호출되면 안됨. -> 오버라이딩의 목적

    public abstract void move() ;
}
