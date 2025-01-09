package collection.list;

import java.util.Arrays;

/**
 * 타입 호환성
 */
public class MyArrayList<E> implements MyList<E>{
    private static final int DEFAULT_CAPACITY = 5;

    private Object[] elementData;
    private int size = 0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity) {
        elementData = new Object[initialCapacity]; //제네릭은 런타임에 이레이저에 의해 타입정보가 다 사라져 new E[]는 불가능
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E e) {
        //코드 추가
        if( size == elementData.length) {
            grow();
        }
        elementData[size] = 0;
        size++;
    }

    @Override
    public void add(int index, E e) {
        //코드 추가
        if( size == elementData.length) {
            grow();
        }

        //데이터 이동
        shiftRightFrom(index); //오른쪽으로 이동
        elementData[size] = 0;
        size++;
    }

    //dythdml akwlakrqnxj ㅑㅜㅇㄷㅌRKwl dhfmsWHrdmfh alfrl
    private void shiftRightFrom(int index) {
        for (int i = size; i > index ; i--) {
            elementData[i] = elementData[i-1];
        }

    }

    @Override
    public E remove(int index) {
        E oldValue = get(index) ;
        shiftLeftFrom(index) ; //인덱스부터 왼쪽으로 민다.
        size--;
        elementData[size] = null;
        return oldValue;
    }

    private void shiftLeftFrom(int index) {
        for(int i = index; i<size-1; i++) {
            elementData[i] = elementData[i+1];
        }
    }

    //코드 추가
    private void grow() {
        int oldCapacity = elementData.length;
        int newCapacity = oldCapacity * 2;
        //배열을 새로 만들고, 기존 배열을 새로운 배열에 복사
//        Object[] newArr = new Object[newCapacity];

//        for(int i =0 ; i< elementData.length; i++) {
//            newArr[i]  = elementData[i];
//        }

        Object[] newArr = Arrays.copyOf(elementData, newCapacity);
        elementData = newArr; //가리키는 참조값을 바꿈.
    }

    @SuppressWarnings("unchecked")
    @Override
    public E get(int index) {
        return (E)elementData[index];
    } //다운캐스팅을 해주어야함 (들어간게 e타입이기 때문에)


    @Override
    public E set(int index, E element) {
        E oldValue = get(index);
        elementData[index] = element;
        return oldValue;

    }

    @Override
    public int indexOf(Object o) {
        for(int i =0 ; i< size; i++) {
            if(o.equals(elementData[i])) {
                return i;
            }
        }
        return -1;
    }

    public String toString() {
        return Arrays.toString(Arrays.copyOf(elementData, size)) + "size = " + size + " , capacity = " + elementData.length;
    }
}
