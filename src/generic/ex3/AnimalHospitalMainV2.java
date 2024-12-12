package generic.ex3;

import generic.animal.Dog;

/**
 * 다형성 제한 필요성
 * -> dog, cat, integer 다 들어갈 수 있음
 */
public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
    }
}
