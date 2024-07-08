package beforeJava8.features.oops;

public class _12_Method_Hiding {
    public static void main(String[] args) {

        /*
            Method Hiding
            =============
            In method overloading, the method resolution always takes care by the Compiler
            based on the reference type. All rules of method hiding are same as overriding.
            Except the following differences.

            Method Hiding	                                Method Overriding
            1. Both Parent and Child class methods          1. Both Parent and Child class methods
            should be static.	                            should be non-static.
            2. Compiler is responsible for method           2. JVM is responsible for method resolution
            resolution based on reference type.	            based on current object.
            3. It is also known Compile time polymorphism/  3. It is also known Run time polymorphism/
            Static polymorphism / Early binding	            Dynamic polymorphism / Late binding

        */

        MHidingParent parent = new MHidingParent();
        parent.method();
        MHidingChild child = new MHidingChild();
        child.method();
        MHidingParent parent1 = new MHidingChild();
        parent1.method();

        /*
            Note: In method overriding, the method copy will be replaced whereas in method
            hiding the Parent and Child class methods are available. But its hided.
        */

    }
}

class MHidingParent {
    public static void method(){
        System.out.println("Method Hiding - Parent Method");
    }
}

class MHidingChild extends MHidingParent {
    public static void method(){
        System.out.println("Method Hiding - Child Method");
    }
}
