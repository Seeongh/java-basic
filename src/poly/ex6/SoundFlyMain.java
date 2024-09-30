package poly.ex6;

public class SoundFlyMain {
    public static void main(String[] args) {
        Dog d = new Dog();
        Bird b = new Bird();
        Chiken ck = new Chiken();

        soundAnimal(d);
        soundAnimal(b);
        soundAnimal(ck);

       // flyAnimal(d); //fly 아니라 안댐
        flyAnimal(b);
        flyAnimal(ck); 

    }

    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("테스트");
        animal.sound();
        System.out.println("종료");
    }

    //FLY 인터페이스 있을 경우 사용
    private static void flyAnimal(Fly fly) {
        System.out.println("날기 시작");
        fly.Fly();
        System.out.println("종료");
    }
}
