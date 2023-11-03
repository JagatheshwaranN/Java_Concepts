package java7andbelow.features.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class _05_TreeSet {

    public static void main(String[] args) {

        /*
            TreeSet
            =======
            1.	The underlying DSA is a balanced tree.
            2.	Duplicate objects are not allowed.
            3.	Insertion order is not preserved.
            4.	Heterogeneous objects are not allowed.
            5.	Null insertion is possible (Only once).
            6.	Implement Serializable and Cloneable interfaces.
            7.	All objects will be inserted based on some sorting order, it may be a default
                natural sorting order or customized sorting order.

            TreeSet Constructors
            ====================
            TreeSet t = new TreeSet();
            Creates an empty TreeSet object where elements will be inserted according to default
            natural sorting order.

            TreeSet t = new TreeSet(Comparator c);
            Creates an empty TreeSet object where elements will be inserted according to customized
            sorting order specified by Comparator object.

            TreeSet t = new TreeSet(Collection c);
            Creates an equivalent TreeSet object for the given collection.

            TreeSet t = new TreeSet(SortedSet S);
            Creates an equivalent TreeSet object for the given SortedSet.
        */
        TreeSetDemo1.demo();

        /*
            Null Acceptance
            ===============
            1.	For non-empty TreeSet if we are trying to insert null, then we will get the
                NullPointerException.

            2.	For empty TreeSet as a first element, null is allowed, but after inserting
                the null if we are trying to insert any other element, we will get the runtime
                exception saying NullPointerException.

            Note:
            =====
            Until 1.6 v, null is allowed as a first element to the empty TreeSet, but from 1.7 v
            onwards null is not allowed even as the first element i.e., (A null such type of story
            is not applicable for TreeSet from 1.7 v).
        */


        /*
            Comparable
            ==========
            If we are depending on default natural sorting order, compulsory objects should be
            homogenous and comparable. Otherwise, we will get the runtime exception, saying CCE.
            An object is said to be comparable if and only if the corresponding class implements
            comparable interface.
        */
        TreeSetDemo2.demo();
    }

}

class TreeSetDemo1 {

    public static void demo() {
        TreeSet<Object> sortedSet = new TreeSet<>();
        sortedSet.add(100);
        sortedSet.add(101);
        sortedSet.add(104);
        sortedSet.add(106);
        sortedSet.add(110);
        sortedSet.add(115);
        sortedSet.add(120);
        System.out.println(sortedSet.first());
        System.out.println(sortedSet.last());
        System.out.println(sortedSet.headSet(106));
        System.out.println(sortedSet.tailSet(106));
        System.out.println(sortedSet.subSet(101, 115));
    }

}

class TreeSetDemo2 {

    public static void demo() {
        TreeSet<Object> treeSet = new TreeSet<>();
        treeSet.add(new StringBuffer("B"));
        treeSet.add(new StringBuffer("A"));
        treeSet.add(1);
        System.out.println(treeSet);
    }

}
