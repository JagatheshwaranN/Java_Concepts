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
