package collection.list;

/**
 * 자료구조와 다형성의 활용(OCP 원칙)
 */
public class BatchProcessor {
    private final MyList<Integer> list;

    //MyList로 자식 클래스를 받을 수 있음.
    //생성자 의존성 주입
    public BatchProcessor(MyList<Integer> list) {
        this.list = list;
    }
    
    public void logic(int size) {
        long startTime = System.currentTimeMillis();
        for(int i =0 ; i <size; i++) {
            list.add(0,i); //앞에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("크기 : " + size + " 계산 시간 = " + (startTime-endTime) + "ms");
    }
}
