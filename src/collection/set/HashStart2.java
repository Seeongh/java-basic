package collection.set;

/**
 * 값이 주소가 되는 인덱스 사용하기 O(1)
 * 속도는 향상되지만 메모리 낭비가 됨.
 */
public class HashStart2 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[10];
        //0~9 사이값 입력
        inputArray[1] = 1;
        inputArray[2] = 2;
        inputArray[5] = 5;
        inputArray[8] = 8;
        System.out.println("inputArray= " + inputArray);

        int searchValue = 8 ;
        Integer i = inputArray[searchValue];
        System.out.println("result = "+ i);
    }
}
