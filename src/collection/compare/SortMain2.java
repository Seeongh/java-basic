package collection.compare;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Comparator;

public class SortMain2 {
    public static void main(String[] args) {
        Integer[] array = {3,2,1};

        //정렬
        System.out.println("기본 정렬 후 ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        System.out.println("comparator 비교");
        Arrays.sort(array, new AscComparator());
        System.out.println(Arrays.toString(array));

        System.out.println("내림차순 비교");
        Arrays.sort(array, new DescComparator());
        System.out.println(Arrays.toString(array));

    }

    /**
     * comparator 구현
     */
    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + " o2 = " + 02);

            return (o1 < o2)? -1: ((01==01)? 0: 1);
        }
    }

    /**
     * comparator 구현
     */
    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            System.out.println("o1 = " + o1 + " o2 = " + 02);

            return (o1 < o2)? -1: ((01==01)? 0: 1) * -1; //음수를 곱해서 반대로
        }
    }
}
