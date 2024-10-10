package lang.immutable.test;

public class ImmutableMyDateMain {
    public static void main(String[] args) {
        MyDate2 date1= new MyDate2(2024,1,1);
        MyDate2 date2= date1;

        System.out.println("date 1 = " + date1);
        System.out.println("date 2 = " + date2);

        System.out.println("2025 -> date 1;");

        date2 = date1.withYear(2025);

        System.out.println("date 1 = " + date1);
        System.out.println("date 2 = " + date2);

    }
}
