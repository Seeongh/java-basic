package collection.set;

public class MyHashSetV2Main {
    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        set.add("A");
        set.add("b");
        set.add("Ac");
        set.add("d");
        set.add("SET");


        System.out.println("a.hashcode()= " + "a".hashCode());
        System.out.println("setHashCode() = " + "set".hashCode());

        //검색
        String searchValue = "SET";
        boolean result = set.contains(searchValue);
        System.out.println("set.contains(" + searchValue + " ) =" + result );


    }
}
