package lang.string.test;

/**
 * key 문자를 찾고 찾은 문자의 수 출력
 */
public class TestString6 {
    public static void main(String[] args) {
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        int findInd = str.indexOf(key);
        int sum = 0 ;

        while(findInd > 0 ) {
            findInd = str.indexOf(key, findInd+1);
            sum++;
        }

        System.out.println(sum);
    }
}
