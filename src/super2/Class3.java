package super2;

public class Class3 extends  ClassB{

    public Class3() {
        //super();//기본 생성자를 할 수 없음
        super(1,2);
        System.out.println("c 생성자");
    }
}
