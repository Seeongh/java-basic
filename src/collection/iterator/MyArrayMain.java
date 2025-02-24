package collection.iterator;

import java.util.Iterator;

public class MyArrayMain {
    public static void main(String[] args) {
        MyArray myArray = new MyArray(new int[]{1, 2, 3, 4});

        Iterator<Integer> iterator = myArray.iterator(); //반복 가능(반복자 반환)

        System.out.println("iterator 사용");
        while(!iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println("next = " + next);
        }
    }
}
