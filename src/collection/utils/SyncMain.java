package collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SyncMain {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println("list class = " + list.getClass());

        //멀티 쓰레드 상황에서 동기화 문제가 발생하지 않는 안전한 리스트로 만들기
        Collection<Integer> synchronizedList = Collections.synchronizedCollection(list);
        System.out.println("synchronizedList class = " + synchronizedList.getClass());
    }
}
