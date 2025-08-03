package MapDemo.HashMap;

import java.util.HashMap;
import java.util.Map;

public class MyHashMap {
    public static void main(String[] args) {
        // key-value pair
        // duplicate key is not allow
        // order is not preserved

        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put(null, 6); // it allow
        map.put(null, 7); // it allow many time null key in map

        System.out.println(map.get(null));

        // traverse in hashmap
        // - get()
        // - containsKey()
        if(map.containsKey("four")) {
            System.out.println(map.get("four"));
        }

        // - fetch all keys
        for (String data: map.keySet())
            System.out.println("Key is : " + data + " ---> Value : " + map.get(data));

        // -
        for(Integer value : map.values()) {
            System.out.println("Values : " + value);
        }

        // traverse according key and values with using of entry
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " - Value : " + entry.getValue());
        }

        // java 8
        map.forEach((key, value) -> {
            System.out.println("Key is : " + key + " Value is : " + value);
        });
    }
}
