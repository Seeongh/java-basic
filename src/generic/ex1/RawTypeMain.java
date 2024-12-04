package generic.ex1;

/**
 * generic - raw타입
 */
public class RawTypeMain{
    public static void main(String[] args) {
        GenericBox integerBox = new GenericBox(); //지정을 안하고 사용할 수 있음 Object타입으로 지정됨.
        //GenericBox<Object> integerBox = new GenericBox<>(); //권장
        integerBox.set(10);
        Integer i = (Integer) integerBox.get();
    }
}
