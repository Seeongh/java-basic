package Object.tostring;

public class ToStringMain1 {
    public static void main(String[] args) {
        Object o = new Object();
        String str = o.toString();

        //toString() 반환값 출력
        System.out.println(str);
        //Obejct 직접 출력
        System.out.println(o);
        // 주소값이 똑같음

    }
}
