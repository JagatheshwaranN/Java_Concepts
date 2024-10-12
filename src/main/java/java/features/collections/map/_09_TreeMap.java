package java.features.collections.map;

import java.util.Comparator;
import java.util.TreeMap;

public class _09_TreeMap {

    public static void main(String[] args) {

        /*
            TreeMap
            =======
            1.	The underlying DSA is RED-BLACK tree.
            2.	Insertion order is not preserved, and it is based on some sorting order of Keys.
            3.	Duplicate keys are not allowed, but values can be duplicates.
            4.	If we are depending on the default natural sorting order, then keys should be
                homogenous and comparable otherwise; we will get the runtime exception, saying CCE.
                If we are defining our own sorting by comparator, then keys need not be homogenous
                and comparable.
            5.	Whether we are depending on default natural sorting order or customized sorting order,
                there are no restrictions for values. We can take heterogeneous and non-comparable
                objects as well.

            Null Acceptance
            ===============
            1.	For non-empty TreeMap, if we are trying to insert an entry with null key, then we
                will get the runtime exception saying NPE.

            2.	For the empty TreeMap, as the first entry with a null key is allowed, but after
                inserting that entry if we are trying to insert any other entry, then we will get
                the runtime exception saying NPE.

            Note:
            =====
            The above null acceptance rule is applicable until a Java 1.6 version, and from 1.7 version
            onwards, null is not allowed for a key. But, for values we can use null any number of times.

            TreeMap Constructors
            ====================
            TreeMap t = new TreeMap();
            Creates an empty TreeMap object where elements will be inserted according to default
            natural sorting order.

            TreeMap t = new TreeMap(Comparator c);
            Creates an empty TreeMap object where elements will be inserted according to customized
            sorting order specified by Comparator object.

            TreeMap t = new TreeMap(Collection c);
            Creates an equivalent TreeMap object for the given collection.

            TreeMap t = new TreeMap(SortedMap s);
            Creates an equivalent TreeMap object for the given SortedMap.
        */
        TreeMapDemo.demo();
    }

}

class TreeMapDemo {

    public static void demo() {
        TreeMap<String, Object> treeMap = new TreeMap<>();
        treeMap.put("A", 101);
        treeMap.put("B", 103);
        treeMap.put("C", 104);
        treeMap.put("D", 107);
        treeMap.put("E", 125);
        treeMap.put("F", 136);
        // treeMap.put(null, 140); - NPE
        System.out.println(treeMap);
        System.out.println(treeMap.firstKey());
        System.out.println(treeMap.lastKey());
        System.out.println(treeMap.headMap("D"));
        System.out.println(treeMap.tailMap("D"));
        System.out.println(treeMap.subMap("B", "E"));
        System.out.println(treeMap.comparator());

        TreeMap<String, Object> treeMap1 = new TreeMap<>(new MyComparator());
        treeMap1.put("A", 101);
        treeMap1.put("B", 103);
        treeMap1.put("C", 104);
        treeMap1.put("D", 107);
        treeMap1.put("E", 125);
        treeMap1.put("F", 136);
        System.out.println(treeMap1);
    }

}

class MyComparator implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }

}