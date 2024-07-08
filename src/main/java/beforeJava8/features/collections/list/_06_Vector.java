package beforeJava8.features.collections.list;

import java.util.Vector;

public class _06_Vector {

    public static void main(String[] args) {

        /*
            Vector
            ======
            1.	The underlying data structure is resizable array / growable array.
            2.	Duplicate objects are allowed.
            3.	Insertion order is preserved.
            4.	Heterogeneous objects are allowed.
            5.	Null value insertion is possible.
            6.	It implements Serializable and Cloneable and RandomAccess interfaces.
            7.	Every method present in the Vector is synchronized, and hence a Vector object
                is Thread safe.
        */

        /*
            Vector Constructors
            ===================
            Vector v = new Vector();
            Creates an empty vector object with default initial capacity 10. Once, vector
            reaches its max capacity, then a new vector object will be created with new
            capacity as below,
            New Capacity = Current Capacity * 2

            Vector v = new Vector(int initialCapactity);
            Creates an empty vector object with the specified capacity.

            Vector v = new Vector(int initialCapactity, int incrementalCapacity);
            Creates an empty vector object with the specified initial capacity and incremental
            capacity.

            Vector v = new Vector(Collection c);
            Creates an equivalent vector object for the given collection.
        */

        /*
            Vector Specific Methods
            =======================
            addElement(Object o)
            removeElement(Object o)
            removeElementAt(int index)
            removeAllElements()
            Object elementAt(int index)
            Object firstElement()
            Object lastElement()
            int size()
            int capacity()
            Enumeration elements()
        */
        VectorDemo.demo();
    }

}

class VectorDemo {

    public static void demo() {

        Vector<Object> vector = new Vector<>();
        System.out.println("Vector Capacity Check 1 : " + vector.capacity());
        for (int i = 1; i <= 10; i++) {
            vector.addElement(i);
        }
        vector.addElement(11);
        System.out.println("Vector Capacity Check 2 : " + vector.capacity());
        System.out.println("Vector Size : " + vector.size());
        vector.insertElementAt(12, 11);
        vector.removeElement(12);
        vector.removeElementAt(10);
        System.out.println(vector.elementAt(1));
        System.out.println(vector.firstElement());
        System.out.println(vector.lastElement());
        vector.removeElement(10);
        vector.removeElementAt(8);
        vector.elements().asIterator().forEachRemaining(System.out::println);
        vector.removeAllElements();
        System.out.println(vector);
    }

}
