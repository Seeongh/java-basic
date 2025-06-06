package collection.set;

import collection.set.member.Member;
import jdk.swing.interop.SwingInterOpUtils;

public class JavaHashCodeMain {
    //object 의 hashcode는 객체의 참조값을 기반으로 생성

    public static void main(String[] args) {
        Object obj1 = new Object();
        Object obj2 = new Object();
        System.out.println("obj1.hashcode = " + obj1.hashCode());
        System.out.println("obj2.hashcode= " + obj2.hashCode());

        //각 클래스 마다 hashCode를 이미 오버라인딩 해둔다
        Integer i = 10 ;
        String strA = "A";
        String strAB="AB";

        System.out.println("10.hashCode() = " + i.hashCode());
        System.out.println("A.hashCOde() = " + strA.hashCode());
        System.out.println("AB.hashCode() = " + strAB.hashCode());

        //hashcode는 마이너스 값이 들어올 수 있다.
        System.out.println(Integer.valueOf(-1).hashCode());

        //둘은 같을까 다를까 , 인스턴스는 다르지만 , eqauls는같다.
        Member member1 = new Member("idA");
        Member member2 = new Member("idA");

        System.out.println("member 1== member2  = " + (member1 == member2));
        System.out.println("member1 equals member2 = " + (member1.equals(member2)));
        System.out.println("member1.hashCode()" + member1.hashCode());
        System.out.println("member2.hashCode()" + member2.hashCode());
    }
}
