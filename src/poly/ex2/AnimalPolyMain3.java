package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        Dog d= new Dog();
        Cat c = new Cat();
        Cow cw = new Cow();

        Animal[] arr = {new Dog(),new Cat(),  new Cow()};
        //변경 범위가 최소화된다.
        for (Animal animal : arr) {
            animal.sound();
        }
    }

}
