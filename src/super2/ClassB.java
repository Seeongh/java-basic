package super2;

public class ClassB extends  ClassA{

    public ClassB(int a) {
        //super(); // 기본 생성자 생략 가능 - 첫줄에 적어주는게 룰임 매개변수 없는경우엔 자동으로 만들어줌
        this(2,3); //언젠가는 super를 선언해줘야함
        System.out.println("b 생성자");
    }

    public ClassB(int a, int b) {
        super();
        System.out.println("b 생성자 인자 2개");
    }
}
