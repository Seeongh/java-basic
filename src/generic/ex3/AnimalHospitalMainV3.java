package generic.ex3;

import generic.animal.Dog;

/**
 * 타입의 제약
 */
public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        //컴파일 오류
       // AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<>();
    }
}
