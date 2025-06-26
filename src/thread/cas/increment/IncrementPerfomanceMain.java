package thread.cas.increment;

/**
 * 작성한 클래스별 성능 측정
 * 1. basic : 공통 자원인 value ++
 * 2. volatile: value를 메인 메모리에서 읽어오도롬 함
 * 3. syncronize : 임계영역 생성
 * 4. AtomicInteger : 동시성 보장해주는 원자 integer 클래스 사용
 */
public class IncrementPerfomanceMain {

    public static final long COUNT = 100_000_000;

    public static void main(String[] args) {
        test(new BasicInteger()); //12 cpu cash
        test(new VolatileInteger()); //600 - 원자적 연산에는 volatile을 써도 괜찮음 (멀티스레드에 부적합)
        test(new SyncInteger()); //1239
        test(new MyAtomicInteger()); //600
    }

    private static void test(IncrementInteger incrementInteger) {
        long startMs = System.currentTimeMillis();

        for (int i = 0; i < COUNT; i++) {
            incrementInteger.increment();
        }

        long endMs = System.currentTimeMillis();
        System.out.println(incrementInteger.getClass().getSimpleName() +" :ms = " + (endMs - startMs));
    }
}
