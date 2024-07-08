package beforeJava8.features.concurrentcollections;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class _06_CopyOnWriteArrayList {

    public static void main(String[] args) {

        /*
            CopyOnWriteArrayList
            ====================
            1. It is a thread safe version of ArrayList.
            2. For every write operation, a separate cloned copy will be created
               and on that cloned copy the write operation will be done. So, that
               we will get the thread safety.
            3. CopyOnWriteArrayList creates a cloned copy of underlying ArrayList
               for every update operation, and at a certain point both will be
               synchronized automatically which is taken care by JYM internally.
            4. As the update operation will be performed on the cloned copy, there
               is no effect on the threads which performs read operation.
            5. It is costly to use because for every update operation, a cloned
               copy will be created. Hence, CopyOnWriteArrayList is the best choice
               if several read operations and less number of write operations are
               required to perform.
            6. Insertion order is preserved.
            7. Duplicate objects are allowed.
            8. Null insertion is possible.
            9. Heterogeneous objects are allowed.
            10. It implements Serializable, Cloneable, and RandomAccess interfaces.
            11. While one thread iterates CopyOnWriteArrayList, the other threads
                are allowed to modify, and we won't get ConcurrentModificationException.
            12. Iterator is fail-safe.
            13. Iterator of ArrayList can perform remove operation, but Iterator of
                CopyOnWriteArrayList can't perform remove operation. Otherwise, we will
                get runtime exception saying UnsupportedOperationException.
        */

        /*
            CopyOnWriteArrayList Constructors
            =================================
            CopyOnWriteArrayList list = new CopyOnWriteArrayList();
            Creates an empty CopyOnWriteArrayList object.

            CopyOnWriteArrayList list = new CopyOnWriteArrayList(Collection c);
            Creates an equivalent CopyOnWriteArrayList object for the given Collection.

            CopyOnWriteArrayList list = new CopyOnWriteArrayList(Object[] a);
            Creates an equivalent CopyOnWriteArrayList object for the given Object Array.
        */

        /*
            CopyOnWriteArrayList Methods
            ============================
            boolean addIfAbsent(Object o)
            The element will be added if and only if a list doesn't contain this element.

            int addAllAbsent(Collection c)
            The elements of collection will be added to the list if elements are absent
            and return number of elements added.
        */
        CopyOnWriteArrayListDemo1.demo();
    }

}

class CopyOnWriteArrayListDemo1 {

    public static void demo() {
        CopyOnWriteArrayList<Object> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
        copyOnWriteArrayList.addIfAbsent("A");
        copyOnWriteArrayList.addIfAbsent("A");
        copyOnWriteArrayList.addIfAbsent("B");
        copyOnWriteArrayList.addIfAbsent("C");
        System.out.println(copyOnWriteArrayList);
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add("D");
        copyOnWriteArrayList.addAllAbsent(arrayList);
        System.out.println(copyOnWriteArrayList);
    }

}