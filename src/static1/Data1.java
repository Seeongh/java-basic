package static1;


/**
 * 객체가 생성될 때마다 생성되는 객체수를 셈
 */
public class Data1 {
    public String name;
    public int count;

    public Data1(String name) {
        this.name = name;
        count++;
    }


}
