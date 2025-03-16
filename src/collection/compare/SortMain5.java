package collection.compare;

import java.util.TreeSet;

public class SortMain5 {
    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("a", 30);
        MyUser myUser2 = new MyUser("b", 20) ;
        MyUser myUser3 = new MyUser("c", 10);


        TreeSet<Object> treeSet1 = new TreeSet<>();
        treeSet1.add(myUser1);
        treeSet1.add(myUser2);
        treeSet1.add(myUser3);
        System.out.println("comparable 기본정렬");
        System.out.println(treeSet1); //들어가면서 정렬이 됨.

        TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(myUser1);
        treeSet2.add(myUser2);
        treeSet2.add(myUser3);
        System.out.println("id 정렬");
        System.out.println(treeSet2);

    }
}
