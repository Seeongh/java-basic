package collection.set;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] inputArray = new Integer[4];
        //0~9 사이값 입력
        inputArray[0] = 1;
        inputArray[1] = 2;
        inputArray[2] = 5;
        inputArray[3] = 8;
        System.out.println("inputArray= " + inputArray);

        int searchValue = 9 ;

        //데이터 찾는 성능이 너무 느림 O(n)
        for(Integer inputValue: inputArray) {
            if(inputValue == searchValue) {
                System.out.println(inputValue);
            }
        }
    }
}
