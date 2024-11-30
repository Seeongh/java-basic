package generic.ex1;

/**
 * 제네릭 클래스
 * 1. 타입을 미리 결정하지 않는다.
 * 2. <T>타입이 나중에 결정됨 T :타입 매개변수
 * @param <T>
 */
public class GenericBox<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}
