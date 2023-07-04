package java7andbelow.features.declaration_access_modifiers;

public class _07_Final_Modifier {

    public static void main(String[] args) {

        /*
            Final Modifier
            ==============
            Final is a modifier applicable for classes, methods and variables.
        */

        /*
            Final Method
            ============
            Whatever methods Parents has by default available to Child through Inheritance. If the
            Child is not satisfied with Parent method implementation, then Child is allowed to redefine
            that method based on Child’s requirement. This process is called as Overriding. If the Parent
            method is declared as Final. We can’t override that method in Child because its
            implementation is Final.

        */

        /*
            Final Classes
            =============
            If a class is declared as Final, we can’t extend the functionality of that class
            i.e., we can’t create the child class for that class i.e., Inheritance is not possible
            for Final classes.

            Note: Every method present inside the Final class is always Final by default whereas every
            variable present inside the Final class need not be Final.
        */

        FinalClassDemo.display();

        /*
            The main advantage of the Final keyword is we can achieve Security, and we can provide
            Unique implementation. But, the main disadvantage of Final keyword is we are missing
            the key benefits of the OOPS (Inheritance and Polymorphism). Hence, if there is no specific
            requirement, then it’s not recommended to use Final Keyword.
        */
    }

    final public void finalMethodDemo(){
        System.out.println("This method is final");
    }
}

class Child extends _07_Final_Modifier {

    // public void finalMethodDemo(){ - overridden method is final
    //    System.out.println("This method is final");
    // }
}

final class FinalClassDemo {

    static int x = 10;
    public static void display(){
        x = 20;
        System.out.println("Final Class Demo method " + x);
    }
}

// class Derived extends FinalClassDemo {
// cannot inherit from final java7andbelow.features.declaration_access_modifiers.FinalClassDemo
// }

