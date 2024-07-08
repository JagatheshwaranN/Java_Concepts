package beforeJava8.features.declaration_access_modifiers;

public class _08_Abstract_Modifier {

    public static void main(String[] args) {

        /*
            Abstract Modifier
            =================
            Abstract is a modifier which is applicable for classes and methods but not for variables.
        */

        /*
            Abstract Method
            ===============
            Even though we don’t know about the implementation, still we can declare a method with
            abstract modifier. i.e., for abstract method only, declaration is available but not
            implementation. Hence, abstract method declaration should ends with semicolon (;).

            Child class is responsible to provide the implementation for Parent class abstract methods.

            By declaring the abstract method in the Parent class, we can provide the guidelines to the
            child class such that which methods compulsory the child has to implement.
        */

        /*
            Abstract method never talks about the implementation. If any modifier talks about the
            implementation, then it forms the illegal combination with abstract modifier. The following
            are the various illegal combination of modifiers for abstract,
            1.	abstract final
            2.	abstract static
            3.	abstract native
            4.	abstract synchronized
            5.	abstract strictfp
            6.	abstract private
        */

        /*
            Abstract Class
            ==============
            For any Java class if we are not allowed to create an object (Because of partial implementation)
            such type of class we have to declare with abstract modifier. i.e., for abstract classes
            instantiation is not possible.
        */
        // Vehicle vehicle = new Vehicle(); - Vehicle is abstract; cannot be instantiated

        /*
            Abstract Class vs Abstract Method
            =================================
            1.	If a class contains at least one abstract method then compulsory we should declare the class
                as abstract otherwise we will get the compile time error.

            2.	Reason: If a class contains at least one abstract method then implementation is not complete
                and hence it's not recommended to create an object. To restrict object instantiation, compulsory
                we should declare the class as abstract.

            3.	Even though the class does not contain any abstract methods, still we can declare the class as
                abstract if we don’t want instantiation for the class i.e., abstract class can contain 0 number
                of abstract methods.

            Example,
            HTTP Servlet class is abstract, but it does not contain abstract methods.
            Every Adapter class is recommended to declare as abstract, but it does not contain any abstract method.
        */

        /*
            If we are extending the abstract class then for each and every abstract method of Parent class,
            we should provide the implementation in Child class otherwise we have to declare the Child class
            as abstract.
        */

        /*
            Final vs Abstract
            =================
            1.	For Abstract methods, compulsory we should override in child classes to provide implementation
                whereas we can’t override the final methods. Hence, Final Abstract combination is illegal
                combination for methods.

            2.	For Final classes we can’t create the child class whereas for Abstract classes we should create
                child class to provide implementation. Hence, Final Abstract combination is illegal for Classes.

            3.	Abstract class can contain the Final method whereas Final class can’t contain Abstract method.

        */

        /*
            Note: It is highly recommended to use abstract modifier because it promotes the several OOPS
            features like inheritance and polymorphism.
        */
    }
}
    abstract class Vehicle {
        abstract public String getTypeofVehicle();
    }

    class Bus extends Vehicle {

        @Override
        public String getTypeofVehicle() {
            return "4 wheeler";
        }

        // abstract final void display(){ - illegal combination of modifiers: abstract and final
        //    System.out.println("Error combination");
        // }
    }

class Demo {
    // public void method1(); -  missing method body, or declare abstract
}

class ShowCase {
    // public abstract void method2() {} - ShowCase is not abstract and does not override abstract
    // method method2()
}

class Display{
    // public abstract void method3(); - java7andbelow.features.declaration_access_modifiers.Display is
    // not abstract and does not override abstract method method3() in
    // java7andbelow.features.declaration_access_modifiers.Display
}

abstract class Parent {
    public abstract void m1();
    public abstract void m2();
}

// class Children extends Parent {
     // public abstract void m1(){ - java7andbelow.features.declaration_access_modifiers.Children is not
     // abstract and does not override abstract method m1() in
    //  java7andbelow.features.declaration_access_modifiers.Children
//    }
// }

abstract class Demo1 {
    public final void m1() {}
}

final class Demo2 {
    // public abstract void m1(); - .Demo2 is not abstract and does not override abstract method m1()
}

