package java.features.interfaces;

public class _07_Interface_Loop_Holes {

    public static void main(String[] args) {

        /*
            Loopholes in Interface
            ======================

            Purpose of New operator & Constructor
            =====================================
            1.	The main objective of the new operator is to create an object.

            2.	The main purpose of the constructor is to initialize the object.

            3.	First object will be created with new operator and then initialization
                will be performed by constructor.

            Interface does not contain Constructor
            ======================================
            1. The main purpose of the constructor is to perform the initialization of the object i.e., to perform
               the initialization for Instance variables.

            2. Abstract class can contain the instance variables which are required for child class object. To
               perform the initialization for these instance variables, the constructor is required for Abstract
               classes.

            3. Every variable present inside the Interface is always Public Static Final whether we are declare
               or not. Hence, there is no chance for having the Instance variables inside the Interface. Because
               of this, the constructor is not required for Interfaces.
        */
    }
}
