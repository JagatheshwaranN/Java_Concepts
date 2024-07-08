package beforeJava8.features.collections.set;

import java.util.LinkedHashSet;

public class _03_LinkedHashSet {

    public static void main(String[] args) {

        /*
            LinkedHashSet
            =============
            It is the child class of HashSet, and it is exactly the same as HashSet
            (including the constructors and methods) except the following differences.

            1.	The underlying DSA is LinkedList and Hashtable.
            2.	Insertion order is preserved.

            LinkedHashSet Constructors
            ==========================
            LinkedHashSet hs = new LinkedHashSet();
            Creates an empty LinkedHashSet object with default initial capacity 16 and default
            fill ratio 0.75.

            LinkedHashSet hs = new LinkedHashSet(int initialCapacity);
            Creates an empty LinkedHashSet object with specified initial capacity and default
            fill ratio 0.75.

            LinkedHashSet hs = new LinkedHashSet(int initialCapacity, float fillRatio);
            Creates an empty LinkedHashSet object with specified initial capacity and specified
            fill ratio.

            LinkedHashSet hs = new LinkedHashSet(Collection c);
            Creates an equivalent LinkedHashSet object for the given collection. This constructor
            is meant for interconversion between the collection objects.
        */
        LinkedHashSetDemo.demo();
    }

}

class LinkedHashSetDemo {

    public static void demo() {

        LinkedHashSet<Object> hashSet = new LinkedHashSet<>();
        System.out.println(hashSet.isEmpty());
        hashSet.add("A");
        hashSet.add('b');
        hashSet.add(2);
        System.out.println(hashSet.size());
        hashSet.remove(2);
        System.out.println(hashSet.contains('b'));
        System.out.println(hashSet);
        System.out.println("*************************");
        LinkedHashSet<Object> hashSet1 = new LinkedHashSet<>();
        hashSet1.addAll(hashSet);
        hashSet1.add("C");
        hashSet1.add("D");
        hashSet1.add("E");
        System.out.println(hashSet1);
        hashSet1.retainAll(hashSet);
        System.out.println(hashSet1);
        System.out.println(hashSet1.containsAll(hashSet));
        hashSet1.removeAll(hashSet);
        hashSet1.add(1);
        hashSet1.add(2);
        hashSet1.add(3);
        System.out.println(hashSet1);
        hashSet1.iterator().forEachRemaining(System.out::println);
        hashSet1.clear();
        System.out.println(hashSet1);
    }

}