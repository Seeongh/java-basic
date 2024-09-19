package static1;

/**
 * static, 정적 변수의 사용(드디어!)
 */
public class Data3 {
    public String name;
    public static int count; //static
    private static int privateCnt; //privatecnt
    static int defaultCnt;

    public Data3(String name) {
        this.name = name;
        count++;
    }
}
