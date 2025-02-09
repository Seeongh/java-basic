package collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 키 중복시 바꿔치기
 */
public class MapMain2 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA", 100);
        System.out.println(studentMap);

        boolean studentA = studentMap.containsKey("studentA");
        System.out.println("containe = " + studentA);

        studentMap.remove("studentA");

    }
}
