package collection.compare;

import java.util.Collections;
import java.util.LinkedList;

public class SortMain4 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30) ;
        MyUser myUser2 = new MyUser("b", 20);
        MyUser myUser3 = new MyUser("c", 10);

        LinkedList<MyUser> list = new LinkedList<>();
        list.add(myUser1);
        list.add(myUser2);
        list.add(myUser3);
        System.out.println("기본 데이터");
        System.out.println(list);
        System.out.println("cOMPARABLE 기본 정렬");
        list.sort(null);
        System.out.println(list);

        System.out.println("IdComparable");
        list.sort(new IdComparator()); //이걸 마니씀
        System.out.println(list);

        //collection
        Collections.sort(list);
        Collections.sort(list,new IdComparator());
        System.out.println(list);


    }
}
