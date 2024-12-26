package collection.array;

/**
 * array 객체 사용예제 + 동적 추가
 */
public class MyArrayListV2Main {
    public static void main(String[] args) {
        MyArrayListV2 list = new MyArrayListV2();
        System.out.println("데이터 추가");
        System.out.println(list);

        list.add("b");
        list.add("a");
        list.add("c");


        System.out.println("기능 사용");
        System.out.println("list.size = " + list.size());
        System.out.println("list. get 1 = " + list.get(1));

        System.out.println("list index Of = " + list.indexOf("c"));
        System.out.println(list.set(2,"z"));
        System.out.println(list);

        System.out.println("범위 초과시");
        list.add("d");
        list.add("e"); //범위 확장

        list.add("f");
        System.out.println(list); //indexOutofBound

    }
}
