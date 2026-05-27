package ReviseMapDemo.ReviseHashMapDemo;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MyHashMap {
    public static void main(String[] args) {
        // duplicate keys not allowed.
        // order not preserved.
        // null allowed at once only because duplicate keys not allowed
        Map<String, Integer> map = new HashMap<>();
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put(null, 6); // allowed
        map.put(null, 8); // not allowed

        System.out.println(map);
        System.out.println(map.get(null));

        if(map.containsKey("four")) {
            System.out.println(map.get("four"));
        }

        // fetch all keys
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(20);

        for(Integer data : set) {
            System.out.println(data);
        }

        for(String data : map.keySet()) {
            System.out.println("Key : " + data + " - Value : " + map.get(data));
        }
        System.out.println("\n");

        // another approach
        for(Integer value : map.values()) {
            System.out.println("Value : " + value);
        }

        System.out.println("\n");

        // traditional approach
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " - Value : " + entry.getValue());
        }

        map.forEach((key, value) -> {
            System.out.println(key + " - " + value);
        });
    }
}
