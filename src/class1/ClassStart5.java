package class1;

/**
 * 클래스를 배열 출력
 */
public class ClassStart5 {
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

        Student[] students = new Student[]{student1, student2};

        for(int i =0 ; i < students.length; i++) {
            System.out.println("이름 : " + students[i].name);
        }

        for(Student s: students) { //단축키 iter

            System.out.println("이름 : " + s.name);
        }


    }
}
