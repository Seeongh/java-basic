package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {
    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("studentA", 90);
        studentMap.put("studentb", 80);
        studentMap.put("studentc", 90);
        studentMap.put("studentd", 100);
        //순서 보장안함
        System.out.println(studentMap);

        //값 조회
        Integer result = studentMap.get("studentd");
        System.out.println("Result = " + result);

        // key 를 set으로 반환
        System.out.println("keyset 활용");
        Set<String> strings = studentMap.keySet();
        System.out.println(strings);

        //key 와 value를 저장하는 객체
        System.out.println("키 값의 묶음 entrySet");
        Set<Map.Entry<String, Integer>> entries = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key +" , value = "  + value );
        }

        //순서가 보장되지 않는 리스트의 상위타입인 컬렉션으로 나옴
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println(value);

        }
    }
}
