package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 d3 = new Data3("A");
        System.out.println("a count = " + Data3.count);

        Data3 d4 = new Data3("B");
        System.out.println("b count = " + Data3.count);

        Data3 d5 = new Data3("C");
        System.out.println("c count = " + Data3.count);


        System.out.println(d5.count); //count는 heap이 아닌 메서드 영역에서 관리됨
       // System.out.println(Data3.privateCnt);
        System.out.println(Data3.defaultCnt);
    }
}
