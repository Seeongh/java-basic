package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 코드 재사용이 안되는 경우
 */
public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        DogHospital dogHospital = new DogHospital();
        CatHospital catHospital = new CatHospital();

        Dog dog = new Dog("멍멍1" , 100);
        Cat cat =new Cat("냐옹1", 100);

        //강아지 병원
        dogHospital.set(dog);
        dogHospital.checkup();

        //고양이
        catHospital.set(cat);
        catHospital.checkup();

        //문제 1 : 개병원에 고양이
        //dogHospital.set(cat); //다른 타입 입력 : 컴파일 오류

        //문제 2 : 개타입 반환
        dogHospital.set(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍2", 200));
        System.out.println("biggerDog=" + biggerDog);

    }
}
