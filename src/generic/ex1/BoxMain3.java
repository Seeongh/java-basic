package generic.ex1;

/**
 * 제네릭 클래스 사용 - 생성시점에 타입 결정
 * 기본형은 안되고 객체 참조형만 가능
 * 컴파일러가 이런 타입을 가정해서 반영함
 */
public class BoxMain3 {
    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 x타입 매개변수 T를 밭아 class value타입 결정
        //GenericBox<Integer> integerBox2 = new GenericBox<>(); //컴파일러 타입 추론
        integerBox.set(10);
        //integerBox.set("문자") ; //컴파일 에러발생

        Integer integer = integerBox.get(); //Integer타입 반환 (캐스팅 불필ㅇ)
        System.out.println("제네릭 적용 Integer = " + integer);

        GenericBox<String> stringBox = new GenericBox<String>(); //String으로 value타입 결정
        stringBox.set("문자 클래스");
        String str = stringBox.get();

        System.out.println("제네릭 적용 String = " + str);

        //원하는 모든 타입 적용
        GenericBox<Double> doubleBox = new GenericBox<Double>();
        doubleBox.set(1.11);
        Double doubleVal = doubleBox.get();
        System.out.println("제네릭 적용 Double = " + doubleVal);

    }
}
