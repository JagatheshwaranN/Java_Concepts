package java7andbelow.features.collections.list;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class _03_ArrayList {

    public static void main(String[] args) {

        /*
            ArrayList
            =========
            1.	The underlying data structure is resizable array / growable array.
            2.	Duplicate objects are allowed.
            3.	Insertion order is preserved.
            4.	Heterogeneous objects are allowed. (Except TreeSet and TreeMap, everywhere
                heterogeneous objects allowed.)
            5.	Null value insertion is possible.
        */

        /*
            ArrayList Constructors
            ======================
            ArrayList al = new ArrayList();

            Creates an empty ArrayList object with default initial capacity 10.Once ArrayList
            reaches its max capacity, then a new ArrayList object is created with new capacity
            as below,
            New Capacity = Current Capacity * 3/2 +1

            ArrayList al = new ArrayList(int initialCapacity);
            Creates an empty ArrayList object with specified initial capacity.

            ArrayList al = new ArrayList(Collection c);
            Creates an equivalent ArrayList object for the given collection.
        */
        ArrayListDemo.demo();
    }

}

class ArrayListDemo {

    public static void demo(){
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("AB");
        arrayList.add(10);
        arrayList.add('c');
        arrayList.add('c');
        arrayList.add(null);
        arrayList.add(1, "BC");
        System.out.println(arrayList);
        arrayList.remove(3);
        System.out.println(arrayList);
    }

}