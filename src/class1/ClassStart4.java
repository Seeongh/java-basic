package class1;

/**
 * 클래스를 배열로 활용
 */
public class ClassStart4 {
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

        Student[] students = new Student[2];
        students[0] = student1; //java에서 대입은 복사
        students[1] = student2;

        System.out.println(students[0].name);

    }
}
