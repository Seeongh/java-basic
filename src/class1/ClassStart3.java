package class1;

/**
 * 클래스 활용하기
 */
public class ClassStart3 {
    public static void main(String[] args) {

        Student student1; //설계도 (Student 타입을 받도록 대기 -> 안에 변수 공간까지 확보해둠)
        student1 = new Student(); //메모리에 생성-> 참조값 반환
        student1.name = "학생1"; //객체 접근 . 으로 함
        student1.age= 15;
        student1.grade = 90;

        Student student2 = new Student(); //메모리에 생성
        student2.name = "학생2";
        student2.age= 16;
        student2.grade = 80;

        System.out.println("이름 : " + student1.name + " 나이 : " + student1.age);
        System.out.println(student2); //참조 주소
        System.out.println(student1);
    }
}
