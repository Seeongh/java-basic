package poly.ex6;

public class Chiken extends AbstractAnimal implements  Fly{
    @Override
    public void sound() {
        System.out.println("꼬끼오");
    }

    @Override
    public void Fly() {
        System.out.println("푸드덕");
    }
}
