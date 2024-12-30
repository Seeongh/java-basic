package collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        MyArrayListV3 numberList = new MyArrayListV3();

        //숫자 입력만을 기대
        numberList.add(1);
        numberList.add(2);
        numberList.add("문자3") ;
        System.out.println(numberList);

        // Object 를 반환하여 다운 캐스팅 필요
        Integer o = (Integer)numberList.get(0);

        //에러 발생
        Integer s = (Integer)numberList.get(2);
    }
}
