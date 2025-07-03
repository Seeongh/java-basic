package thread.collection.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * java에서 제공하는 proxy
 * 장점 : 편리한 호환
 * 단점 :
 * 1. 동기화 오버헤드 (성능 저하)
 * 2. 잠금범위가 넓어 병렬처리 효율성 저하
 * 3. 정교한 동기화 불가
 */
public class SynchronizedListMain {
    public static void main(String[] args) {
        //List<String> list = new ArrayList<>();
        List<String> list = Collections.synchronizedList(new ArrayList<>());
        list.add("data1");
        list.add("data1");
        list.add("data1");
        System.out.println(list.getClass());
        System.out.println("list = " + list);
    }
}
