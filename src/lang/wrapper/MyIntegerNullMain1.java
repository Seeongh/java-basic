package lang.wrapper;

/**
 * 기본형 기본값 만들기
 */
public class MyIntegerNullMain1 {
    public static void main(String[] args) {
        MyInteger[] intArr ={new MyInteger(-1),new MyInteger(1)};
        System.out.println(findValue(intArr, -1)); //-1
        System.out.println(findValue(intArr, 100)); //-1
        //값이 모호함 값을 못찾았다는 상태값을 줄 수 없음

    }

    private static MyInteger findValue(  MyInteger[] intArr, int target) {
        for(MyInteger value : intArr) {
            if(value.getValue() ==target) {
                return value;
            }

        }
        return null; //값을 못찾으면 - 반환
    }
}
