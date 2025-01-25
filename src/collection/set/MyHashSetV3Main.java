package collection.set;

public class MyHashSetV3Main {
    public static void main(String[] args) {
        MySet<String> set = new MyHashSetV3<>(10);

        set.add("a");
        set.add("b");
        set.add("c");

        System.out.println(set);

        //검색
        String searchValue="a";
        boolean result= set.contains(searchValue);
        System.out.println("result = " + result);
    }
}
