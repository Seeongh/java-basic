package lang.wrapper;

/**
 * 기본형과 wrapper클래스의 성능 차이
 * 3배 -> 5배 정도 소요
 */
public class WrapperVsPrimitive
{
    public static void main(String[] args) {
        int iterations = 1_000_000_000; //숫자 구분 , 반복횟수
        long startTime, endTime ;

        long sumPrimitive = 0;

        startTime = System.currentTimeMillis();
        for(int i  = 0 ; i < iterations; i++) {
            sumPrimitive++;
        }
        endTime = System.currentTimeMillis();

        System.out.println("sumprimitive" + sumPrimitive);
        System.out.println("실행 "  +(endTime-startTime));

        //WRAPPER 클래스 실행
        Long sumWapper = 0L;
        startTime = System.currentTimeMillis();
        for(int i  = 0 ; i < iterations; i++) {
            sumWapper += i; //오토 박싱
        }
        endTime = System.currentTimeMillis();

        System.out.println("sumprimitive" + sumPrimitive);
        System.out.println("실행 "  +(endTime-startTime));


    }
}
