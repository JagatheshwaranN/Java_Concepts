package java.features.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _09_Collections_Search {

    public static void main(String[] args) {

        /*
            Collections
            ===========
            Collections class defines several utility methods for collection objects like sorting,
            searching, reversing, etc.

            Collections class defines the following two binarySearch() methods.

            public static int binarySearch(List l, Object target);
            If we want the list to search, according to default natural sorting order, then we have to
            use this method.

            public static int binarySearch(List l, Object target, Comparator c);
            If we want the list to search, according to customized sorting order, then we have to use
            this method.

            The above search methods internally will use binarySearch algorithm.Successful search
            returns index.Unsuccessful search returns insertion-point.

            InsertionPoint is the location where we can place a target element in the sorted list.
            Before calling binarySearch() method, a compulsory list should be sorted otherwise we
            will get the unpredictable results.

            If the list is sorted according to comparator, then at the time of search operation also,
            we have to pass the same comparator object otherwise we will get the unpredictable results.
        */
        CollectionSearchDemo.demo();
        CollectionCustomSearchDemo.demo();

        /*
            Note: Points to Remember
            ========================
            For the list of 'n' elements, In the case of binarySearch() method,
            1.	Successful search result range   -> 0 to n-1
            2.	Unsuccessful search result range -> -(n+1) to -1
            3.	Total result range               -> -(n+1) to n-1

            Example,
            | A | K | Z |

            Successful search result range   -> 0  to 2
            Unsuccessful search result range -> -4 to -1
            Total result range               -> -4 to 2
        */
    }

}

class CollectionSearchDemo {

    public static void demo() {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("M");
        arrayList.add("K");
        arrayList.add("a");
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
        System.out.println(Collections.binarySearch(arrayList, "Z"));
        System.out.println(Collections.binarySearch(arrayList, "J"));
    }

}

class CollectionCustomSearchDemo {

    public static void demo() {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(0);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(5);
        System.out.println(arrayList);
        Collections.sort(arrayList, new MyComparator2());
        System.out.println(arrayList);
        System.out.println(Collections.binarySearch(arrayList, 10, new MyComparator2()));
        System.out.println(Collections.binarySearch(arrayList, 13, new MyComparator2()));
        System.out.println(Collections.binarySearch(arrayList, 17));
    }

}

class MyComparator2 implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        Integer s1 = (Integer)o1;
        Integer s2 = (Integer)o2;
        return s2.compareTo(s1);
    }

}