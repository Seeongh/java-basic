package collection.set;

import java.util.Arrays;

/**
 * 메모리 낭비
 * 입력 범위를 0~99까지로 늘려 테스트
 * 조회속도는 늘었지만 메모리는 낭비함.
 *
 */
public class HashStart3 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[100];
        //0~9 사이값 입력
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        inputArray[14] = 14;
        inputArray[99] = 99;
        System.out.println("inputArray= " + Arrays.toString(inputArray));

        int searchValue =  99;
        Integer result = inputArray[searchValue]; // O(1)
        System.out.println("result = " + result);

    }
}
