package collection.set.member;

import collection.set.MyHashSetV2;

/**
 * 해시 자료구조를 사용하는 경우는 hashCode, equals를 재정의해주어야함.
 * **/
public class HashAndEqualsMain3 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        Member m1 = new Member("a");
        Member  m2 = new Member("a");

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
