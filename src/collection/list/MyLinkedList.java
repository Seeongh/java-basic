package collection.list;

/**
 * 추가와 삭제 - 제네릭 도입하여 타입안정성 확보 with 중첩 클래스
 */
public class MyLinkedList<E> implements MyList<E>{
    private Node<E> first;
    private int size =0 ;

    @Override
    public void add(E o ) {
        Node<E> newNode = new Node<>(o);
        if(first == null) {
            first = new Node<>(o);
        }else {
            Node lastNode =getLastNode();
            lastNode.next = newNode;
        }
    }
    @Override
    public void add(int index, E e) {
        Node<E> newNode =new Node<>(e);
        if(index == 0 ) {
            newNode.next = first;
            first = newNode;
        }
        else {
            Node<E> prev =getNode(index-1);
            newNode.next =prev.next;
            prev.next = newNode;
        }
    }
    @Override
    public E remove(int index) {
        Node<E> removeNode = getNode(index);
        E removedItem = removeNode.item;
        if(index ==0 ) {
            first = removeNode.next;

        }else {
            Node<E> prev = getNode(index-1);
            prev.next=removeNode.next;
        }

        removeNode.item = null;
        removeNode.next = null;
        size--;
        return  removedItem;

    }

    private Node<E> getLastNode() {
        Node<E> x = first;
        while(x.next != null) {
            x = x.next;
        }
        return x;
    }
    @Override
    public E set(int index, E element) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = element;
        return oldValue;
    }
    @Override
    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }
    private Node<E> getNode(int index) {
        Node<E> x = first;
        //단점..-> 반복문을 돌며 계속 찾아야됨.
        for(int i =0 ; i<index; i++) {
            x = x.next;
        }
        return x;
    }
    @Override
    public int indexOf(E o ) {
        int index = 0 ;
        for ( Node<E> x= first; x != null; x = x.next) {
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

    private static class Node<E>{
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }

        //[A->B->C]
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node<E> x= this;
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
