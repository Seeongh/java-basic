package collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 키 중복 확인 후 값 추가하기
 */
public class MapMain3 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 50);
        System.out.println(studentMap);

        //학생이 없는 경우에만 데이터 추가
        if (!studentMap.containsKey("studentA")) {
            studentMap.put("studentA", 100);
        }

        System.out.println(studentMap);

        //학생 없는경우 추가
        studentMap.putIfAbsent("studentA", 100);
        studentMap.putIfAbsent("studentB", 100);
        System.out.println(studentMap);

    }
}
