package preparation.revise_1.collection;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;

public class HashMapHashTableDemo {

    public static void main(String[] args) {
        hashMapDemo();
        hashtableDemo();
    }

    public static void hashMapDemo() {
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("ONE", 1);
        hashMap.put("TWO", 2);
        hashMap.put(null, null);
        hashMap.put(null, null);
        for(Map.Entry<String, Object> entry : hashMap.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

    public static void hashtableDemo() {
        Hashtable<String, Object> hashtable = new Hashtable<>();
        hashtable.put("Apple", 1);
        hashtable.put("Banana", 2);
        // We can add null key-value into Hashtable but unable to retrieve the same. If you
        // try to retrieve, will get NPE.
        // hashtable.put(null, null);
        for(String key : hashtable.keySet()){
            System.out.println(key+" "+hashtable.get(key));
        }
    }

}

