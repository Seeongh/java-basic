package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AniamlMain2 {

    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0) ;
        Dog d = new Dog("멍멍이", 100) ;
        Cat c = new Cat("냐옹이" , 50) ;


        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(d);
        animalBox.set(c);

        Animal findAnimal = animalBox.get();
        System.out.println("findAnimal = " + animalBox.get().toString());
    }
}
