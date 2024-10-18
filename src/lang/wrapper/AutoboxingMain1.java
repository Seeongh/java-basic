package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {
        //기본형 -> wrapper
        int value = 7;
        Integer boxedVlue = Integer.valueOf(value); //박싱

        //wapper-> 기본형
        int unboxedValue = boxedVlue.intValue(); //언박싱

        System.out.println(boxedVlue);
        System.out.println(unboxedValue);

    }
}
