package lang.immutable.change;

/**
 * 불변객체에서 값을 변경가능하게 할 수 있음
 */
public class MutableObj {

    private int value;

    public MutableObj(int value) {
        this.value = value;
    }

    public void add(int addValue) {
        value = value + addValue;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
