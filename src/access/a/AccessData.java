package access.a;

/**
 * 패키지 위치 : access.a
 */
public class AccessData {
    public int publicField;
    int  defaultField;
    private int privateField;


    public void publicM() {
        System.out.println("public 호출 " + publicField);
    }

     void defaultM() {
        System.out.println("default 호출 " + defaultField);
    }

    private void privateM() {
        System.out.println("private 호출 " + privateField);
    }

    public void innerAccess() {
        System.out.println("내부호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;

        publicM();
        defaultM();
        privateM();
    }
}
