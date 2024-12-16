package generic.ex5;

import generic.animal.Animal;

/**
 * 와일드 카드
 *
 * : 이미 만들어진 제네릭 타입으로 활용
 */
public class WildCardEx {
    static <T> void printGenericV1(Box<T> box) {
        System.out.println("T = " + box.get());
    }

    static <T extends Animal> void printGenericV2(Box<T> box) {
        T t= box.get(); //Object 로 모든 타입 반환 (비제한)
        System.out.println("이름 = " + t.getName());
    }

    static <T extends Animal> T printAndReturnGeneric(Box<T> box) {
        T t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }

    //와일드 카드 (box<Dog>, box<Cat>.. 다 들어올 수 있음
    static void printWildcardV1(Box<?> box) {
        System.out.println("?=" + box.get());
    }

    static void printWildcardV2(Box<? extends Animal> box) {
        System.out.println("?=" + box.get());
    }

    public Animal printAndReturnWildcard(Box<? extends Animal> box) {
        Animal t = box.get();
        System.out.println("이름 = " + t.getName());
        return t;
    }
}
