package beforeJava8.features.collections.map;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class _05_LinkedHashMap {

    public static void main(String[] args) {

        /*
            LinkedHashMap
            =============
            LinkedHashMap is a child class of HashMap.It is exactly the same as HashMap (including
            methods and constructors) except the following differences.

            LinkedHashMap
            =============
            1. The underlying DSA is a combination of LinkedList and Hashtable.
	        2. Insertion order is preserved.

	        LinkedHashMap Constructors
            ==========================
            LinkedHashMap m = new LinkedHashMap();
            Creates an empty LinkedHashMap object with default initial capacity 16 and default fill ratio 0.75.

            LinkedHashMap m = new LinkedHashMap(int initialCapacity);
            Creates an empty LinkedHashMap object with specified initial capacity 16 and default fill ratio 0.75.

            LinkedHashMap m = new LinkedHashMap(int initialCapacity, float fillRatio);
            Creates an empty LinkedHashMap object with specified initial capacity and fill ratio.

            LinkedHashMap m = new LinkedHashMap (Map m);
            Creates an equivalent LinkedHashMap object for the given Map.
        */
        LinkedHashMapDemo.demo();

        /*
            Note:
            =====
            LinkedHashSet and LinkedHashMap are commonly used for developing
            cache-based applications.
        */
    }

}

class LinkedHashMapDemo {

    public static void demo() {
        Map<String, Object> hashmap = new LinkedHashMap<>();
        hashmap.put("Car", "Benz");
        hashmap.put("Bike", "Honda");

        Map<String, Object> hashmap1 = new LinkedHashMap<>();
        hashmap1.put("Name", "Alex");
        hashmap1.put("Age", 28);
        hashmap1.put("Salary", 80000.00);
        hashmap1.putAll(hashmap);
        hashmap1.put("Address", "Jefferson Street");
        hashmap1.put("City", "Dallas");
        hashmap1.put("State", "Texas");
        hashmap1.put("Country", "USA");

        System.out.println(hashmap1);
        System.out.println(hashmap1.isEmpty());
        System.out.println(hashmap1.size());
        System.out.println(hashmap1.get("Name"));
        System.out.println(hashmap1.containsKey("Salary"));
        System.out.println(hashmap1.containsValue("Benz"));
        System.out.println(hashmap1.remove("Age"));
        System.out.println(hashmap1.replace("Address", "Bay-way"));
        System.out.println(hashmap1);
        System.out.println(hashmap1.keySet());
        System.out.println(hashmap1.values());
        hashmap1.entrySet().forEach(entry -> System.out.println(entry.getKey()+" : "+entry.getValue()));
        System.out.println("***********************************");
        hashmap1.forEach((key, value) -> System.out.println(key + " : " + value));
        System.out.println("***********************************");
        hashmap1.entrySet().stream().iterator().forEachRemaining(System.out::println);
        System.out.println("***********************************");
        Iterator<Map.Entry<String, Object>> iterator = hashmap1.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Object> entry = iterator.next();
            System.out.println(entry.getKey()+ " : "+entry.getValue());
        }
        System.out.println("***********************************");
        for (Map.Entry<String, Object> entry : hashmap1.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("***********************************");
        hashmap1.clear();
        System.out.println(hashmap1);
    }

}