package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * 제네릭 인터페이스 도입
 */
public class MyHashSetV3<E> implements MySet<E>{
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] buckets;

    private int size = 0 ;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        buckets = new LinkedList[capacity];
        initBuckets();
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for(int i = 0 ; i < capacity; i++) {
            buckets[i]= new LinkedList<>();
        }
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value) ;
        LinkedList<E> bucket = buckets[hashIndex];

        if(bucket.contains(value)) {
            return false;
        }


        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(E searchValue) {
        int hashIndex= hashIndex(searchValue) ;
        LinkedList<E> bucket = buckets[hashIndex];

        return bucket.contains(searchValue); //O(N)인데 데이터가  1,2개만 많아 실제는 O(1)과 비슷
    }
    private int hashIndex(E value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E>bucket = buckets[hashIndex];
        boolean result = bucket.remove(value);//리스트 안에있는 값을 지워줌

        if(result) {
            size--;
            return true;
        }
        else {
            return false;
        }

    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
