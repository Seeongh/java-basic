package nested;

public class ShadowingMain {
    public int value = 1;

    class Inner{
        public int value = 2;

        void go() {
            int value = 3;
            System.out.println("value = " + value);
            System.out.println("value = " + this.value); //2

            System.out.println("value = " + ShadowingMain.this.value); //1
        }
    }
}

