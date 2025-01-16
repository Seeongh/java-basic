package collection.set;

/**
 * 중복을 허용하지 않는 set
 * O(n)으로 성능이 떨어짐 - 데이터 추가시마다 더 느려짐"i
 */
public class MyHashSetV0Main {
    public static void main(String[] args) {
        MyHashSetV0 set = new MyHashSetV0();
        set.add(1); //O(1)
        set.add(2); //0(n)
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(6);
        System.out.println(set);

        boolean result = set.add(4); //중복 데이터 저장
        System.out.println("중복 데이터 저장 결과 = " + result);
        System.out.println(set);

        System.out.println("set.contains(3) = " + set.contains(3)); // O(n)
    }
}
