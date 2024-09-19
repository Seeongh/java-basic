package static2;

public class DecoData {
    public int instanceValue;
    public static int staticValue;

    public static void staticCall() {
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메소드 접근
        //instanceValue++; //인스턴스 변수 접근 불가 -> 참조값을 알 수 없음
        //instanceMethod() //인스턴스 메소드 접근 불가
    }

    public void instanceCall() {
    //다 접근 가능
        staticValue++; //정적 변수 접근
        staticMethod(); //정적 메소드 접근
        instanceValue++; //인스턴스 변수 접근 불가
        instanceMethod() ;//인스턴스 메소드 접근 불가
    }
    private void instanceMethod() {
        System.out.println("instanceValue=" + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue-" + staticValue);

    }
}
