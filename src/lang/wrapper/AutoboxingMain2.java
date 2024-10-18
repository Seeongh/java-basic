package lang.wrapper;

/**
 * 오토 박싱
 */
public class AutoboxingMain2 {
    public static void main(String[] args) {
        //기본형 -> wrapper
        int value = 7;
        Integer boxedVlue = value;//박싱

        //wapper-> 기본형
        int unboxedValue = boxedVlue; //언박싱

        System.out.println(boxedVlue);
        System.out.println(unboxedValue);

    }
}
