package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

//와일드 카드 - 하한 제한
public class WildcardMain2 {

    public static void main(String[] args) {
        Box<Object> objBox = new Box<>();
        Box<Animal> animalBox = new Box<>();
        Box<Dog> dogBox = new Box<>();
        Box<Cat> catBox = new Box<>();


        //Animal 포함 상위 타입 전달 가능
        writeBox(objBox);
        //하한은 안됨.
        //writeBox(catBox);


    }

    static void writeBox(Box<? super Animal> box) {
        box.set(new Dog("멍멍", 100));
    }
}
