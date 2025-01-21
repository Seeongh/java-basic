package collection.set;

import java.sql.SQLOutput;

/**
 * 문자열 해시 코드
 */
public class StringHashMain {
    static final int CAPACITY = 10 ;

    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';

        System.out.println("charA = " + (int) charA);
        System.out.println("charB = " + (int) charB);
        int hashCode = hashCode("A");
        System.out.println("hashcode = " + hashCode);

        //hashIndex
        //hashIndex(hashCode);
        System.out.println(hashIndex(hashCode("A")));
    }

    static int hashCode(String str) {
        char[] charArray = str.toCharArray();
        int sum = 0 ;
        for(char c : charArray) {
            sum = sum + (int) c;

        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
