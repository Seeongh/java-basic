package poly.ex5;

public class Cat implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("냐옹인터페이스");
    }

    @Override
    public void move() {
        System.out.println("냐옹이동");
    }
}
