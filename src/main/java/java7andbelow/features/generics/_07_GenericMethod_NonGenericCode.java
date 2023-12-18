package java7andbelow.features.generics;

import java.util.ArrayList;

public class _07_GenericMethod_NonGenericCode {

    public static void main(String[] args) {

        /*
            Generic Method
            ==============
            We can declare Type parameter either at class level or at method level.
            Declaring Type parameter at class level.

            class Test<T> {
                We can use T within this class based on our requirement
            }

            Declaring Type parameter at method level. We have to declare type parameter
            before a return type.

            public <T> void m1(T obj) {
                We can use T anywhere within this method based on our requirement
            }

            We can define bounded types even at method level as well.
            public <T> void m1()
            public <T extends Number> void m1()
            public <T extends Runnable> void m1()
            public <T extends Number & Runnable> void m1()
            public <T extends Comparable & Runnable> void m1()
            public <T extends Number & Comparable & Runnable> void m1()
            public <T extends Runnable & Number> void m1() // Invalid, first we should take class then Interface
            public <T extends Number & Thread> void m1() // Invalid, we can't extend more than one class
        */

        /*
            Communication with Non-Generic Code
            ===================================
            If we send generic object to non-generic area, then its starts behaving like
            a non-generic object. Similarly, if we send a non-generic object to generic area,
            then it will start behaving like a generic object. i.e., the location in which
            an object presents, based on that, the behaviour of the object will be defined.
        */

        Test.demo();

        /*
            Conclusions
            ===========
            The main purpose of Generics is to provide type safety and resolve type
            casting problems. Type safety and Type casting both are applicable at
            compile time. Hence, Generics concept is also applicable only at compile
            time but not at runtime. At the time of compilation, as the last step, the
            generic syntax will be removed and for the JVM Generics syntax won't be
            available.Hence, the following declarations are equal.

            ArrayList al = new ArrayList<String>();
            ArrayList al = new ArrayList<Integer>();
            ArrayList al = new ArrayList<Double>();
            ArrayList al = new ArrayList ();

            Example 1,
            ArrayList al = new ArrayList<String>();
            al.add(10);
            al.add(10.5);
            al.add(true);
            SOP (al); [ 10, 10.5, true]

            The following declarations are equal.
            ArrayList<String> al = new ArrayList<String>();
            ArrayList<String> al = new ArrayList();
            For these ArrayList objects, we can add only String type objects.

            Example 2,
            class Test {
                public void m1 (ArrayList<String> al) { => m1(ArrayList al)
                }
                public void m1 (ArrayList<Integer> al) { => m1(ArrayList al)
                }
            }

            CTE: Name clash: Both methods have the same erasure

            Steps followed at Compile time
            ==============================
            1.	Compile code normally by considering generic syntax
            2.	Remove Generic syntax
            3.	Compile once again the resultant code
        */
    }

}

class Test {

    public static void demo() {
        ArrayList<String> al = new ArrayList<>();
        al.add("Alex");
        al.add("Blake");
        // al.add(10); - CompileTimeError
        m1(al);
        System.out.println(al);
        // al.add(10.5); - CompileTimeError

    }

    public static void m1(ArrayList al){
        al.add(10);
        al.add(true);
    }

//    public void m1 (ArrayList<String> al) {
//    }

//    public void m1 (ArrayList<Integer> al) {
//    }

    public <T> void m2(){}

    public <T extends Number> void m3(){}

    public <T extends Runnable> void m4(){}

    public <T extends Number & Runnable> void m5(){}

    public <T extends Comparable & Runnable> void m6(){}

    public <T extends Number & Comparable & Runnable> void m7(){}

    // public <T extends Runnable & Number> void m8(){} - Invalid, first we should take class then Interface

    // public <T extends Number & Thread> void m9(){} - Invalid, we can't extend more than one class
}