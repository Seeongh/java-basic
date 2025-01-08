package collection.link;

/**
 * 추가와 삭제 - 제네릭 도입하여 타입안정성 확보 with 중첩 클래스
 */
public class MyLinkedListV3<T> {
    private Node<T> first;
    private int size =0 ;

    public void add(T o ) {
        Node<T> newNode = new Node<>(o);
        if(first == null) {
            first = new Node<>(o);
        }else {
            Node lastNode =getLastNode();
            lastNode.next = newNode;
        }
    }

    public void add(int index, T e) {
        Node<T> newNode =new Node<>(e);
        if(index == 0 ) {
            newNode.next = first;
            first = newNode;
        }
        else {
            Node<T> prev =getNode(index-1);
            newNode.next =prev.next;
            prev.next = newNode;
        }
    }

    public T remove(int index) {
        Node<T> removeNode = getNode(index);
        T removedItem = removeNode.item;
        if(index ==0 ) {
            first = removeNode.next;

        }else {
            Node<T> prev = getNode(index-1);
            prev.next=removeNode.next;
        }

        removeNode.item = null;
        removeNode.next = null;
        size--;
        return  removedItem;

    }

    private Node<T> getLastNode() {
        Node<T> x = first;
        while(x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, T element) {
        Node<T> x = getNode(index);
        Object oldValue = x.item;
        x.item = element;
        return oldValue;
    }

    public T get(int index) {
        Node<T> node = getNode(index);
        return node.item;
    }
    private Node<T> getNode(int index) {
        Node<T> x = first;
        //단점..-> 반복문을 돌며 계속 찾아야됨.
        for(int i =0 ; i<index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(T o ) {
        int index = 0 ;
        for ( Node<T> x= first; x != null; x = x.next) {
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

    private static class Node<T>{
        T item;
        Node<T> next;

        public Node(T item) {
            this.item = item;
        }

        //[A->B->C]
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<T> x= this;
            sb.append("[");
            while (x != null) {
                sb.append(x.item);
                if(x.next != null) {
                    sb.append("->");
                }
                x=x.next;
            }
            sb.append("]");

            return sb.toString();
        }
    }
}
