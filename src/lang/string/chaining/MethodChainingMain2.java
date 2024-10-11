package lang.string.chaining;

public class MethodChainingMain2 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        ValueAdder adder1 = adder.add(1); //본인을 반환하기 때문에 다 똑같음
        ValueAdder adder2 = adder.add(2);
        ValueAdder adder3 =  adder.add(4);

        int result = adder3.getValue();
        System.out.println("result = " + result);
    }
}
