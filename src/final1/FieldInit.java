package final1;

public class FieldInit {
    static final int CONST_VALUE = 10 ; // static final 은 대문자를 씀
    final int value = 10;

    public FieldInit() {
        //this.value = value; //지역변수여도 초기화를 실행했으면 생성자를 통해 초기화 불가
    }
}
