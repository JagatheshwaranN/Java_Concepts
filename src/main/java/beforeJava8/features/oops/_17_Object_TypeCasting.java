package beforeJava8.features.oops;

public class _17_Object_TypeCasting {

    public static void main(String[] args) {

        /*
            Object Type Casting
            ===================
            We can use parent reference to hold the child object. We can use interface reference
            to hold the implemented class object.

            Examples,
            Object o = new String("java");
            Runnable r = new Thread();

            Syntax
            ======
            A B = (C) D;
            A -> Class / Interface name
            B -> Name of reference variable
            C -> Class / Interface name
            D -> Name of reference variable
        */

        /*
            3 Mantras of Object Type Casting
            ================================
            1.	Compile time checking 1 - The type of 'D' and 'C' must have some relation either
                Parent-Child, Child-Parent, or same type. Otherwise, we will get compile time error
                saying CE: inconvertible types, Found D Required C.

            2.	Compile time checking 2 - The 'C' must be either same or derived type of 'A'.
                Otherwise, we will get the compile time error saying CE: Incompatible types,
                Found C Required A.

            3.	Run time checking - Runtime (Underlying) object type of 'D' must be either same
                or derived type of 'C'. Otherwise, we will get the runtime exception saying
                ClassCastException.
        */

        /*
            Type Casting - Not Create New Object
            ====================================
            Strictly speaking through Type Casting, we are not creating any new object.
            For the existing object, we are providing another type of reference variable,
            i.e., we are performing Type Casting not Object Casting.

            Example 1,
            In the below example, we have only one object but two reference variables pointing
            to one object.
            String s = new String("java");
            Object o = (Object) s;

            Example 2,
            In the below example, we have only one object but three reference variables pointing
            to one object.
            Integer i = new Integer (10);
            Number n = (Number) i;
            Object o = (Object) n;

            Number n = new Integer (10);
            Object o = new Integer (10);

            Note: A -> B -> C
            =====

            Example 1,
            C c = new C ();
            (B)c      => B b = new C ();
            (A)((B)c) => A a = new C ();

            Example 2,
            P -> m1()
            |
            C -> m2()

            C c = new C ();
            c.m1();
            c.m2();
            ((P)c).m1();
            ((P)c).m2(); -> Not possible and valid

            Example 3 -> Method Overriding - Method resolution is always based on runtime object,
            A -> m1() {SOP(A)}
            |
            B -> m1() {SOP(B)}
            |
            C -> m1() {SOP(C)}
            C c = new C ();
            c.m1(); -> C
            ((B)c).m1(); -> C
            ((A)((B)c)).m1(); -> C

            Example 4 -> Method Hiding - Method resolution is always based on reference type,
            A -> static m1() {SOP(A)}
            |
            B -> static m1() {SOP(B)}
            |
            C -> static m1() {SOP(C)}
            C c = new C ();
            c.m1(); -> C
            ((B)c).m1(); -> B
            ((A)((B)c)).m1(); -> A

            Example 5 -> Variable resolution is always based on reference type,
            A -> int x = 777;
            |
            B -> int x = 888;
            |
            C -> int x = 999;
            C c = new C ();
            c.m1(); -> 999
            ((B)c).m1(); -> 888
            ((A)((B)c)).m1(); -> 777
        */

        // Example1 Demo
        C c = new C();
        ((B)c).method();
        ((A)((B)c)).method();

        // Example2 Demo
        C c1 = new C();
        c1.method();
        c1.method2();
        ((B)c).method();
        // ((B)c).method2(); - cannot find symbol method method2()

        // Example3 Demo
        C c2 = new C();
        c2.method();
        ((B)c).method();
        ((A)((B)c)).method();

        // Example4 Demo
        C c3 = new C();
        c2.display();
        ((B)c).display();
        ((A)((B)c)).display();

        // Example5 Demo
        C c4 = new C();
        System.out.println(c4.x);
        System.out.println(((B)c).x);
        System.out.println(((A)((B)c)).x);
    }

    // Mantra 1
    Object o1 = new String("java");
    StringBuffer sb1 = (StringBuffer) o1;
    String s1 = new String("java");
    // StringBuffer sb = (StringBuffer) s1; - Inconvertible types; cannot cast 'java.lang.String' to 'java.lang.StringBuffer'

    // Mantra 2
    Object o2 = new String("java");
    StringBuffer sb2 = (StringBuffer) o2;
    Object o3 = new String("java");
    // StringBuffer sb3 = (String) o3; - incompatible types: java.lang.String cannot be converted to java.lang.StringBuffer

    // Mantra 3
    Object o4 = new String("java");
    Object o5 = (String) o4;
    Object o6 = new String("java");
    // String s2 = (StringBuffer) o6; - java: incompatible types: java.lang.StringBuffer cannot be converted to java.lang.String

    String s = new String("java");
    Object o = (Object) s;

    // Type Casting - Not Object Creation
    Integer i1 = Integer.valueOf(10);
    Number n1 = (Number) i1;
    Object ob1 = (Object) n1;

    Number n2 = Integer.valueOf(10);
    Object ob2 = Integer.valueOf(10);

}

class A {
    int x = 10;
    public void method(){
        System.out.println("A Class Method");
    }
    public static void display(){
        System.out.println("A Class Display");
    }
}

class B extends A {
    int x = 20;
    public void method(){
        System.out.println("B Class Method");
    }
    public static void display(){
        System.out.println("B Class Display");
    }
}

class C extends B {
    int x = 30;
    public void method(){
        System.out.println("C Class Method");
    }
    public static void display(){
        System.out.println("C Class Display");
    }
    public void method2(){
        System.out.println("C Class Method2");
    }
}


