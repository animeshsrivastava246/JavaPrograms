package MyCollectionFramework;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class MainHashMap {
    public static void main(String[] args) {
        Map<String, Integer> num = new HashMap<>();
        num.put("one", 1);
        num.put("two", 2);
        num.put("five", 5);
        num.putIfAbsent("one", 10);
        System.out.println(num);
        System.out.println(num.get("five"));
        System.out.println(num.get("three"));
        System.out.println(num.containsKey("three"));
        System.out.println(num.containsValue(5));
        System.out.println(num.remove("two"));
        System.out.println(num.remove("five",50));
        System.out.println(num);
        System.out.println(num.entrySet());
        System.out.println(num.keySet());
        System.out.println(num.values());
        Set<Entry<String, Integer>> entries = num.entrySet();
        for (Entry<String, Integer> entry : entries)
            entry.setValue(entry.getValue()*10);
        System.out.println(num);
    }
}