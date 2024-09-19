package static1;

/**
 * COUNTER INSTANCE를 공용으로 사용하여
 * 참조를 공유해 값을 증가시킴
 */
public class DataCountMain2 {

    public static void main(String[] args) {
        Counter counter = new Counter();
        new Data2("A", counter);
        System.out.println("A count = " + counter.count);

        new Data2("B", counter);
        System.out.println("B count = " + counter.count);

        new Data2("C", counter);
        System.out.println("C count = " + counter.count);
    }
}
