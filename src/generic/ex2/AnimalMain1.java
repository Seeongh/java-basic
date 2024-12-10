package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {
    public static void main(String[] args) {
        Animal animal = new Animal("동물", 0) ;
        Dog d = new Dog("멍멍이", 100) ;
        Cat c = new Cat("냐옹이" , 50) ;

        Box<Dog> dogBox = new Box<>();
        dogBox.set(d);

        Dog findDog = dogBox.get();
        System.out.println("dog = " + findDog);

        Box<Cat> catBox = new Box<>();
        catBox.set(c);

        Cat findCat = catBox.get();
        System.out.println("cat = " + findCat);

        Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        Animal findAnimal = animalBox.get();
        System.out.println("animal = " + findAnimal);

    }
}
