package java7andbelow.features.collections.list;

import java.util.LinkedList;

public class _05_LinkedList {

    public static void main(String[] args) {

        /*
            LinkedList
            ==========
            1. The underlying DSA is Doubly LinkedList.
            2. Insertion order is preserved and duplicate objects are allowed.
            3. Heterogeneous objects are allowed.
            4. Null insertion is possible.
            5. LinkedList implements Serializable and Cloneable Interfaces.

            LinkedList is the best choice if our frequent operation is insertion/deletion
            in the middle.

            LinkedList is the worst choice if our frequent operation is retrieval operation.
        */

        /*
            LinkedList Constructors
            =======================
            LinkedList list = new LinkedList();
            Creates an empty LinkedList object.

            LinkedList list = new LinkedList(Collection c);
            Creates an equivalent LinkedList object for the given collection.
        */

        /*
            LinkedList Specific Methods
            ===========================
            Usually, we can use LinkedList to develop stacks and queues. To provide support
            for this requirement, LinkedList class defines the following specific methods.

            Void addFirst(Object o)
            void addLast(Object o)
            Object getFirst()
            Object getLast()
            Object removeFirst()
            Object removeLast()
        */
        LinkedListDemo.demo();
    }
}

class LinkedListDemo {

    public static void demo(){
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.add("Java");
        linkedList.add(30);
        linkedList.add(null);
        linkedList.add("Java");
        linkedList.add(0, "Software");
        linkedList.add(0, "Product");
        linkedList.removeLast();
        linkedList.addFirst("World");
        linkedList.addLast("Program");
        linkedList.removeFirst();
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
    }

}
