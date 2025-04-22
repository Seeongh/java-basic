package collection.compare;

import java.util.Arrays;
import java.util.Comparator;

public class SortReview {
    public static void main(String[] args) {
        Integer[] array = {3,2,1};
        System.out.println(Arrays.toString(array));

        //기본정렬
        Arrays.sort(array); //1,2,3

        System.out.println(Arrays.toString(array));
        Arrays.sort(array, new AscComparator());
        Arrays.sort(array, new AscComparator().reversed());
    }

    static class AscComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return o1.compareTo(o2); //o1이 작으면 음수 같으면 0 , 크면 양수
        }
    }
}
