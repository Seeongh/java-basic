package collection.set;

public class MyHashSetV1Main {
    public static void main(String[] args) {
        MyHashSetV1 set = new MyHashSetV1();

        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(9);
        set.add(99);
        set.add(14);
        System.out.println(set);

        //검색
        int searchValue = 0 ;
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + " ) = " + result) ;


        ///삭제
        boolean removeResult = set.remove(searchValue);
        System.out.println("removeREsult = " + removeResult);
        System.out.println(set);
    }
}
