package thread.cas.increment;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * sync걸 필요없이 
 * 동시성 관련된게 구현되어있음 - 멀티 쓰레드 상황에 안전
 */
public class MyAtomicInteger implements IncrementInteger{

    AtomicInteger atomicInteger = new AtomicInteger(0); //초기화 가능 없어도됨
    @Override
    public void increment() {
        atomicInteger.incrementAndGet();
    }

    @Override
    public int get() {
        return atomicInteger.get();
    }
}
