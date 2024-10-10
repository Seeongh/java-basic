package lang.immutable.address;

/**
 * 불변 객체
 * : 하나의 값이 바뀌면 다같이 바뀌면 안될때
 *
 * 가변 객체 : 하나의 값이 바뀌면 다같이 바뀌어야할때 ex. 가족이 이사를간다 하면 주소를 다 바꿔주어야함
 */
public class ImmutableAddress {
    private final String value; //final 넣으면 불변객체 표시할 수 있음  setter불가

    //생성자를 통해서만 변경 가능
    public ImmutableAddress(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }

    public String getValue() {
        return value;
    }
}
