package java.features.garbage_collection;

public class _01_GarbageCollection_Intro {

    public static void main(String[] args) {

        /*
            Need of GarbageCollector
            ========================
            In old languages like C++, programmer is responsible to create new object
            and to destroy useless objects. Usually, programmers take care very much
            while creating objects and neglecting destruction of not used objects.
            Because of the programmer's negligence, at a certain point for creation of a
            new object, sufficient memory may not be available. (Because total memory
            filled with not used objects only) and total application will be down with
            a memory problem. Hence, out of memory is a very common problem in old
            language like C++.

            GarbageCollector Intro
            ======================
            But in Java, programmer is responsible only for the creation of objects and
            programmer is not responsible to destroy the not used objects. SUN people
            provided one assistant to destroy not used objects. This assistant is always
            running in the background (Daemon thread) and destroys not used objects. Just
            because of this assistant, the chance of failing of java program with a memory
            problem is very low. This assistant is called as Garbage Collector. Hence, the
            main objective of Garbage Collector is to destroy the not used objects.

            Ways to make an object eligible for GarbageCollection(GC)
            =========================================================
            Even though programmer is not responsible to destroy useless objects, it is
            highly recommended to make an object eligible for GC if it is no longer required.
            An object is said to be eligible for GC if and only if it does not contain any
            reference variable. The following are the various ways to make an object eligible
            for GC.

            Nullifying the reference variable
            =================================
            If an object is no longer required, then assign null to all its reference
            variables, then that object is automatically eligible for GC. This approach
            is called as nullifying the reference variable.

            Student s1 = new Student();
            Student s2 = new Student();
            s1 = null;
            s2 = null;

            Reassigning the reference variable
            ==================================
            If an object no longer required, then reassign its reference variable to
            some other object, then the old object by default eligible for GC.

            Student s1 = new Student();
            Student s2 = new Student();
            s1 = new Student();
            s2 = s1;

            Objects created inside a method
            ===============================
            The objects which are created inside a method are by default eligible for
            GC once the method completes.
        */
        GCDemo gcDemo1 = new GCDemo();
        GCDemo gcDemo2 = new GCDemo();
        gcDemo1.demo();
        gcDemo2.demo();
        gcDemo1 = null;
        gcDemo2 = null;

        GCDemo gcDemo3;
        GCDemo gcDemo4;
        gcDemo3 = new GCDemo();
        gcDemo4 = gcDemo3;
        gcDemo4.demo();
    }

}

class GCDemo {

    public void demo() {
        System.out.println("GC Demo");
    }

}
