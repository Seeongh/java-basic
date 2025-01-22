package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV2 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<Object>[] buckets;

    private int size = 0 ;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV2() {
        buckets = new LinkedList[capacity];
        initBuckets();
    }

    public MyHashSetV2(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for(int i = 0 ; i < capacity; i++) {
            buckets[i]= new LinkedList<>();
        }
    }

    public boolean add(Object value) {
        int hashIndex = hashIndex(value) ;
        LinkedList<Object> bucket = buckets[hashIndex];

        if(bucket.contains(value)) {
            return false;
        }


        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(Object searchValue) {
        int hashIndex= hashIndex(searchValue) ;
        LinkedList<Object> bucket = buckets[hashIndex];

        return bucket.contains(searchValue); //O(N)인데 데이터가  1,2개만 많아 실제는 O(1)과 비슷
    }
    private int hashIndex(Object value) {
        return Math.abs(value.hashCode()) % capacity;
    }

    public boolean remove(Object value) {
        int hashIndex = hashIndex(value);
        LinkedList<Object>bucket = buckets[hashIndex];
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
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
