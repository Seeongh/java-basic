package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("정적 호출");
        DecoData.staticCall();

        System.out.println("2.인스턴스 출");
        DecoData data1 = new DecoData();
        data1.instanceCall();


        System.out.println("2.인스턴스 출");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        DecoData data3 = new DecoData();
        data3.staticValue
        int instanceValue = data3.instanceValue;

        int staticValue = DecoData.staticValue;
        //DecoData.instanceValue; //접근 불가
    }
}
