package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        //Deque<Integer> deque = new LinkedList<>();

        //데이터 추가
        deque.offerFirst(1);
        System.out.println(deque);
        deque.offerFirst(2);
        System.out.println(deque);
        deque.offerFirst(3);
        System.out.println(deque);

        deque.offerLast(4);
        System.out.println(deque);

        //다음 꺼낼 데이터 확인
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

        //데이터 꺼내기
        System.out.println("deque.pollFIrst() = " + deque.pollFirst());
        System.out.println("deque.pollFIrst() = " + deque.pollLast());
        System.out.println("deque.pollFIrst() = " + deque.pollFirst());
        System.out.println("deque.pollFIrst() = " + deque.pollLast());
        System.out.println(deque);


    }
}
