package poly.ex4;

public class Cow extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("무우");
    }

    @Override
    public void move() {
        System.out.println("소이동");
    }
}
