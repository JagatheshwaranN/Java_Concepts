package java7andbelow.features.collections.map;

import java.util.HashMap;
import java.util.WeakHashMap;

public class _07_WeakHashMap {

    public static void main(String[] args) {

        /*
            WeakHashMap
            ===========
            It is exactly same as HashMap (including methods and constructors) except the following
            difference.

            In the case of HashMap, even though an object doesn't have any reference, it is not
            eligible for Garbage Collector if it's associated with HashMap, i.e., HashMap dominates
            Garbage Collector.But, in the case of WeakHashMap, if an object doesn't contain any
            reference, it is eligible for Garbage Collector even though the Object associated with
            WeakHashMap i.e., Garbage Collector dominates WeakHashMap.
        */
        WeakHashMapDemo.demo();

        /*
            Points to Remember
            =================
            In the below example, a Temp object not eligible for Garbage Collection because it is associated
            with HashMap. In this case, the output is,
            {temp=Java}
            {temp=Java}

            In the below example, if we replace HashMap with WeakHashMap, then, Temp object eligible for
            Garbage Collection even though the temp is associated with WeakHashMap. In this case, the
            output is,
            {temp=Java}
            {}
        */
    }

}

class WeakHashMapDemo {

    public static void demo() {

        // HashMap<Object, Object> hashMap = new HashMap<>();
        WeakHashMap<Object, Object> hashMap = new WeakHashMap<>();
        Temp temp = new Temp();
        hashMap.put(temp, "Java");
        System.out.println(hashMap);
        temp = null;
        System.gc();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(hashMap);
    }
}

class Temp {
    public String toString() {
        return "temp";
    }

}