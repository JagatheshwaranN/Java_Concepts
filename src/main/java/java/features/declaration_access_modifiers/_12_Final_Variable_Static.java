package java.features.declaration_access_modifiers;

public class _12_Final_Variable_Static {

    public static void main(String[] args) {

        /*
            Final Static Variable
            =====================
            1.	If the value of the variable is not varied from object to object such type of variables
                is not recommended to declare as Instance variables. We have to declare those variables
                at class level by using the Static modifier.

            2.	In case of the instance variables, a separate copy of values will be created. But in case
                of the static variables, a single copy of value will be created at the class level and
                shared by every object of the class.

            3.	For static variables, it’s not required to perform the initialization explicitly. JVM will
                always provide the default values.

            4.	If the static variable is declared as final, then compulsory, we should perform the
                initialization explicitly otherwise we will get the compile time error and JVM won’t
                provide any default values.

            Rules
            =====
            1.	For final static variables, compulsory we should perform the initialization before CLASS
                loading completion.

            2.	The following are the various place of initialization of the final static variables.
                1.	At the time of declaration
                2.	Inside Static Block

            3. If we are trying to do the initialization anywhere else then we will get the compile time error.

        */

    }

    static int x1;
    // final static int x2; - variable x2 not initialized in the default constructor

    final static int x3 = 10;

    final static int x4;

    static {
        x4 = 20;
    }

    // final static int x5;

    public void method1(){
        // x5 = 30; - cannot assign a value to final variable x5
    }
}
