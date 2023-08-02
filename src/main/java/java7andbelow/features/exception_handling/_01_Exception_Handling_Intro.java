package java7andbelow.features.exception_handling;

public class _01_Exception_Handling_Intro {

    public static void main(String[] args) {

        /*
            Exception
            =========
            An unexpected, unwanted event that disturbs the normal flow of the program
            is called as Exception.

            Example,
            TypePunctured Exception
            Sleeping Exception
            FileNotFound Exception

            Note:
            =====
            It is highly recommended to handle the exception and the main objective of the
            exception handling is graceful termination of the program.
        */

        /*
            Exception Handling
            ==================
            Exception handling does not mean repairing an exception. We have to provide the
            alternate way to continue the rest of the program normally. This is the concept
            of Exception Handling.

            For Example, our programming requirement is to read data from remote file located
            at London. In runtime, if London file is not available then our program should not
            be terminated abnormally. We have to provide some local file to continue the rest
            of the program normally. This way of defining the alternative is called as
            Exception Handling.

            try {
            Read data from London file
            }
            Catch(FileNotFoundException ex) {
            Use local file
            }
        */

        /*
            Runtime Stack Mechanism
            =======================
            For every thread, JVM will create a runtime stack. Each and every method call
            performed by that thread will be stored in the corresponding stack. Each entry
            in the stack is called as Stack Frame or Activation Record. After completing
            every method call, the corresponding entry from the stack will be removed. After
            completing all the method calls, the stack will become empty and that empty stack
            will be destroyed by the JVM before terminating the thread.

            class Test {
                public static void main (String[] args) {
                doStuff();
                }
                public static void doStuff () {
                doMoreStuff ();
                }
                public static void doMoreStuff () {
                SOP (Hello);
                }
            }

            =================
            |               |
            =================
            |doMoreStuff    |
            =================
            |doStuff        |
            =================
            |Main           |
            =================
            Runtime stack for Main thread
        */
    }
}
