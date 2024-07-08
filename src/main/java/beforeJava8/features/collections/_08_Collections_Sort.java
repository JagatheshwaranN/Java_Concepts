package beforeJava8.features.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _08_Collections_Sort {

    public static void main(String[] args) {

        /*
            Collections
            ===========
            Collections class defines several utility methods for collection objects like sorting,
            searching, reversing, etc.

            Collections Methods
            ===================
            Collections class defines the following 2-sort methods.

            public static void sort(List l);
            To sort based on default natural sorting order.In this case, the List should compulsorily
            contain homogenous and comparable objects; otherwise we will get runtime exception,
            saying CCE. The List should not contain null, otherwise we will get the NPE.

            public static void sort(List l, Comparator c);
            To sort based on customized sorting order.
        */
        CollectionSortDemo.demo();
        CollectionCustomSortDemo.demo();
    }

}

class CollectionSortDemo {

    public static void demo() {
        List arrayList = new ArrayList<>();
        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("K");
        arrayList.add("N");
        // arrayList.add(Integer.valueOf(10)); - CCE
        // arrayList.add(null); - NPE
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }

}

class CollectionCustomSortDemo {

    public static void demo() {
        List arrayList = new ArrayList<>();
        arrayList.add("Z");
        arrayList.add("A");
        arrayList.add("K");
        arrayList.add("N");
        // arrayList.add(Integer.valueOf(10)); - CCE
        // arrayList.add(null); - NPE
        System.out.println(arrayList);
        Collections.sort(arrayList, new MyComparator1());
        System.out.println(arrayList);
    }

}

class MyComparator1 implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }

}