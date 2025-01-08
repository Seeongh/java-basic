package collection.link;

import java.sql.SQLOutput;

public class NodeMain1 {
    public static void main(String[] args) {
        //노드 생성과 연결 : a> b>c

        Node first = new Node("A");
        first.next = new Node("B");
        first.next.next = new Node("C");

        System.out.println("모든 노드 탐색");
        System.out.println("first.item = " + first.item);
        System.out.println("first.next.item = " + first.next.item);
        System.out.println("first.next.next.item = " + first.next.next.item);

    }
}
