package generic.ex1;

/**
 * 모든 타입을 담을 수 있는 BOX
 */
public class ObjectBox {

    private Object value;

    public void set(Object obj) {
        this.value = obj;
    }

    public Object get() {
        return this.value;
    }
}
