package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 제네릭 타입과 메서드의 우선순위 
 * 가까운 메서드가 더 우선순위를 갖음
 */
public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍" , 100) ;
        Cat cat = new Cat("냐옹", 50);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat cat1 = hospital.printAndReturn(cat);
        System.out.println("return = " + cat1);

        hospital.printAndReturn(cat);

    }
}
