package poly.ex5;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스 생성 불가
        //InterfaceAnimal i = new InterfaceAnimal() ;

        Dog d = new Dog();
        d.sound();
        d.move();

        Cat c = new Cat();
        c.sound();
        c.move();
    }
}
