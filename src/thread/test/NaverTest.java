//package thread.test;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class NaverTest {
//
//    public static void main(String[] args) {
//        /**
//         * select 문 짜기
//         *
//         * [조회] Name, Description, Status
//         * [제약]
//         * 1. Description 이 null은곳은 뻄
//         * 2. Join Smith 가 만들었을것
//         * 3. 2020 1월 3일 보다 뒤고, 1월 7일보다 전에 생성된곳
//         * 4. 업데이트 되지 않은 곳
//         * 5. is Enabled 가 0 이면 Enabled 인거임
//         *
//         *select
//         *     Id,
//         *     Name,
//         *     Description,
//         *     CASE
//         *         WHEN IsEnabled = 0 THEN 'DISABLED'
//         *         ELSE 'ENABLED'
//         *     END AS Status
//         * from
//         *     UserRole
//         * where
//         *     1=1,
//         *     and Description is not null,
//         *     and Lower(trim(CreatedBy)) == 'john smith'
//         *     and Created between DATE('2020-01-03') AND DATE('2020-01-07')
//         *     AND Updated IS NULL
//         * order by
//         *     name desc;
//         */
//
//        final String ADDRESS_AT = "@";
//        final String ADDRESS_SUFFIX = ".com";
//        final String SPLIT_PREFIX = "; ";
//
//        String S = "John Doe; Perter Benjamin P-arker; Mary Jane Watsonddddd0Parker; John Elvis Doe; John E-van";
//        String C = "example";
//        //이메일 만들기
//       // if(S == null || c == null) return null;
//
//        String[] names = S.split(SPLIT_PREFIX);
//        String tmpEmail = "";
//        List<String> result = new ArrayList<>();
//
//        //중복 처리를 위해 email, 중복횟수 저장
//        Map<String, Integer> uniqueMap = new HashMap<>();
//        String domain = ADDRESS_AT + C + ADDRESS_SUFFIX;
//
//        for (String name: names){
//            tmpEmail = getMailAddress(name);
//
//            // 이름 하나만 받은 경우 무시
//            if(tmpEmail == null)  continue;
//
//            getUniqueEmailId(tmpEmail, uniqueMap);
//
//
//
//            //이름 생성된 경우 메일 만들기
//            result.add(name + " <" + tmpEmail+domain +">" );
//
//        }
//        System.out.println();
//    }
//
//    private static String getUniqueEmailId(String tmpEmail, Map<String, Integer> uniqueMap) {
//        if(uniqueMap.containsKey(tmpEmail)) {
//            int cnt = uniqueMap.get(tmpEmail) + 1; //하나 증가된값
//            uniqueMap.put(tmpEmail, cnt); //증가된 값으로 변경
//            tmpEmail = tmpEmail+cnt;
//        }
//        else {
//            uniqueMap.put(tmpEmail, 1); //처음 저장
//        }
//        return tmpEmail;
//    }
//
//    private static String getMailAddress(String name) {
//        String[] parts =  name.split(" ");
//        if(parts.length < 2) { //이름이 하나만 있는경우
//            return null;
//        }
//
//        String firstName = parts[0].toLowerCase();
//        String rawLastName = parts[parts.length - 1].toLowerCase();
//
//        // 4. 하이픈 제거 후 최대 8글자 추출
//        String LastName = rawLastName.replace("-", "");
//        if (LastName.length() > 8) {
//            LastName = LastName.substring(0, 8);
//        }
//
//        // 5. 이메일 아이디 생성
//        return firstName + "." + LastName;
//    }
//
//
//}
