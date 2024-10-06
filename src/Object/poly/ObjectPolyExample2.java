package Object.poly;

/**
 * 오브젝트 배열
 */
public class ObjectPolyExample2 {

    public static void main(String[] args) {
        Dog d = new Dog();
        Car c = new Car();

         Object o = new Object();

        Object[] object = {d, c, o};

        size(object);
    }

    private static void size(Object[] object) {
        //들어온 클래스가 변경되어도 어디든 사용할 수 있음
        System.out.println("전달된 객체 수는 : " + object.length);
    }
}
