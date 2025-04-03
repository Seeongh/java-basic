package collection.set;

import collection.set.member.MemberHashNoEqReview;
import collection.set.member.MemberNoHashNoEqReview;

/**
 * hashcode와 equals 복습
 */
public class HashCodeEquals {
    public static void main(String[] args) {
        /**
         * object 기본 기능
         * hashcode : 참조 값을 기반으로 해시 코드 반환
         * equals : 동일성 비교 (참조값이 같아야 true)
         */

        //1. 구현하지 않은 경우 (Object 기본기능 사용)
        MyHashSetV2 set = new MyHashSetV2();
        MemberNoHashNoEqReview m1 = new MemberNoHashNoEqReview("A");
        MemberNoHashNoEqReview m2 = new MemberNoHashNoEqReview("A");
        System.out.println("m1. hashcode = " + m1.hashCode() );
        System.out.println("m2. hashcode = " + m2.hashCode() );
        System.out.println("m1.equals(m2) = " + m1.equals(m2));

        set.add(m1);
        set.add(m2);
        System.out.println(set); //값이 중복인데 index가 다름
        set.remove("A");


        //2. hashcode만 구현한 경우
        MemberHashNoEqReview h1 = new MemberHashNoEqReview("A");
        MemberHashNoEqReview h2 = new MemberHashNoEqReview("A");
        System.out.println("h1. hashcode = " + h1.hashCode() );
        System.out.println("h2. hashcode = " + h2.hashCode() );
        System.out.println("h1.equals(h2) = " + h1.equals(h2));

        set.add(h1);
        set.add(h2);
        System.out.println(set);
        set.remove("A");

    }
}
