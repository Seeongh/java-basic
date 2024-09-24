package super1;


public class Child extends Parent {
    public String value ="child";

    @Override
    public void hello() {
        System.out.println("child hello");
    }

    public void call() {
        System.out.println("thisvalue = " + this.value);
        System.out.println("supervalue = " + super.value);

        this.hello();
        super.hello();
    }
}
