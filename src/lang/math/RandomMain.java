package lang.math;

import java.util.Random;

public class RandomMain {
    public static void main(String[] args) {
        Random random = new Random();

        //seed
        //random = new Random (1) ; //seed가 같으면 실행결과가 항상 같아짐

        int randomInt = random.nextInt();
        System.out.println("random Int : " + randomInt);

        double randomDouble = random.nextDouble();
        boolean randomBoolean = random.nextBoolean();

        //범위
        int randomRange1 = random.nextInt(10); //0~9
        System.out.println("0~9 : " + randomRange1);

        int randomRange2 = random.nextInt(10) + 1 ; // 1~10
        System.out.println("1~10 : " + randomRange2);
    }
}
