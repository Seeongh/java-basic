package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; //해당 scope에 변수가 없으면 멤버변수에서 찾음. this생략가능
    }
}
