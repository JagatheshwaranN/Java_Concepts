package beforeJava8.features.collections.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class _04_SortedSet {

    public static void main(String[] args) {

        /*
            SortedSet
            =========
            SortedSet is the child interface of Set. If we want to represent a group of
            individual objects according to some sorting order without duplicates, then
            we should go for SortedSet.

            SortedSet Specific Methods
            ==========================
            Object first()
            It returns the first element of the SortedSet.

            Object last()
            It returns the last element of the SortedSet.

            SortedSet headSet(Object o)
            It returns the SortedSet elements that are less than Object o.

            SortedSet tailSet(Object o)
            It returns the SortedSet elements that are >= Object o.

            SortedSet subSet(Object o1, Object o2)
            It returns SortedSet whose elements are >= Object o1 and < Object o2.

            Comparator comparator()
            It returns a Comparator object that describes underlying sorting technique.
            If we are using default natural sorting order, then we will get null.

            The default natural sorting order for numbers is ascending order and for
            String objects its alphabetical order.
        */
        SortedSetDemo.demo();
    }

}

class SortedSetDemo {

    public static void demo() {
        SortedSet<Object> sortedSet = new TreeSet<>();
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
