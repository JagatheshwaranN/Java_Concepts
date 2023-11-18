package java7andbelow.features.collections;

import java.util.Arrays;

public class _12_ArrayClassSearch {

    public static void main(String[] args) {

        /*
            Searching the elements of Array
            ===============================
            Arrays class defines the following binarySearch() methods.

            public static int binarySearch(primitive[] p, primitive target);
            public static int binarySearch(Object[] a, Object target);
            public static int binarySearch(Object[] a, Object target, Comparator c);

            Note:
            =====
            All rules of arrays class binarySearch() methods are exactly the same as
            collections class binary search methods.
       */
        ArraysSearchDemo.demo();
    }

}

class ArraysSearchDemo {

    public static void demo() {
        int[] intArray = {10, 5, 20, 11, 6};
        Arrays.sort(intArray);
        System.out.println(Arrays.binarySearch(intArray, 6));
        System.out.println(Arrays.binarySearch(intArray, 14));
        System.out.println("************************************");
        String[] strArray = {"A", "Z", "B"};
        System.out.println(Arrays.binarySearch(strArray, "Z"));
        System.out.println(Arrays.binarySearch(strArray, "S"));
        System.out.println("************************************");
        Arrays.sort(strArray, new MyComparator5());
        System.out.println(Arrays.binarySearch(strArray, "Z", new MyComparator5()));
        System.out.println(Arrays.binarySearch(strArray, "S", new MyComparator5()));
        System.out.println("************************************");
    }

}