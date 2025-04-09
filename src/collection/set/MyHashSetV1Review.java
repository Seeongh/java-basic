package collection.set;

import java.util.LinkedList;

public class MyHashSetV1Review {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1Review() {
        this.buckets = new LinkedList[capacity];
        initbuckets();
    }
    public MyHashSetV1Review(int capacity) {
        this.capacity = capacity;
        initbuckets();
    }

    private void initbuckets() {
        for(int i =0 ; i<capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }


    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];
        if(bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size ++;
        return true;
    }

    public boolean contains(int searchValue) {
        int searchHash = hashIndex(searchValue);
        return buckets[searchHash].contains(searchValue);
    }

    public boolean remove(int value) {
        int removedIndex = hashIndex(value) ;
        //remove (o) 를 넘기면 value삭제, int를 넘기면 index삭제
         return buckets[removedIndex].remove(Integer.valueOf(value));
    }

    private int hashIndex(int value) {
        return value%capacity;
    }
}
