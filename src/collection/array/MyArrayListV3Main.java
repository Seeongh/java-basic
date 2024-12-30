package collection.array;

public class MyArrayListV3Main {
    public static void main(String[] args) {
        MyArrayListV3 list = new MyArrayListV3();

        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);

        System.out.println("addlast");
        list.add(3, "addlast");
        System.out.println(list);

        System.out.println("addFirst");
        list.add(0,"addfirst");
        System.out.println(list);

        Object removed1 = list.remove(4);
        System.out.println("remove = " + removed1);
        System.out.println(list);

        Object removed2 = list.remove(0);
        System.out.println("remove()) = " + removed2);
        System.out.println(list);
    }
}
