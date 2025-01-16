package collection.set;

import java.sql.SQLOutput;
import java.util.Arrays;

/**
 * 해시 인덱스
 * 특정 과정을 거친 value로 index를 도출하여 값을 통해 index를 유추한 후 접근할 수 있도록 함
 * 메모리낭비도 없고 성능도 좋음.
 */
public class HashStart4 {
    static final int CAPACITY = 10 ;

    public static void main(String[] args) {
        //1,2,5,8,14,99
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(1) = " + hashIndex(2));
        System.out.println("hashIndex(1) = " + hashIndex(5));
        System.out.println("hashIndex(1) = " + hashIndex(8));
        System.out.println("hashIndex(1) = " + hashIndex(14));
        System.out.println("hashIndex(1) = " + hashIndex(99));

        Integer[] inputArray = new Integer[CAPACITY];

        add(inputArray,1);
        add(inputArray,2);
        add(inputArray,5);
        add(inputArray,8);
        add(inputArray,14);
        add(inputArray,99);
        System.out.println(Arrays.toString(inputArray));

        //검색
         int searchValue = 14;
         int hashIndex = hashIndex(searchValue);
        System.out.println("hashIndex = " + hashIndex);
        Integer result = inputArray[hashIndex];
        System.out.println("result = " + result);

    }

    private static void add(Integer[] inputArray, int value) {
        int hashIndex = hashIndex(value);
        inputArray[hashIndex] = value;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
