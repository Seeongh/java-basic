package collection.set.javaset;

import java.sql.SQLOutput;
import java.util.*;

public class JavaSetMain {
    public static void main(String[] args) {
        run(new HashSet<>()); //입력 순서 미보장. O(1)
        run(new LinkedHashSet<>()); //데이터를 순서대로 출력할 수 있음. O(1)
        run(new TreeSet<>()); // 데이터 값 기준 정렬.
    }

    private static void run(Set<String> set) {
        System.out.println("set = " + set.getClass());

        set.add("C");
        set.add("B");
        set.add("A");
        set.add("1");
        set.add("2");

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next()+ "" );
        }
    }
}
