package collection.set;

import java.security.DrbgParameters;
import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {
    static final int DEFAULT_INITIAL_CAPACITY = 16;

    LinkedList<Integer>[] buckets;

    private int size = 0 ;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        buckets = new LinkedList[capacity];
        initBuckets();
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        initBuckets();
    }

    private void initBuckets() {
        buckets = new LinkedList[capacity];
        for(int i = 0 ; i < capacity; i++) {
            buckets[i]= new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value) ;
        LinkedList<Integer> bucket = buckets[hashIndex];

        if(bucket.contains(value)) {
            return false;
        }


        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex= hashIndex(searchValue) ;
        LinkedList<Integer> bucket = buckets[hashIndex];

        return bucket.contains(searchValue); //O(N)인데 데이터가  1,2개만 많아 실제는 O(1)과 비슷
    }
    private int hashIndex(int value) {
        return value % capacity;
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer>bucket = buckets[hashIndex];
        boolean result = bucket.remove(Integer.valueOf(value));//리스트 안에있는 값을 지워줌

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
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
