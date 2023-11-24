package java7andbelow.features.concurrentcollections;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class _03_ConcurrentMap {

    public static void main(String[] args) {

        /*
            ConcurrentMap
            =============
            Map (I) <= ConcurrentMap (I) <= ConcurrentHashMap (C)
            The ConcurrentMap is the child interface of the Map Interface.It has 3
            specific methods as below.

            ConcurrentMap Methods
            =====================
            1. Object putIfAbsent(Object key, Object value)
               To add entry to the Map if the specified key is not already available.

               If the key is already present, then entry won't be added and returns
               old associated value. If the key is not available, then only entry will
               be added.

            2. boolean remove(Object key, Object value)
               To remove the entry, if the key is associated with the specified value only.

            3. boolean replace(Object key, Object oldValue, Object newValue)
               To replace the old value of the entry with new value for the associated key.
        */
        ConcurrentMapDemo.demo();
    }

}

class ConcurrentMapDemo {

    public static void demo() {

        ConcurrentMap<Integer, String> concurrentMap1 = new ConcurrentHashMap<>();
        concurrentMap1.put(101, "Alex");
        concurrentMap1.put(101, "John");
        System.out.println(concurrentMap1);
        concurrentMap1.replace(101, "John", "Blake");
        System.out.println(concurrentMap1);
        concurrentMap1.remove(101);
        System.out.println(concurrentMap1);

        ConcurrentMap<Integer, String> concurrentMap2 = new ConcurrentHashMap<>();
        concurrentMap2.putIfAbsent(101, "Alex");
        concurrentMap2.putIfAbsent(101, "John");
        System.out.println(concurrentMap2);
        concurrentMap2.replace(101, "Alex", "Blake");
        System.out.println(concurrentMap2);
        concurrentMap2.remove(101);
        System.out.println(concurrentMap2);
    }

}
