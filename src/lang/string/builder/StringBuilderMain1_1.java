package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a");
        sb.append("b");

        System.out.println("sb = " + sb);

        sb.insert(1, "java") ;
        System.out.println("insert = " + sb);


        sb.delete(1,2);
        System.out.println("delete: " + sb);
        
        sb.reverse();
        System.out.println("reverse = "+sb);

        //불변으로 변경
        String str = sb.toString();
        System.out.println(str);


    }
}
