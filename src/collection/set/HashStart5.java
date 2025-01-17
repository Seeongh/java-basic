package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {
    static final int CAPACITY = 10;

    public static void main(String[] args) {
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY];

        //linked list 배열 초기화
        for(int i =0 ;i <CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }

        System.out.println("buckets= " + Arrays.toString(buckets));
        add(buckets, 1);
        add(buckets, 2);
        add(buckets, 5);
        add(buckets, 8);
        add(buckets, 14);
        add(buckets, 99);
        add(buckets, 9); //중복 - 해시 충돌
        System.out.println("buckets = " + Arrays.toString(buckets));


        int searchValue = 9;
        boolean result = contains(buckets, searchValue) ;
        System.out.println("Result = " + result);
    }

    // 검색
    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);

        LinkedList<Integer> findBucket =  buckets[hashIndex]; //O(1)
        return findBucket.contains(searchValue); //O(2)
    /*    for (Integer i : findBucket) {
            if(i == searchValue) {
                return true;
            }
        }

        return false;
    */
    }


    //버킷 어딘가에 밸류를 넣음
    private static void add(LinkedList<Integer>[] buckets, int value) {
        //해시 인덱스를 만듦
        int hashIndex = hashIndex(value);
        //인덱스 하나에 (해시인덱스)
        LinkedList<Integer> bucket = buckets[hashIndex];  //0(1)

        //중복없으면 list에 값 넣음
        if(!bucket.contains(value)) { //0(n)
            bucket.add(value);
        }

    }

    //해시 인덱스 만들기
    static int hashIndex(int value) {
        return value % CAPACITY;
    }




}
