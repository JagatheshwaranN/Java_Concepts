package java7andbelow.features.collections.set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class _06_NavigableSet {

    public static void main(String[] args) {

        /*
            Java 1.6 v Enhancements in Collection Framework
            ===============================================
            As a part of Java 1.6 v enhancements, the following concept introduced in the
            collection framework.

            1.	NavigableSet

            NavigableSet
            ============
            It is the child interface of SortedSet, and it defines several methods for
            navigation purposes.

            Collection(I) -> Set(I) -> SortedSet(I) -> NavigableSet(I) -> TreeSet(C)

            NavigableSet Methods
            ====================
            floo(e)
            It returns the highest element which is <= e.

            lower(e)
            It returns the highest element which is < e.

            ceiling(e)
            It returns the lowest element which is >= e.

            higher(e)
            It returns the lowest element which is > e.

            pollFirst()
            It removes and returns the first element.

            pollLast()
            It removes and returns the last element.

            descendingSet()
            It returns NavigableSet in reverse order.
        */
        NavigableSetDemo.demo();
    }

}

class NavigableSetDemo {

    public static void demo() {
        NavigableSet<Object> navigableSet = new TreeSet<>();
        navigableSet.add(100);
        navigableSet.add(200);
        navigableSet.add(300);
        navigableSet.add(400);
        navigableSet.add(500);
        System.out.println(navigableSet);
        System.out.println(navigableSet.floor(300));
        System.out.println(navigableSet.lower(300));
        System.out.println(navigableSet.ceiling(200));
        System.out.println(navigableSet.higher(200));
        System.out.println(navigableSet.pollFirst());
        System.out.println(navigableSet.pollLast());
        System.out.println(navigableSet.descendingSet());
    }

}
