package thread.cas.increment;

public class BasicInteger implements IncrementInteger{

    private int value; //공유 가능 자원
    @Override
    public void increment() {
        value ++;

    }

    @Override
    public int get() {
        return value;
    }
}
