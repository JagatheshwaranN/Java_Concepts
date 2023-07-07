package java7andbelow.features.declaration_access_modifiers;

public class _11_Final_Variable_Instance {

    public static void main(String[] args) {

        /*
            Final Instance Variables
            ========================
            1.	If the value of the variable is varied from object to object such type of variables is
                called as Instance variables.

            2.	For every object, a separate copy of instance variable will be created.

            3.	For Instance variables we are not required to perform the initialization explicitly JVM
                will always provide default values.

            4.	If the Instance variable is declared as Final, then compulsory we have to perform the
                initialization explicitly whether we are using or not and JVM won’t provide default values.

            Rules
            =====
            1.	For Final instance variable, compulsory we should perform the initialization before the
                constructor completion otherwise we will get the compile time error.

            2.	The following are the various places for the initialization of the final instance variables.
                1.	At the time of declaration
                2.	Inside Instance block
                3.	Inside Constructor
        */
    }
    // final int x; - variable x not initialized in the default constructor

    final int x1 = 10;
    final int x2;

    final int x3;
    {
        x3 = 10;
    }

    _11_Final_Variable_Instance () {
        x2 = 10;
    }
}
