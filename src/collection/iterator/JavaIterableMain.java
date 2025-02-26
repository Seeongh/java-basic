package collection.iterator;

import java.util.*;

public class JavaIterableMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        printAll(list.iterator());

        Set<Integer> set =new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        printAll((set.iterator()));

    }

    private static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = " + iterator.getClass());
        //arraylist의 중첩 클래스인 arrayItr이 나옴
        //HAashmap 의 keyIterator가 나옴
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
