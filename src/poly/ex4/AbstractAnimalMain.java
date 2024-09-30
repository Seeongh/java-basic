package poly.ex4;

public class AbstractAnimalMain {
    public static void main(String[] args) {
        //추상클래스 생성 부락
        //AbstractAnimal ab = new AbstractAnimal() ;

        Dog d = new Dog();
        d.sound();
        d.move();

        Cat c = new Cat();
        c.sound();
        c.move();

        Cow cw = new Cow();
        cw.sound();
        cw.move();
    }
}
