package lang.system;

import java.util.Arrays;

public class SystemMain {
    public static void main(String[] args) {
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("current  =" + currentTimeMillis);

        long currentTimeNano = System.nanoTime();
        System.out.println("current nano = " + currentTimeNano);

        //환경 변수 읽기
        System.out.println("getenv = " + System.getenv());

        //시스템 속성을 읽는다.
        System.out.println("properties = " + System.getProperties());
        System.out.println("java version : " + System.getProperty("java.version"));

        //배열을 고속 복사
        char[] originalArray = {'h', 'e', 'l', 'l', 'o'};
        char[] coppiedArray = new char[5];

        System.arraycopy(originalArray, 0, coppiedArray,0, originalArray.length);

        System.out.println("copied = " + coppiedArray);
        System.out.println("array toString = " + Arrays.toString(coppiedArray));

        System.exit(0);
        System.out.println("hello");

    }
}
