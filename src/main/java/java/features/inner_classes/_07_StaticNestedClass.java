package java.features.inner_classes;

public class _07_StaticNestedClass {

    public static void main(String[] args) {

        /*
            Static Nested Classes
            =====================
            Sometimes we can declare Inner Class with static modifier such type of inner classes
            is called as Static Nested Classes.

            In the case of normal/regular inner class, without the existence of the outer class
            object there is no chance of existence of the inner class object i.e., inner class
            object is strongly associated with outer class object.

            But in the case of static nested classes, without the existence of the outer class
            object there may be a chance of existence of the nested class object. Hence, static
            nested class object is not strongly associated with the outer class object.
        */

        Nested nested = new Nested();
        nested.method1();

        // If you want to create the nested class object from outside of Outer class then we can
        // create as follows,
        // Outer.Nested n = new Outer.Nested ();

        /*
            Points about Static Nested Class
            ================================
            1. In normal/regular inner classes we can't declare any static members. But in static
               nested classes we can declare the static members including the main() method. Hence,
               we can invoke static nested class directly from command prompt.

            2. From normal/regular inner classes we can access both the static and non-static members
               of outer class directly but from static nested classes we can access only static members
               of outer class directly, and we can't access the non-static members.
        */

        /*
            Normal/Regular Inner Class vs Static Nested Classes
            ===================================================
            Normal/Regular Inner Class
            ==========================
            1. Without existence of outer class object there is no chance of existence of inner
               class object i.e., inner class object is strongly associated with outer class
               object.
            2. In normal/regular inner classes we can't declare static members.
            3. In normal/regular inner class, we can't declare main() method and hence we can't
               invoke inner class directly from command prompt.
            4. From normal/regular inner classes we can access both static and non-static members
               of outer class directly.

            Static Nested Class
            ===================
            1. Without existence of outer class object there may be chance of existence of static
               nested class object i.e., static nested class object is not strongly associated
               with outer class object.
            2. In static nested classes, we can declare static members.
            3. In static nested classes, we can declare main() method and hence we can invoke
               nested class directly from command prompt.
            4. From static nested classes, we can access only static members of outer class.
        */
    }

    static int x = 10;
    int y = 20;

    static class Nested {
        public void method1(){
            System.out.println("Static Nested Class Method");
        }
    }

    static class Nested2 {
        public static void main(String[] args) {
            System.out.println("Static Nested2 Class Main Method");
        }
    }

    static class Nested3 {

        public void method3(){
            System.out.println("Static Nested3 Class Method");
            System.out.println(x);
            // System.out.println(y); - Non-static field 'y' cannot be referenced from a static context
        }
    }
}
