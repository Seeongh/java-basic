package lang.string.builder;

/**
 * 메서드 체이닝 방식으로 되어있는 StringBuilder 변경해보기.
 */
public class StringBuilderMain1_2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("a").append("b").append("c").append("d")
                        .insert(4, "java")
                                .delete(4,8)
                                        .reverse();

        System.out.println("reverse = "+sb);

        //불변으로 변경
        String str = sb.toString();
        System.out.println(str);


    }
}
