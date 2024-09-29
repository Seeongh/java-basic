package poly.ex1;

public class AnimalSoundMain {

    public static void main(String[] args) {
        Dog d = new Dog();
        Cat cat = new Cat();

        System.out.println("동물 소리 테스트");
        d.sound();
        soundCat(cat); //dog를 넣으면 에러가 남

        //다른 동물이 들어올떄마다 코드가 늘어남
        //타입이 달라서 배열도 불가
    }

    private static void soundCat(Cat cat) {
        cat.sound();
    }
}
