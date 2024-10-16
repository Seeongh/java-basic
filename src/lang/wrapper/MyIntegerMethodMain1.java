package lang.wrapper;

/**
 * 기본형의 한계로 참조로 변경
 */
public class MyIntegerMethodMain1 {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(10);  
        myInteger.compareTo(5);
        myInteger.toString();

        myInteger.compareTo(10);
        myInteger.compareTo(20);



    }
}
