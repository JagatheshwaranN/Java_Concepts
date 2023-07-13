package java7andbelow.features.interfaces;

public class _08_Interface_AbstractClass_ConcreteClass {

    public static void main(String[] args) {

        /*
            Interface vs Abstract Class vs Concrete Class
            =============================================
            1.	If we don’t know about implementation, just we have requirement specification only, then we
                should go for interface.
                Example: Servlet

            2.	If we are talking about the implementation but not completely (Partial implementation), then
                we should go for Abstract class.
                Example: Generic Servlet / Http Servlet

            3.	If we are talking about the implementation completely and ready to provide the service then
                we should go for Concrete class.
                Example: My Own Servlet
        */

        /*
            Interface vs Abstract Class
            ===========================
            Interface
            =========
            1. If we don’t know anything about implementation, and we have requirement specification only.
               Then we should go for Interface.
            2. Inside Interface, every method is always public and abstract whether we are declaring or not.
               Hence, Interface is considered as 100% pure abstract class.
            3. Every Interface method is always public and abstract. Hence, we can’t declare the private,
               protected, static, synchronized, final, native and Strictfp.
            4. Every variable present inside the Interface is always public static final whether we are
               declaring or not.
            5. Every Interface variable is always public static final, we can’t declare the following
               modifiers private, protected, volatile and transient.
            6. For Interface variables compulsory we should perform the initialization at the time of
               declaration only otherwise we will get the compile time error.
            7. Inside Interface, we can’t declare the Static and Instance blocks.
            8. Inside Interface, we can’t declare the constructors.

            Abstract Class
            ==============
            1. If we are talking about implementation but not completely (Partial Implementation). Then we
               should go for Abstract class.
            2. Every method present inside the Abstract class need not be abstract, and we can take concrete
               methods.
            3. There are no restrictions on abstract class method modifiers.
            4. Every variable present inside the abstract class need not be public static final.
            5. There are no restrictions on Abstract class variable modifiers.
            6. For Abstract class variables, we are not required to perform the initialization at the time
               of the declaration.
            7. Inside Abstract class, we can declare the Static and Instance blocks.
            8. Inside Abstract class, we can declare the constructors.

            QQ: We can’t create object for Abstract class but Abstract class can contain Constructor.
                What is the need?
                Abstract class constructor will be executed whenever we are creating the child class object
                to perform the initialization of the child class object.
        */
    }
}
