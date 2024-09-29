package poly.ex2;

public class AnimalPolyMain1 {

    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c = new Cat();
        Cow cw = new Cow();

        soundAnimal(d);
        soundAnimal(c);
        soundAnimal(cw);
    }

    private static void soundAnimal(Animal animal) {
        //타입은 부모 타입이지만 오버라이드 메소드가 우선이기때문에 자식클래스의 sound가 호출이됨
        animal.sound();
    }
}
