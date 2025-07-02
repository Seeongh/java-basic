package thread.collection.simple;

/**
 * 프록시 클래스가 호출할 컬렉션을 넣어주면
 * 대신 동기화를 책임진다.
 * 외부에서는 추상화에 의존
 */
public class SyncProxyList implements SimpleList{
    private SimpleList target ;

    public SyncProxyList(SimpleList target) {
        this.target = target;
    }

    @Override
    public synchronized int size() {
        return target.size();
    }

    @Override
    public synchronized void add(Object o) {
        target.add(o);
    }

    @Override
    public synchronized Object get(int index) {
        return target.get(index);
    }

    @Override
    public String toString() {
        return target.toString() + " by " + this.getClass().getSimpleName();
    }
}
