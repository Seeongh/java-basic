package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        data.publicField = 1;
        data.publicM();

        //data.defaultField = 2; //default공간인 같은 패키지 내가 아니기 떄문에 접근 불가
        //data.defaultM();

        //data.privateFiled, privateM(); 둘다 접근 불가

        data.innerAccess(); // 외부에서 접근가능
    }
}
