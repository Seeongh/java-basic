package collection.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 성능 테스트
 */
public class JavaListPerfomanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("ArrayList 추가 ==");
        addFirst(new ArrayList<>(), size);
        addMid(new ArrayList<>(), size);

        ArrayList<Integer> arrayList = new ArrayList<>(); // 조회용 데이터로 사용
        addLast(arrayList, size);

        int loop = 10000;
        System.out.println("==ArrayList 조회");
        getIndex(arrayList, loop, 0); //앞 조회
        getIndex(arrayList, loop, size/ 2); //중간 조회
        getIndex(arrayList, loop, size-1); // 뒤 조회


        System.out.println("==ArrayList 검색");
        search(arrayList, loop, 0);
        search(arrayList, loop, size/2);
        search(arrayList, loop, size-1);

        System.out.println("LinkedList 추가 ==");
        addFirst(new LinkedList<>(), size);
        addMid(new LinkedList<>(), size);

        LinkedList<Integer> linkedList = new LinkedList<>(); // 조회용 데이터로 사용
        addLast(linkedList, size);

        System.out.println("==LinkedList 조회");
        getIndex(linkedList, loop, 0); //앞 조회
        getIndex(linkedList, loop, size/ 2); //중간 조회
        getIndex(linkedList, loop, size-1); // 뒤 조회


        System.out.println("==LinkedList 검색");
        search(linkedList, loop, 0);
        search(linkedList, loop, size/2);
        search(linkedList, loop, size-1);

    }

    private static void addFirst(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i< size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기 : " + size + " , 계산 시간 " + (endTime-startTime) + "ms");
    }

    private static void addMid(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i< size; i++) {
            list.add(i/2,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("중간에 추가 - 크기 : " + size + " , 계산 시간 " + (endTime-startTime) + "ms");
    }

    private static void addLast(List<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i< size; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("뒤에 추가 - 크기 : " + size + " , 계산 시간 " + (endTime-startTime) + "ms");
    }

    private static void getIndex(List<Integer>list, int loop, int index) {

        long startTime = System.currentTimeMillis();
        for(int i =0 ; i< loop; i++) {
            list.get(index) ;

        }
        long endTime = System.currentTimeMillis();
        System.out.println("index = " + index + " 반복 = " + loop + " 시간 = " + (endTime-startTime) + "ms");

    }

    private static void search(List<Integer>list, int loop, int findValue) {

        long startTime = System.currentTimeMillis();
        for(int i =0 ; i< loop; i++) {
           list.indexOf(findValue);

        }
        long endTime = System.currentTimeMillis();
        System.out.println("findValue = " + findValue + " 반복 = " + loop + " 시간 = " + (endTime-startTime) + "ms");

    }
}
