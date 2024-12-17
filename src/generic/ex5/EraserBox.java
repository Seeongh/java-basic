package generic.ex5;

/**
 * 타입이레이져
 *  - 컴파일러는 <T>와 같은 제네릭은 생성 시점의 타입으로 치환후
 *  - 상위 (ex Object, Animal(상위제한)) 와 같이 치환하고, 호출부분은 캐스팅을 한다.
 * @param <T>
 */
public class EraserBox <T>{

    public boolean instanceCheck(Object param) {
       // return param instanceof  T; //T가 없어지고 Object로 바뀜
        return false;
    }

    public void create() {
        //return new T();//동적 생성 불가
        return ; //return new Object가 됨.
    }

}
