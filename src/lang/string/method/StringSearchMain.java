package lang.string.method;

public class StringSearchMain {
    public static void main(String[] args) {
        String str = "Hellop, java! Welcome to java world.";

        System.out.println("문자열에 java포함 여부: " + str.contains("java"));
        System.out.println("'java'의 첫번째 인덱스 : " + str.indexOf("java"));
        System.out.println("인덱스 10부터 'java'의 인덱스 : " + str.indexOf("java", 1));
        System.out.println("java의 마지막 인덱스 : "  + str.lastIndexOf("java"));
    }
}
