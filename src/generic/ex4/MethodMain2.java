package generic.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이" , 100) ;
        Cat cat = new Cat("냐옹이" , 100) ;

        AnimalMethod.checkup(dog); //타입 매개변수 추론
        AnimalMethod.checkup(cat);

        Dog bigDog = new Dog("큰 멍멍", 200);
        Dog bigger = AnimalMethod.<Dog>bigger(dog, bigDog);

        System.out.println("bigger = " + bigger.getName());

        //명시적 추론의 경우
        //받는 변수가 Dog면 dog로 추론되어 컴파일 오류 발생
        Animal bigger1 = AnimalMethod.bigger(bigDog, cat);
        System.out.println("추론  bigger = " + bigger1);


    }
}
