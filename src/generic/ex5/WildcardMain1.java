package generic.ex5;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> obj = new Box<>();
        Box<Dog> dog = new Box<Dog>();
        Box<Cat> cat = new Box<Cat>();

        dog.set(new Dog("멍멍", 100));

        WildCardEx.<Dog>printGenericV1(dog);
        WildCardEx.<Dog>printGenericV2(dog);

        WildCardEx.<Dog>printWildcardV1(dog);
        WildCardEx.<Dog>printWildcardV2(dog);
    }
}
