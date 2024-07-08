package beforeJava8.features.declaration_access_modifiers;

public class _06_Modifiers_Public_Default_Class {

    public static void main(String[] args) {

        /*
            If class _06_Modifiers_Public_Class is not public, then compiling class _06_Modifiers_Public_Class_Demo will get
            compile time error as java7andbelow.features.declaration_access_modifiers._06_Modifiers_Public_Class is not public
            in java7andbelow.features.declaration_access_modifiers. Cannot be accessed from outside package.
        */
    }

    public void demo(){
        System.out.println("Modifier Public Class Demo");
    }

}

class Test {
    public void show() {
        System.out.println("Modifier Default Class Demo");
    }
}