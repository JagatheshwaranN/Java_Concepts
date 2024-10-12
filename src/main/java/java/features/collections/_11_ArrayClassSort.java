package java.features.collections;

import java.util.Arrays;
import java.util.Comparator;

public class _11_ArrayClassSort {

    public static void main(String[] args) {

        /*
            Arrays Class
            ============
            Arrays class is a utility class to define several utility methods for array objects.

            Arrays Class Methods
            ====================
            Arrays class defines the following sort methods to sort elements of primitive and
            object type arrays.

            Sorting the elements of Array
            =============================
            public static void sort(primitive[] p)
            It is used to sort according to natural sorting order.

            public static void sort(Object[] o)
            It is used to sort according to natural sorting order.

            public static void sort(Object[] o, Comparator c)
            It is used to sort according to customized sorting order.
        */
        ArraysSortDemo.demo();

        /*
            Note:
            =====
            We can sort primitive arrays only based on Default Natural Sorting Order, whereas we can
            sort object arrays either based on Default Natural Sorting Order or Customized Sorting Order.
        */
    }

}

class ArraysSortDemo {

    public static void demo() {
        Integer[] integerArray = {10, 5, 20, 11, 6};
        for( int integer : integerArray){
            System.out.println(integer);
        }
        System.out.println("===========================");
        Arrays.sort(integerArray);
        for( int integer : integerArray){
            System.out.println(integer);
        }
        System.out.println("===========================");
        Arrays.sort(integerArray, new MyComparator4());
        for( int integer : integerArray){
            System.out.println(integer);
        }
        System.out.println("===========================");
        String[] stringArray = {"A", "Z", "B"};
        for(String str : stringArray){
            System.out.println(str);
        }
        System.out.println("===========================");
        Arrays.sort(stringArray);
        for(String str : stringArray){
            System.out.println(str);
        }
        System.out.println("===========================");
        Arrays.sort(stringArray, new MyComparator5());
        for(String str : stringArray){
            System.out.println(str);
        }
        System.out.println("===========================");
    }

}

class MyComparator4 implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        Integer i1 = (Integer)o1;
        Integer i2 = (Integer)o2;
        return i2.compareTo(i1);
    }
}

class MyComparator5 implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }

}
