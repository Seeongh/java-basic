package collection.deque;

import java.util.Stack;

/**
 * Stack은 백터를 사용하는데, 이는 지금 사용되지 않아 Deque를 사용할 것을 권장.
 */
public class StackMain {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        //다음 꺼낼 요소 확인(단순 조회)
        System.out.println("stack peek() = " + stack.peek());

        //스택 요소 뽑기
        System.out.println("stackpop() = " + stack.pop());
        System.out.println("stackpop() = " + stack.pop());
        System.out.println("stackpop() = " + stack.pop());

    }
}
