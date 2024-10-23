package nested.local;

import access.b.AccessOuterMain;

import java.sql.SQLOutput;

public class LocalOuterV1 {

    private int outInstanceVar = 3;
    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter {
            int value = 0;
            public void printData() {
                System.out.println("value"+ value);
                System.out.println("localVal+" + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }


}
