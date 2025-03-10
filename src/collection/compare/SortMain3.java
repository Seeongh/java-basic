package collection.compare;

import access.b.AccessOuterMain;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {
        MyUser myUser1 = new MyUser("A", 10);
        MyUser myUser2 = new MyUser("B", 20);
        MyUser myUser3 = new MyUser("C", 30);

        MyUser[] array = {myUser1, myUser2, myUser3};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));

        //객체가 가진 기본 정렬 사용
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("IdComparator 정렬");
        Arrays.sort(array , new IdComparator());
        System.out.println(Arrays.toString(array));

        System.out.println("Idcomparator , reverse");
        Arrays.sort(array, new IdComparator().reversed());
        System.out.println(Arrays.toString(array));



    }
}
