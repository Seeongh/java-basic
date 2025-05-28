package thread.util;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * 로거 클래스
 * - 추상 클래스러 만들어 직접 생성할 수 없게함
 */
public abstract class MyLogger {

    //형식
    private static final DateTimeFormatter formmatter = DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    public static void log(Object obj) {
        String time = LocalTime.now().format(formmatter);
        //%s하면 tostring 해줌
        System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), obj);
    }
}
