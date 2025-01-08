package collection.link;

import collection.array.MyArrayListV1;

/**
 * LINKEDLIST
 * 조회하려면 반복문을 돌아야하는 단점
 */
public class MyLinkedListV1Main {
    public static void main(String[] args) {
        MyLinkedListV1 list = new MyLinkedListV1();
        System.out.println("데이터 추가");
        System.out.println(list);

        list.add("b");
        list.add("a");
        list.add("c");


        System.out.println("기능 사용");
        System.out.println("list.size = " + list.size());
        System.out.println("list. get 1 = " + list.get(1));

        System.out.println("list index Of = " + list.indexOf("c"));
        System.out.println(list.set(2,"z"));
        System.out.println(list);

        System.out.println("범위 초과시");
        list.add("d");
        list.add("e");

        //범위 초과
        list.add("f");
        System.out.println(list); //문제 없음
    }
}
