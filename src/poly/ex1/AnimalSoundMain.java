package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat cat = new Cat();

        System.out.println("동물 소리 테스트");
        d.sount();
        cat.sound();
    }
}
