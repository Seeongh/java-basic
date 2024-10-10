package lang.immutable.test;

public class MyDate2 {
    private final int year;
    private final int month;
    private final int day;

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public MyDate2 withYear(int newYear) { //불변객체에서 값을 바꿔서 반환할때는 with을 많이 씀
        return new MyDate2(newYear, month, day) ;
    }

    public MyDate2 withMonth(int newMonth) {
        return new MyDate2(year, newMonth, day) ;
    }
    public MyDate2 withDay(int newDay) {
        return new MyDate2(year, month, newDay) ;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public MyDate2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
}
