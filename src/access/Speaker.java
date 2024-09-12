package access;

public class Speaker {
    int volume;

    Speaker(int volume) {
        this.volume = volume;
    }

    void volumeUp() {
        if( volume >= 100) {
            System.out.println("증가 불가");
        }
        else {
            volume += 10;
            System.out.println("볼륨 증가");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("볼륨 다운");
    }


    void showVolume() {
        System.out.println("현 음량 " + volume);
    }
}
