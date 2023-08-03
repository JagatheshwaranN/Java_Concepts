package java7andbelow.features.exception_handling;

public class _02_Default_Exception_Handling {

    public static void main(String[] args) {

        /*
            Default Exception Handling
            ==========================
            1.	Inside a method, if any exception occurs, then the method in which its
                raised is responsible to create the exception object by including the
                following information.
                1.	Name of the exception
                2.	Description of the exception
                3.	Location at which exception occurs [Stack Trace]

            2.	After creating the exception object, the method handover the object to the JVM.

            3.	JVM will check whether the method contains any exception handling code or not.
                If the method does not contain any exception handling code, then the JVM terminates
                the method abnormally and removes the corresponding method entry from the stack.

            4.	JVM identifies the caller method and checks whether the caller method contains any
                handling code or not. If the caller method does not contain the handler code, then
                JVM terminates the caller method also abnormally and removes the corresponding entry
                from the stack and this process will be continued until Main method. If the Main
                method also does not contain the handler code, then JVM terminates the main method
                also abnormally and removes the corresponding main method entry from the stack.

            5.	JVM handover the responsibility of the exception handling to the default exception
                handler, which is part of the JVM. Default Exception Handler prints the exception
                information in the following format and terminates the program abnormally.

                Example,
                Exception in thread "XXXX" Name of exception: Description
                Stack Trace
        */
        DEHDemo demo = new DEHDemo();
        demo.doStuff();

        /*
            Note:
            =====
            In a program, if at least one method terminates abnormally, then the program
            termination is considered as abnormal termination. If all methods terminated
            normally, then only the program termination is considered as normal termination.
        */
    }
}

class DEHDemo {
    public void doStuff () {
        doMoreStuff ();
    }
    public void doMoreStuff () {
        // System.out.println(10/0);
        // Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}