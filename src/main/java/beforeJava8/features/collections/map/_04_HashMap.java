package beforeJava8.features.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class _04_HashMap {

    public static void main(String[] args) {

        /*
            HashMap
            =======
            1.	The underlying DSA is Hashtable
            2.	The insertion order is not preserved, and it's based on hashCode of keys.
            3.	Duplicate keys aren't allowed, but values can be duplicated.
            4.	Heterogeneous objects allowed for both key and value.
            5.	Null is allowed for a key only once.
            6.	Null is allowed for value any number of times.
            7.	HashMap implements Serializable and Cloneable interfaces.
            8.	It is the best choice if our frequent operation is searching operation.

            HashMap Constructors
            ====================
            HashMap m = new HashMap();
            Creates an empty HashMap object with default initial capacity 16 and default fill ratio 0.75.

            HashMap m = new HashMap(int initialCapacity);
            Creates an empty HashMap object with specified initial capacity 16 and default fill ratio 0.75.

            HashMap m = new HashMap(int initialCapacity, float fillRatio);
            Creates an empty HashMap object with specified initial capacity and fill ratio.

            HashMap m = new HashMap (Map m);
            Creates an equivalent HashMap object for the given Map.
        */
        HashMapDemo.demo();

        /*
            To get synchronized version of HashMap object
            =============================================
            By default, HashMap is non-synchronized, but we can get synchronized version of HashMap
            by using the synchronizedMap() method of Collections class.
            HashMap m = new HashMap();
            Map m1 = Collections.synchronizedMap(m);
        */
    }

}

class HashMapDemo {

    public static void demo() {
        Map<String, Object> hashmap = new HashMap<>();
        hashmap.put("Car", "Benz");
        hashmap.put("Bike", "Honda");

        Map<String, Object> hashmap1 = new HashMap<>();
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