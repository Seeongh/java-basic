package collection.link;

public class MyLinkedListV3Main {
    public static void main(String[] args) {
        MyLinkedListV3<String> stringList = new MyLinkedListV3<>();

        stringList.add("a");
        stringList.add("b");
        stringList.add("b");
        System.out.println("string = " + stringList.get(0));
    }
}
