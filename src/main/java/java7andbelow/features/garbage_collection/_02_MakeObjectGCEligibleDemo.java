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


