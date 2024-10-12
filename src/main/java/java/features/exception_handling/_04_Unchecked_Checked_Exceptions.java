package java.features.exception_handling;

public class _04_Unchecked_Checked_Exceptions {
    public static void main(String[] args) {

        /*
            Checked Exception
            =================
            The exceptions which are checked by Compiler for smooth execution of the program
            are called as checked exceptions.

            Example,
            HallTicketMissingException
            PenNotWorkingException
            FileNotFoundException

            Note: In our program, if there is a chance of raising checked exception then
            compulsory, we should handle that checked exception either by "try catch" or
            "throws" keyword. Otherwise, we will get the compile time error.

            Unchecked Exception
            ===================
            The exceptions which are not checked by the compiler whether programmer handling or
            not, such type of exceptions are called as Unchecked Exception.

            Example,
            ArithmeticException
        */

        /*  Points to Remember
            ==================
            1.	Whether its checked or unchecked, every exception occurs at runtime only.
                There is no chance of exception occurring at compile time.
            2.	Runtime exception and its child classes, Error and its child classes are
                Unchecked Exception. Except these remaining are Checked Exception.
        */

        /*
            Fully Checked Exception
            =======================
            A checked exception is said to be fully checked if and only if all its
            child classes are checked.
            Example,
            IOException
            InterruptedException

            Partially Checked Exception
            ===========================
            A checked exception is said to be partially checked if and only if some
            of its child classes are unchecked.
            Example,
            Exception
            Throwable

            Note: The only possible partially checked exception in Java are Throwable
                  and Exception.

            Describe the behavior of the following exceptions,
            1.	RuntimeException -> Unchecked
            2.	InterruptedException ->Fully Checked
            3.	Error -> Unchecked
            4.	Throwable -> Partially Checked
            5.	ArithmeticException -> Unchecked
            6.	NullPointerException -> Unchecked
            7.	Exception -> Partially Checked
            8.	FileNotFoundException ->Fully Checked
            9.	IOException ->Fully Checked
        */

        ExceptionDemo demo = new ExceptionDemo();
        demo.checkedException();
        demo.uncheckedException();
    }
}

class ExceptionDemo {
    public void checkedException() {
        // unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
        // PrintWriter printWriter = new PrintWriter("file.txt");
        // printWriter.println("Hello");
    }
    public void uncheckedException(){
        // System.out.println(10/0); - Exception in thread "main" java.lang.ArithmeticException: / by zero
    }
}
