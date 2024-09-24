package extend1.access.parent;

public class Parent {
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void publicMehtod() {
        System.out.println("parent.public");
    }

    protected void protectedMethod() {
        System.out.println("parent.protcted");
    }

    void defaultMethod() {
        System.out.println("parent.default");
    }

    private void privateMethod() {
        System.out.println("parent.private");
    }

    public void printParent() {
        System.out.println("===parent method===");
        System.out.println("public " + publicValue);
        System.out.println("default " + defaultValue);
        System.out.println("protected " + protectedValue);
        System.out.println("private " + privateValue);


        //부모에서 접근가능
        defaultMethod();
        privateMethod();

    }
}
