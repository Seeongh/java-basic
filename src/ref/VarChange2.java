package ref;

/**
 * 참조 익히기
 */

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        //b가 a를 복사해 같은 주소값을 가짐
        System.out.println("Data a " + dataA);
        System.out.println("Data b " + dataB);
        System.out.println("data a. value = " + dataA.value);
        System.out.println("data b. value = " + dataB.value);

        //a변경
        dataA.value= 20;
        System.out.println("dataA value = 20 ");
        System.out.println("data a. value = " + dataA.value);
        System.out.println("data b. value = " + dataB.value);

    }
}
