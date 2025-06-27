package thread.collection.simple;

import java.util.ArrayList;
import java.util.List;

public class SimpleListMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //스레드 1, 스레드 2 동시 실행가정
        list.add("A"); //thread1
        list.add("B"); //thread2
        System.out.println(list); //데이터를 넣기만하는게 원자적연산으로 느껴질 수 있음
    }
}
