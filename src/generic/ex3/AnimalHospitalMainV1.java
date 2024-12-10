package generic.ex3;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 제네릭의 다형성 적용 시도 
 * : 타입 체크 실패
 */
public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        AnimalHospitalV1 animalHospital = new AnimalHospitalV1();

        Dog dog = new Dog("멍멍1" , 100);
        Cat cat =new Cat("냐옹1", 100);

        //강아지 병원
        animalHospital.set(dog);
        animalHospital.checkup();

        //고양이
        animalHospital.set(cat);
        animalHospital.checkup();

        //문제 1 : 개병원에 고양이
        animalHospital.set(cat); //다른 타입 입력 : 매개변수 체크 실패

        //문제 2 : 개타입 반환
        animalHospital.set(dog);
       // Animal biggerAnimal =  animalHospital.bigger(new Dog("멍멍3", 200));
        Dog biggerDog = (Dog) animalHospital.bigger(new Dog("멍멍3", 200));
        System.out.println("biggerAnimal =" + biggerDog);

    }
}
