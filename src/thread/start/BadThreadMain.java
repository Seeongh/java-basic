package thread.start;

public class BadThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() +" : main.start()"); //현재 실행 객체 반환 (자바가 생성해주는 기본 main 쓰레드)
        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + " : start()호출 전");
        helloThread.run(); //main
        /**
         * start()가 아닌 run()을 실행하게 되면
         * main thread가 run()을 호출하게 된다.
         * => 시간의 흐름또한 main에서 다 싫행
         * => 별도의 thread에서 실행하고 싶다면 꼭! start()를 사용해야함
         *
         */
        System.out.println(Thread.currentThread().getName() + " : start()호출 후");
        System.out.println(Thread.currentThread().getName() +" : main.end()");

    }
}
