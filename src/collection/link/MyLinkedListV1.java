package collection.link;

/**
 * 컬렉션 프레임 워크 선택 가이드
 * 1. 순서가 중요하고 중복이 허용되는 경우 : list
 * 2. 중복을 허용하지 않고 순서가 중요하지 않은 경우 : hashset
 * 3. 키-값 쌍으로 저장하는 경우 : HashMap, LinkedHashMap(순서유지시), TreeMap(정렬 순서)
 * 4. 요소 보관 : Queue, Dequeue
 */
public class MyLinkedListV1 {
    private Node first;
    private int size =0 ;

    public void add(Object o ) {
        Node newNode = new Node(o);
        if(first == null) {
            first = new Node(o);
        }else {
            Node lastNode =getLastNode();
            lastNode.next = newNode;
        }
    }

    private Node getLastNode() {
        Node x = first;
        while(x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object element) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }
    private Node getNode(int index) {
        Node x = first;
        //단점..-> 반복문을 돌며 계속 찾아야됨.
        for(int i =0 ; i<index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object o ) {
        int index = 0 ;
        for ( Node x= first; x != null; x = x.next) {
            if(o.equals(x.item)) {
                return index;
            }
            index++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "MyLinkedListV1{" +
                "first=" + first +
                ", size=" + size +
                '}';
    }
}
