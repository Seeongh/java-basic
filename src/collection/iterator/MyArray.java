package collection.iterator;

import java.util.Iterator;

/**
 * arrayIterator를 위한 간단한 자료구조
 */
public class MyArray implements  Iterable<Integer> {
    private int[] numbers;

    public MyArray(int[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyArrayIterator(numbers);
    }
}
