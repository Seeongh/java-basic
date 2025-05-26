package collection.set.member;

import collection.set.MyHashSetV2;

/**
 * equals는 정의하지 않고 hashCode만 정의한 경우
 */
public class HashAndEqualsMain2 {

    public static void main(String[] args) {
        MyHashSetV2 set = new MyHashSetV2(10);
        MemberOnlyHash m1 = new MemberOnlyHash("a"); //ID로 해시코드를 만듦
        MemberOnlyHash m2 = new MemberOnlyHash("a"); //ID로 해시코드를 만듦

        // equals를 구현하지 못해서 같지 않음(해시는 같지만 참조값이 다름)
        System.out.println("a1= " + m1 +" m2 = " + m2 +"a1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);

        System.out.println(set);


        //검색 실패
        //MemberNoHashNoEq searchValue = new MemberNoHashNoEq("a");
        MemberOnlyHash searchValue = new MemberOnlyHash("a");
        System.out.println("searchValue.hashCode()" + searchValue.hashCode());
        boolean contains = set.contains(searchValue);
        System.out.println("contains result = " + contains);
    }
}
