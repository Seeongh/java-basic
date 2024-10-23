package nested.local;

public class LocalOuterV3 {

    private int outInstanceVar = 3;
    public void process(int paramVar) {
        int localVar = 1;

        class LocalPrinter implements Printer {
            int value = 0;
            public void printData() i{
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
