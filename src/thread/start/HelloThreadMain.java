package thread.start;

public class HelloThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() +" : main.start()"); //현재 실행 객체 반환 (자바가 생성해주는 기본 main 쓰레드)
        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + " : start()호출 전");
        helloThread.start(); //thread-0
        /**
         * start 메서드를 통해 run()메서드를 호출함
         * thread 실행 순서는 언제든 달라짐
         * 1. main 쓰레드가 객체인스턴스 생성
         * 2. thread-0를 위한 별도의 stack 공간을 할당 받음
         * 3. thread-0가 method run을 스텍프레임에 넣고 실행
         * * main thread는 기다리지 않고 밑에 코드 실행
         */
        System.out.println(Thread.currentThread().getName() + " : start()호출 후");
        System.out.println(Thread.currentThread().getName() +" : main.end()");

    }
}
