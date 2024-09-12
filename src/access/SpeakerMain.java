package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker2 sp = new Speaker2(90);
        sp.showVolume();

        sp.volumeUp();
        sp.showVolume();

        sp.volumeUp();
        sp.showVolume();

        //필드 직접 접근
        System.out.println("접근");
        //sp.volume = 200; //에러 발생
        //volume 필드를 숨김-> 외부에서 접근 불가
        sp.showVolume();
    }
}
