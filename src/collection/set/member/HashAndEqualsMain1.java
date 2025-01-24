package collection.set.member;

import collection.set.MyHashSetV2;

import java.sql.SQLOutput;

/**
 * equals와 hashcode를 정의하지 않은 경우
 */
public class HashAndEqualsMain1 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberNoHashNoEq m1 = new MemberNoHashNoEq("a");
        MemberNoHashNoEq m2 = new MemberNoHashNoEq("a");

        //hash code 와 equals를 구현하지 못해서 같지 않음(참조값이 같지 않으니까)
        System.out.println("a1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);

        System.out.println(set);


        //검색 실패
        MemberNoHashNoEq searchValue = new MemberNoHashNoEq("a");
        System.out.println("searchValue.hashCode()" + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains result = " + contains);
    }
}
