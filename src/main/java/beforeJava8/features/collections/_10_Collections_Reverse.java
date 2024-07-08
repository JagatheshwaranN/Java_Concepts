package beforeJava8.features.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class _10_Collections_Reverse {

    public static void main(String[] args) {

        /*
            Reversing elements of List
            ==========================
            Collections class defines the following reverse methods to reverse elements of the list.
            public static void reverse(List l)
        */
        CollectionReverseDemo.demo();

        /*
            reverse() vs reverseOrder()
            ===========================
            We can use reverse() method to reverse the order of elements of the list whereas we can
            use reverseOrder() method to get the reversed comparator.

            Comparator c1 = Collections.reverseOrder(Comparator c);
        */
        CollectionReverseOrderDemo.demo();
    }

}

class CollectionReverseDemo {

    public static void demo() {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(0);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(5);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);
    }

}

class CollectionReverseOrderDemo {

    public static void demo() {
        ArrayList arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(0);
        arrayList.add(20);
        arrayList.add(10);
        arrayList.add(5);
        System.out.println(arrayList);
        Comparator<Object> comparator = Collections.reverseOrder(new MyComparator3());
        Collections.reverseOrder(comparator);
        System.out.println(arrayList);
    }

}

class MyComparator3 implements Comparator<Object> {

    @Override
    public int compare(Object o1, Object o2) {
        Integer s1 = (Integer)o1;
        Integer s2 = (Integer)o2;
        return s2.compareTo(s1);
    }

}

