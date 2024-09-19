package static1;

import java.sql.SQLOutput;

/**
 * 객체가 생성될 떄마다 count
 */
public class DataCountMain1 {
    public static void main(String[] args) {
        Data1 data1 = new Data1("A");
        System.out.println("a count = " + data1.count);

        Data1 data2 = new Data1("B");
        System.out.println("b count = " + data2.count);

        Data1 data3 = new Data1("C");
        System.out.println("c count = " + data3.count);


    }
}
