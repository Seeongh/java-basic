package collection.array;

import java.util.Arrays;

/**
 * 배열 인덱스 사용
 * 조회 : 자료형 byte 와 index 계산으로 찾음.
 * 한번의 계산으로 효율적으로 찾음
 * 검색 : 하나씩 확인하면서 검색시도
 */
public class ArrayMain1 {
    public static void main(String[] args) {
        int[] arr = new int[5];

        System.out.println("== index 입력 -(1) ==");
        // 빠른 연산
        arr[0] = 1;
        arr[1] = 1;
        arr[2] = 1;

        System.out.println(Arrays.toString(arr));

        System.out.println("== index 변경 : 0(1) ==");
        arr[2] = 10;
        System.out.println(Arrays.toString(arr));

        System.out.println("== index 조회 : 0(1) ==");
        System.out.println("arr[2] = " + arr[2]);

        System.out.println("== index 검색 : 0(n) == ");
        System.out.println(Arrays.toString(arr));
        
        int value = 10;
        for (int i : arr) { //배열안 데이터 검색시에는 좀 느려짐
            System.out.println("Arr[" + i +"[ " + arr[i]);
            if(arr[i] == value) {
                System.out.println("value 찾음" ) ; 
                break;
            }
            
        }


    }
}
