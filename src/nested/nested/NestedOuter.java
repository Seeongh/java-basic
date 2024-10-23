package nested.nested;

/**
 * 중첩 클래스
 *  정적 중첩 클래스 (private 도 접근가능)
 */
public class NestedOuter {
    private static int outClassValue = 3;
    private int outInstanceValue = 2;

    static class Nested {
        private int nestedInstanceValue = 1;

        public void print() {
            //자신 멤버에 접근
            System.out.println(nestedInstanceValue);
            //바깥클래스 인스턴스 멤버에 접근 불가
            //System.out.println(outInstanceValue); //static 이라

            //바깥 클래스의 클래스 멤버에 접근 가능 private도!
            System.out.println(outClassValue);
        }
    }

}
