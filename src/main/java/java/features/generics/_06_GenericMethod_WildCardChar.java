package java.features.generics;

import java.util.ArrayList;

public class _06_GenericMethod_WildCardChar {

    public static void main(String[] args) {

        /*
            Generics Methods and Wild Card Character(?)
            ===========================================
            1.	m1(ArrayList<String> al)
            ============================
            We can call this method by passing ArrayList of a String type. But within
            the method, we can add only string type objects to the list. By mistake,
            if we are trying to add any other type, then we will get the compile time
            error.

            m1(ArrayList<String> al) {
                al.add("A");
                al.add(null);
                al.add(10); // CompileTimeError
            }

            2.	m1(ArrayList<?> al)
            =======================
            We can call this method by passing ArrayList of any type. But within the method,
            we can't add anything to the list except null because we don't know the type
            exactly. Null is allowed because it is a valid value for any type. This type of
            method is the best suitable for read only operations.

            m1(ArrayList<?> al) {
                al.add("A"); // CompileTimeError
                al.add(10); // CompileTimeError
                al.add(null);
            }

            3.	m1(ArrayList<? extends X> al)
            =================================
            Here X can be either class or interface. If X is a class, then we can call this
            method by passing the ArrayList of X type or its child classes. If X is an interface,
            then we can call this method by passing ArrayList of either X type or its
            implementation classes. But within the method, we can't add anything to the list except
            null because we don't know the type of X exactly. This type of method is the best suitable
            for read only operations.

            4.	m1(ArrayList<? super X> al)
            ===============================
            Here X can be either class or interface. If X is a class, then we can call this
            method by passing the ArrayList of X type or its superclasses. If X is an interface,
            then we can call this method by passing ArrayList of either an X type or superclass of
            implementation class of X. But within the method we can add an X type of objects and
            null to the list.

            Examples
            ========
            ArrayList<String> al = new ArrayList<String>();
            ArrayList<?> al = new ArrayList<Integer>();
            ArrayList<?> al = new ArrayList<String>();
            ArrayList<? extends Number> al = new ArrayList<Integer>();
            ArrayList<? extends Number> al = new ArrayList<String>(); // CTE : Incompatible Types
            ArrayList<? super String> al = new ArrayList<Object>();
            ArrayList<?> al = new ArrayList<?>(); // CTE: Unexpected Type Found:? Required: class or Interface
            ArrayList<?> al = new ArrayList<? extends Number>(); // CE: Unexpected Type Found:? extends Number Required: class or interface
        */
        GenericWildCardCharDemo.demo();
    }

}

class GenericWildCardCharDemo {

    public static void demo() {
        ArrayList<String> al1 = new ArrayList<String>();
        ArrayList<?> al2 = new ArrayList<Integer>();
        ArrayList<?> al3 = new ArrayList<String>();
        ArrayList<? extends Number> al4 = new ArrayList<Integer>();
        // ArrayList<? extends Number> al5 = new ArrayList<String>(); // CTE : Incompatible Types
        ArrayList<? super String> al6 = new ArrayList<Object>();
        // ArrayList<?> al7 = new ArrayList<?>(); // CTE: Unexpected Type Found:? Required: class or Interface
        // ArrayList<?> al8 = new ArrayList<? extends Number>(); // CTE: Unexpected Type Found:? extends Number Required: class or interface
    }

}