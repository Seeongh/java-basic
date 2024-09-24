package extend1.overriding;

public class Car {
    public void move() {
        System.out.println("이동");
    } //여기서 final 붙이면 재정의 불가 private설정시 자식에서도 보이지않음

    public void openDoor() {
        System.out.println("문 염");
    }
}
