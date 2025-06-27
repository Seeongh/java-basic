package thread.collection.simple;

import java.util.Arrays;

import static thread.util.ThreadUtils.sleep;

/**
 * ArrayList 최소 구현 버전
 */
public class BasicList implements SimpleList{

    private static final int DEFAULT_CAPATICY = 5;

    private Object[] elementData;
    private int size =0 ;

    public BasicList() {
        elementData= new Object[DEFAULT_CAPATICY];
    }

    @Override
    public int size() {
        return elementData.length;
    }

    /**
     * add는 원자적 연산이 아님.
     * @param o
     */
    @Override
    public void add(Object o) {
        elementData[size] = o; 
        sleep(100); //멀티스레드 문제를 쉽게 확인할 수 있는 코드 
        size++;  //연산 쪼개짐
    }

    @Override
    public Object get(int index) {
        return elementData[index];
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) +" size = " + size + " , capacity = " + elementData.length;
    }
}
