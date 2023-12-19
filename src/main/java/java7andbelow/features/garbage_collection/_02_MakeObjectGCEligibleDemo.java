package java7andbelow.features.garbage_collection;

public class _02_MakeObjectGCEligibleDemo {

    public static void main(String[] args) {

        /*
            Objects created inside a method
            ===============================
            The objects which are created inside a method are by default eligible
            for GC once the method completes.
        */
        GCDemo1.demo();
        GCDemo2.demo();
        GCDemo3.demo();
        GCDemo4.demo();

        /*
            Island of Isolation
            ===================
            Even though there is a reference between objects internally but without
            an external reference, it's of no use and becomes eligible for GC.
        */

        /*
            Note
            ====
            1.	If an object doesn't contain any reference variable, then it is eligible
                for GC always.

            2.	Even though an object has references, sometimes it is eligible for GC
                (If all references are internal references).
                For Example, Island of Isolation.
        */
    }

}

// Two objects eligible for GC.
class GCDemo1 {

    public static void demo() {
        method1();
    }

    public static void method1() {
        GCDemo gcDemo1 = new GCDemo();
        GCDemo gcDemo2 = new GCDemo();
    }

}

// One object eligible for GC.
class GCDemo2 {

    public static void demo() {
        GCDemo gcDemo = method1();
    }

    public static GCDemo method1() {
        GCDemo gcDemo1 = new GCDemo();
        GCDemo gcDemo2 = new GCDemo();
        return gcDemo1;
    }

}

// Two objects eligible for GC.
class GCDemo3 {

    public static void demo() {
        method1();
    }

    public static GCDemo method1() {
        GCDemo gcDemo1 = new GCDemo();
        GCDemo gcDemo2 = new GCDemo();
        return gcDemo1;
    }

}

// One object eligible for GC.
class GCDemo4 {

    static GCDemo gcDemo1;
    public static void demo() {
        method1();
    }

    public static GCDemo method1() {
        gcDemo1 = new GCDemo();
        GCDemo gcDemo2 = new GCDemo();
        return gcDemo2;
    }

}

class Test {

    Test i;

    public static void demo(){
        Test t1 = new Test();
        Test t2 = new Test();
        Test t3 = new Test();
        t1.i = t2;
        t2.i = t3;
        t3.i = t1;
        t1 = null;
        t2 = null;
        t3 = null;
        // Until t3 becomes null, no objects eligible for GC.When t3 becomes null,
        // then all objects are eligible for GC.
    }

}


