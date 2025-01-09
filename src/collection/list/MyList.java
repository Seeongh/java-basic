package collection.list;

/**
 * 자료구조 + 다형성
 * @param <E>
 */
public interface MyList<E>{
    
    int size();
    void add(E e) ; 
    void add( int index, E e);
    E get(int index);
    E set(int index, E element);
    E remove(int index);    
    int indexOf(E o) ;
}
