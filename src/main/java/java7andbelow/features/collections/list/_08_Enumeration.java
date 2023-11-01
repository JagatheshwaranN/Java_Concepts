package java7andbelow.features.collections.list;

import java.util.Enumeration;
import java.util.Vector;

public class _08_Enumeration {

    public static void main(String[] args) {

        /*
            The 3 cursors of Java
            =====================
            If we want to get the objects one by one from the collection. Then we should go
            for Cursors. There are 3 types of cursors available in Java as below,

            1.	Enumeration
            2.	Iterator
            3.	ListIterator

            Enumeration
            ===========
            We can use enumeration to get the object one by one from a legacy collection object.
            We can create an enumeration object by using the elements method of vector class.

            Public Enumeration elements ();

            Enumeration Methods
            ===================
            public boolean hasMoreElements ();
            public Object nextElement ();
        */
        EnumerationDemo.demo();
    }

}

class EnumerationDemo {

    public static void demo() {
        Vector<Object> vector = new Vector<>();
        for(int i = 1; i <= 10; i++){
            vector.addElement(i);
        }
        System.out.println(vector);
        Enumeration<Object> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            Integer integer = (Integer) enumeration.nextElement();
            if(integer % 2 == 0){
                System.out.println(integer);
            }
        }
    }

}
