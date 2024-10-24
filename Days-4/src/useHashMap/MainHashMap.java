package src.useHashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainHashMap {
    public static void main(String[] args) {

        Map<String, Object> map = new HashMap<>();

        // add item
        map.put("name", "Ahmet");
        map.put("name", "Erkan");
        map.put("surname", "Bilmem");
        map.put("city", "İstanbul");
        map.put("age", 23);
        map.put("status", true);

        // get item
        System.out.println( map.get("name") );
        System.out.println("=====================");

        // all keys
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key + ":" + map.get(key));
        }
        System.out.println("=====================");
        map.forEach((k, v) ->
                System.out.println(k + ":" + v)
        );
        System.out.println("=====================");

        map.replace("status", true, false);

        // remove
        map.remove("statusx");
        //map.clear();

        int size = map.size();
        System.out.println(size);

        System.out.println(map);
    }
}
