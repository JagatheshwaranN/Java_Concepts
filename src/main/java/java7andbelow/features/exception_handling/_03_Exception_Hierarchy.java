package java7andbelow.features.exception_handling;

public class _03_Exception_Hierarchy {

    public static void main(String[] args) {

        /*
            Exception Hierarchy
            ===================
            Throwable class acts as the root for the Java exception hierarchy. Throwable
            class defines two child class such as Exception and Error.

            Exception
            =========
            Usually, exceptions are caused by our program and these are recoverable. For example,
            if our programming requirement is to read data from remote file located at London. At
            runtime, if remote file is not available then we will get the runtime exception saying
            FileNotFoundException. If FileNotFoundException occurs, and we can provide the local file
            and continue the rest of the program normally.

            try {
            Read data from London file
            }
            Catch(FileNotFoundException ex) {
            Use local file
            }

            Error
            =====
            Usually, errors are not caused by our program and these are due to lack of system
            resources. Errors are non-recoverable. For example, if OutofMemoryError occurs,
            being a programmer, we can’t do anything and the program will be terminated abnormally.
            Then, the System Admin / Server Admin is responsible to increase the heap memory.
        */
    }
}
