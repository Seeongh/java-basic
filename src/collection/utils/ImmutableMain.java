package collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {
    public static void main(String[] args) {
        //불변 리스트 생성
        List<Integer> list = List.of(1, 2, 3);
        //가변 리스트
        ArrayList<Integer> mutableList = new ArrayList<>(list);
        mutableList.add(5);
        System.out.println(mutableList);
        System.out.println("mutable classs=" + mutableList.getClass());

        //불변 리스트
        Collection<Integer> unmodifiableList = Collections.unmodifiableCollection(mutableList);
        //java.lang.UnsupportedOperationException 예외 발생
        //unmodifiableList.add(5);
    }
}
