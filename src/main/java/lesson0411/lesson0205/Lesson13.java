package lesson0411.lesson0205;

import java.util.*;

public class Lesson13 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(123456, "Vasiliy");
        map.put(123457, "Viktoria");
        System.out.println(map.size());

        System.out.println(map);
        System.out.println(map.get(123456).toUpperCase());
        System.out.println(map.containsKey(123456));
        System.out.println(map.keySet());
        Set<Integer> set = new HashSet<>(map.keySet());
        System.out.println(map.values());
        List<String> list = new ArrayList<>(map.values());


        for (Map.Entry<Integer, String> t : map.entrySet()) {
            System.out.println(t.getKey());
            System.out.println(t.getValue());
        }

    }
}
