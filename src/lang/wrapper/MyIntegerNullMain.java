package lang.wrapper;

/**
 * 기본형 기본값 만들기
 */
public class MyIntegerNullMain {
    public static void main(String[] args) {
        int[] intArr ={-1,0,1,2,3};
        System.out.println(findValue(intArr, -1)); //-1
        System.out.println(findValue(intArr, 100)); //-1
        //값이 모호함 값을 못찾았다는 상태값을 줄 수 없음

    }

    private static int findValue(int[] intArr, int target) {
        for(int value : intArr) {
            if(value ==target) {
                return value;
            }

        }
        return -1; //값을 못찾으면 - 반환
    }
}
