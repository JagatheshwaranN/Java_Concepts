package java7andbelow.features.collections.set;

import java.util.HashSet;

public class _02_HashSet {

    public static void main(String[] args) {

        /*
            HashSet
            =======
            1.	The underlying DSA is Hashtable.
            2.	Duplicate objects are not allowed.
            3.	Insertion order is not preserved, and it's based on hashCode of objects.
            4.	Null insertion possible (Only once).
            5.	Heterogeneous objects are allowed.
            6.	Implement Serializable and Cloneable interfaces.
            7.	HashSet is the best choice if our frequent operation is search operation.

            Note:
            =====
            In HashSet, duplicates are not allowed. If we are trying to insert duplicates, then we
            won't get any compile time / runtime errors and add() method simply returns false.

            HashSet hs = new HashSet();
            SOP(hs.add("A")); // true
            SOP(hs.add("A")); // false
        */

        /*
            HashSet Constructors
            ====================
            HashSet hs = new HashSet();
            Creates an empty hashset object with default initial capacity 16 and default
            fill ratio 0.75.

            HashSet hs = new HashSet(int initialCapacity);
            Creates an empty hashset object with specified initial capacity and default
            fill ratio 0.75.

            HashSet hs = new HashSet(int initialCapacity, float fillRatio);
            Creates an empty hashset object with specified initial capacity and specified
            fill ratio.

            HashSet hs = new HashSet(Collection c);
            Creates an equivalent hashset object for the given collection. This constructor
            is meant for interconversion between the collection objects.

            Fill Ratio / Load Factor
            ========================
            After filling how much ratio, a new hashset object will be created, this ratio
            is called as Fill Ratio / Load Factor.

            For example, Fill Ratio 0.75 means after filling 75% ratio, a new hashset object
            will be created automatically.
        */
        HashSetDemo.demo();
    }
}

class HashSetDemo {

    public static void demo() {

        HashSet<Object> hashSet = new HashSet<>();
        System.out.println(hashSet.isEmpty());
        hashSet.add("A");
        hashSet.add('b');
        hashSet.add(2);
        System.out.println(hashSet.size());
        hashSet.remove(2);
        System.out.println(hashSet.contains('b'));
        System.out.println(hashSet);
        System.out.println("*************************");
        HashSet<Object> hashSet1 = new HashSet<>();
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