package java.features.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class _06_ComparatorInterface {

    public static void main(String[] args) {

        /*
            Comparator(Interface)
            =====================
            Comparator present in java.util package, and it defines 2 methods as below.
                1.	Compare
                2.	Equals

            public int compare(Object obj1, Object obj2);
            1.	Returns -ve if obj1 has to come before obj2
            2.	Returns +ve if obj1 has to come after obj2
            3.	Returns 0 if both obj1 and obj2 are equal

            public boolean equals(Object obj);
            Whenever we are implementing comparator interface, compulsory we should provide
            implementation for compare() method only, and we are not required to provide
            implementation for equals() method.Because, its already available to our class
            from Object class through inheritance.
        */
        ComparatorDemo1.demo();

        /*
            Note:
            =====
            If we are not passing a comparator object in TreeSet<Object> treeSet = new TreeSet<>(new OwnComparator1())
            line, then internally JVM will call compareTo() method which is meant for default natural
            sorting order.In this case, the output is [0, 5, 10, 15, 20].
        */

        /*
            Various possible implementations of compare() method
            ====================================================

            public int compare (Object obj1, Object obj2) {
            Integer I1 = (Integer)obj1;
            Integer I2 = (Integer)obj2;
            return I1.compareTo(I2); [Ascending Order]
            return -I1.compareTo(I2); [Descending Order]
            return I2.compareTo(I1); [Descending Order]
            return -I2.compareTo(I1); [Ascending Order]
            }

            public int compare (Object obj1, Object obj2) {
            return +1; [Insertion order]
            return -1; [Reverse of insertion order]
            return 0; [Only first element will be inserted]
            }
        */
        ComparatorDemo2.demo();
    }

}

class ComparatorDemo1 {

    public static void demo() {
        TreeSet<Object> treeSet = new TreeSet<>(new OwnComparator1());
        treeSet.add(10);
        treeSet.add(0);
        treeSet.add(15);
        treeSet.add(5);
        treeSet.add(20);
        System.out.println(treeSet);
    }

}

class OwnComparator1 implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        if(i1 < i2){
            return +1;
        } else if (i1 > i2) {
            return -1;
        }else {
            return 0;
        }
    }

}

class ComparatorDemo2 {

    public static void demo() {
        TreeSet<Object> treeSet = new TreeSet<>(new OwnComparator2());
        treeSet.add("A");
        treeSet.add(new StringBuffer("ABC"));
        treeSet.add("XX");
        treeSet.add("ABCD");
        treeSet.add("A");
        System.out.println(treeSet);
    }

}

class OwnComparator2 implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        int length1 = s1.length();
        int length2 = s2.length();
        if(length1 < length2){
            return -1;
        } else if (length1 > length2) {
            return +1;
        }else {
            return 0;
        }
    }

}