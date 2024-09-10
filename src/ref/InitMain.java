package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData in = new InitData();

        System.out.println(in.value); //멤버변수 자동 초기화
        System.out.println(in.value2);

        notinitval();
    }

    static  void notinitval() {
        int result;

       // System.out.println(result); // 초기화 하지않아 에러발생
    }
}
