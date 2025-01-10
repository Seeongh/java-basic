package collection.list;

/**
 * 컴파일 시점 의존관계
 */
public class BatchProcessorMain {
    public static void main(String[] args) {
       // MyArrayList<Integer> list = new MyArrayList<>(); //46ms
        MyLinkedList<Integer> list = new MyLinkedList<>(); //3ms

        BatchProcessor processor = new BatchProcessor(list);
        processor.logic(5000);
    }
}
