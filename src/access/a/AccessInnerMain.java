package access.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicM();

        data.defaultField = 2;
        data.defaultM();

        //data.privateFiled, privateM(); 둘다 접근 불가

        data.innerAccess(); // 외부에서 접근가능
    }
}
