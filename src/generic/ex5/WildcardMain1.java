package generic.ex5;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildcardMain1 {
    public static void main(String[] args) {
        Box<Object> obj = new Box<>();
        Box<Dog> dog = new Box<Dog>();
        Box<Cat> cat = new Box<Cat>();

        dog.set(new Dog("멍멍", 100));

        WildCardEx.<Dog>printGenericV1(dog);
        WildCardEx.<Dog>printGenericV2(dog);

        WildCardEx.<Dog>printWildcardV1(dog);
        WildCardEx.<Dog>printWildcardV2(dog);

        //cat을 넣으면 그대로 cat이 나오게
        //제네릭의 경우 문제가 안됨.
        cat.set(new Cat("냐옹스", 200));
        Cat catBox = WildCardEx.printAndReturnGeneric(cat);

        //Wildcard를 쓰는 printAndReturnWildcard의 경우 받아는 져도 Animal 로 들어가기 때문에 cat으로 꺼낼수가 없음
        //즉 받을떄만 걍 암거나 받는다는거지, 타입이 다 바뀌는게 아님. (캐스팅 필요)


    }
}
