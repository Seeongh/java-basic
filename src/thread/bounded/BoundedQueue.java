package thread.bounded;

public interface BoundedQueue {
    void put(String data); //데이터 생산(생산자 쓰레드가 호출)
    String take(); //데이터를 취함(소비자 쓰레드가 호출)
}
