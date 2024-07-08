package beforeJava8.features.exception_handling;

public class _08_Final_Finally_Finalize {

    public static void main(String[] args) {

        /*
            Final
            =====
            1.	Final is a modifier applicable for classes, methods and variables.

            2.	If a class is declared as final, then we can’t extend that class i.e.,
                we can’t create child class for that class i.e., inheritance is not
                possible for Final classes.

            3.	If a method is final then we can’t override that method in the child
                class.

            4.	If a variable is declared as final, then we can’t perform the reassignment
                for the variable.

            Finally
            =======
            Finally, is a block always associated with try catch to maintain clean up code.
            The specialty of the finally code is, it will always be executed irrespective of
            whether the exception is raised / not raised and whether handled / not handled.
            try {
                Risky code
            }
            catch (Exception ex) {
                Handling code
            }
            finally {
                Clean up code
            }

            Finalize
            ========
            Finalize is a method always invoked by the Garbage Collector just before
            destroying an object to perform the clean-up activities. Once, finalize
            method completes immediately the GC destroys that object.

            Note:
            =====
            Finally block is responsible to perform the clean-up activities related to
            try block. i.e., whatever resources is opened as part of try block will be
            closed inside the finally block.

            Finalize method is responsible to perform the clean-up activities related to
            object. i.e., whatever resources associated with the object will be deallocated
            before destroying an object by using finalize method.
        */
    }
}
