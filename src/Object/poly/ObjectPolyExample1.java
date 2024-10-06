package Object.poly;

/**
 * Object 다형성
 */
public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog d = new Dog();
        Car c = new Car();

        action(d);
        action(c);
    }

    private static void action(Object obj) {
       /* obj.sound(); //compile 오류 Ojbect에는 기능이 없음
        obj.move();*/

        //객체에 맞는 다운캐스팅
        if(obj instanceof Dog dog) {
            dog.sound();
        }else if(obj instanceof Car car) {
            car.move();
        }
    }
}
