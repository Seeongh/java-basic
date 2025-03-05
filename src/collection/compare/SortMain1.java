package collection.compare;

import java.util.Arrays;

public class SortMain1 {
    public static void main(String[] args) {
        Integer[] array = {3,2,1};

        //정렬
        /**
         * 왼쪽과 오른쪽 비교해서 자리 변경
         * 성능이 그렇게 좋지는 않음(O(nlongn))
         */
        System.out.println("기본 정렬 후 ");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

    }
}
