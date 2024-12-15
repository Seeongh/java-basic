package generic.ex4;

import generic.animal.Animal;

/**
 * 일반 메서드와 제네릭 메서드 섞어쓰기
 * @param <T>
 */
public class ComplexBox <T extends Animal>{

    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    //제네릭 메서드 : 다른 타입을 받아 독립적으로 동작함
    public <Z> Z printAndReturn(Z z) {
        System.out.println("animal.className : " + animal.getClass());
        System.out.println("t.className: " + z.getClass().getName());
        return z;
    }


    //제네릭 메서드 : 같은 타입을 받아도 독립적
    public <T> T printAndReturn2(T t) {
        System.out.println("animal.className : " + animal.getClass());
        System.out.println("t.className: " + t.getClass().getName());
        // t.getName 호출안됨 별개라
        return t;
    }
}
