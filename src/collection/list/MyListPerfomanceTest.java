package collection.list;

/**
 * 성능 테스트
 */
public class MyListPerfomanceTest {
    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("myarrayList 추가 ==");
        addFirst(new MyArrayList<>(), size);

        System.out.println("mylinkedlist추가 ==");
        addFirst(new MyLinkedList<>(), size);

    }

    private static void addFirst(MyList<Integer> list, int size) {
        long startTime = System.currentTimeMillis();
        for(int i = 0; i< size; i++) {
            list.add(0,i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기 : " + size + " , 계산 시간 " + (endTime-startTime) + "ms");
    }
}
