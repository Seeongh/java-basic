package lang.string.builder;

public class LoofStringMain {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        String result = "" ;

        //2.5초
        for(int i = 0; i< 100000; i++) {
            result += "hello java!" ;
        }
        long endTime = System.currentTimeMillis();

        System.out.println("result = " + result);
        System.out.println("time = " + (endTime- startTime) +"ms");


        StringBuilder sbResult = new StringBuilder();
        startTime = System.currentTimeMillis();
        for(int i =0 ; i< 100000; i++) {
            sbResult.append("hello java!");
        }
        endTime = System.currentTimeMillis();
        System.out.println("time = " + (endTime- startTime) +"ms");
    }
}
