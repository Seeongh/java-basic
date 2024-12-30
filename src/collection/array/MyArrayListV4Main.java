package collection.array;

//제네릭을 통해 타입 호환
public class MyArrayListV4Main {
    public static void main(String[] args) {
        MyArrayListV4<String> stringList = new MyArrayListV4<>();
        stringList.add("ad");
        stringList.add("bc") ;
        String string = stringList.get(0);
        System.out.println("string = " + string);

    }
}
