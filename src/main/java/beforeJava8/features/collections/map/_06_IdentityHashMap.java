package beforeJava8.features.collections.map;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class _06_IdentityHashMap {

    public static void main(String[] args) {

        /*
            IdentityHashMap
            ===============
            It is exactly same as HashMap (including methods and constructors) except
            the following difference.

            In the case of normal HashMap, JVM will use equals() method to identify
            duplicate keys, which is meant for content comparison.But, in the case of
            IdentityHashMap, JVM will use == operator to identify duplicate keys, which
            is meant for reference (address) comparison.
        */
        IdentityHashMapDemo.demo();
        /*
            Here, I1 and I2 are duplicate keys because the I1.equals(I2) returns true.
            If we replace HashMap with IdentityHashMap, then I1 and I2 are not duplicate keys
            because I1 == I2 returns false.

            Note: As of today, the IdentityHashMap is working. I believe it started using
            equals() method.
        */
    }

}

class IdentityHashMapDemo {

    public static void demo() {
        HashMap<Integer, String> hashMap = new HashMap<>();
        Integer i1 = 10;
        Integer i2 = 10;
        hashMap.put(i1, "John");
        hashMap.put(i2, "Alex");
        System.out.println(hashMap);

        IdentityHashMap<Integer, String> identityMap = new IdentityHashMap<>();
        Integer i3 = Integer.valueOf("10");
        Integer i4 = Integer.valueOf("10");
        identityMap.put(i3, "John");
        identityMap.put(i4, "Alex");
        System.out.println(identityMap);
    }

}