package thread.control.printer;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static thread.util.MyLogger.log;

/**
 * yield 적용
 */
public class MyPrinterV4 {
    public static void main(String[] args) throws InterruptedException {
        Scanner userInput = new Scanner(System.in);

        Printer printer = new Printer();
        Thread printerThread = new Thread(printer);

        printerThread.start();

        while(true) {
            log("프린터할 문서를 입력하세요. 종료(q):");
            String input = userInput.nextLine();
            if(input.equals("q")) {
                //printer.work = false;
                printerThread.interrupt();
                break;
            }
            printer.addJob(input);
        }

    }

    static class Printer implements Runnable{
        volatile boolean work = true; //여러쓰레드 동시 접근
        Queue<String> jobQueue = new ConcurrentLinkedQueue<>(); //여러쓰레드 동시 접근

        public void addJob(String input) {
            jobQueue.offer(input);
        }

        @Override
        public void run() {
            while(!Thread.interrupted()) {
                if(jobQueue.isEmpty()) {
                    Thread.yield(); //의미없이 CPU 를 태우지말고 차라리 다른 작업을해

                    continue;
                }


                try {
                    String job = jobQueue.poll();
                    log("출력시작 " + job +", 대기 문서 : " + jobQueue);
                    Thread.sleep(3000);

                    log("출력완료");
                } catch (InterruptedException e) {
                    log("인터럽트!");
                    log("인터럽트 상태:" + Thread.currentThread().getState()); //Runnable
                    break;
                }
            }
            log("프린터 종료");
        }
    }
}
