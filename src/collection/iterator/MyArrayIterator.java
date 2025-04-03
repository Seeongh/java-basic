package collection.iterator;

import java.util.Iterator;

/**
 * 배열 반복자 생성
 */
public class MyArrayIterator implements Iterator<Integer> {

    private int currentIndex = -1;
    private int[] targetArr;

    public MyArrayIterator(int[] currentIndex) {
     //   this.currentIndex = currentIndex;
    }

    @Override
    public boolean hasNext() {
        boolean result = currentIndex < targetArr.length -1;
        return result;
    }

    @Override
    public Integer next() {
        currentIndex++;
        int result = targetArr[currentIndex];
        return result;
    }
}
