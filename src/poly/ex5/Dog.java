package poly.ex5;

public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("멍멍인터페이스");
    }

    @Override
    public void move() {
        System.out.println("멍멍이동");
    }
}
