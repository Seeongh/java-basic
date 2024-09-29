package poly.ex2;

public class AnimalPolyMain2 {

    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c = new Cat();
        Cow cw = new Cow();

        Animal[] arr = {d, c, cw};

        for (Animal animal : arr) {
            animal.sound();
        }
    }

}
