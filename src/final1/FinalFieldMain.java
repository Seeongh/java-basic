package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        //final을 쓰더라도 의미가 있음
        System.out.println("생성자 초기화");
        ConstructInit c1 = new ConstructInit(10); // 이후에 수정 불가
        ConstructInit c2 = new ConstructInit(20); // 이후에 수정 불가

        //final 필드 - 필드 초기화
        System.out.println("필드 초기화");
        FieldInit f1 = new FieldInit(); //이경우 static을 사용해서 메모리 낭비를 줄이는게 나음 -> static final

        //상수
        FieldInit f2= new FieldInit();
        System.out.println(f2.CONST_VALUE);
    }
}
