package static2.ex;

public class MathArrayUtils {
    //생성 막기
    private MathArrayUtils() {

    }

    public static int sum(int[] array) {
        int total = 0;
        for (int i : array) {
            total += i;
        }

        return total;
    }

    public static double average(int[] array) {
        return (double) sum(array)/array.length;
    }

    public static int min(int[] array) {
        int min = array[0];
        for(int value: array) {
            if(value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int max(int[] array) {
        int max = array[0];
        for(int value: array) {
            if(value > max) {
                max = value;
            }
        }
        return max;
    }
}
