package generic.ex3;

import generic.animal.Animal;

/**
 * 매개변수 타입 제한
 * @param <T>
 */
public class AnimalHospitalV3<T extends Animal> {
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        //T타입은 메서드 정의 시점엔 알 수 없다. Object 기능만 사용
//        animal.toString();
//        animal.equals(null);

        //animal 의 기능은 사용가능
        System.out.println("동물 이름 = " + animal.getName());
        System.out.println("동물 사이즈 = " + animal.getSize());
        animal.sound();
    }

    public T bigger(Animal target) {
        //return null;
        return animal.getSize() > target.getSize()? animal : (T) target;
    }
}
