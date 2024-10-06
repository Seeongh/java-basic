package Object;

//부모가 없으면 묵시적으로 Object클래스를 상속 받는다
public class Parent extends Object {

    public void parentMethod() {
        System.out.println("parent parentMethod");
    }
}
