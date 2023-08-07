package java7andbelow.features.exception_handling;

import java.io.PrintWriter;

public class _11_Throws_Clause {
    public static void main(String[] args) throws InterruptedException {

        /*
            Throws Clause
            =============
            In our program, if there is a possibility of raising checked exception then
            compulsory, we should handle the checked exception. Otherwise, we will get
            the compile time error saying "Unreported exception XXXX must be caught or
            declared to be thrown".
        */

        /*
            Compile Time Error Handling
            ===========================
            We can handle this compile time error by using the following 2 ways,
            1.	try catch
            2.	throws
        */

        /*
            Throws Keyword
            ==============
            We can use throws keyword to delegate the responsibility of the exception
            handling to the caller (It may be another method or JVM). Then the caller
            method is responsible to handle that exception.

            Conclusion of Throws
            ====================
            1.	Throws keyword required only for checked exception and usage of throws
                in unchecked exceptions is of no use or impact.
            2.	Throws keyword required only to convince the compiler.
            3.	Usage of the Throws keyword does not prevent the abnormal termination of
                the program.
        */

        /*
            Note:
            =====
            1. In the above program, if we remove at least, one throws statement then the
            code won’t compile.
            2. It’s recommended to use the try catch over the throws keyword.
        */

        CheckedExceptionDemo1.method();
        CheckedExceptionDemo2.method();
        CheckedExceptionDemo2WithTryCatch.method();
        CheckedExceptionDemo2WithThrows.method();
    }
}

class CheckedExceptionDemo1 {
    public static void method(){
        // unreported exception java.io.FileNotFoundException; must be caught or declared to be thrown
        // PrintWriter printWriter = new PrintWriter("abc.text");
        // printWriter.println("Hello");
    }
}

class CheckedExceptionDemo2 {
    public static void method(){
        // unreported exception java.lang.InterruptedException; must be caught or declared to be thrown
        // Thread.sleep(1000);
    }
}

class CheckedExceptionDemo2WithTryCatch {
    public static void method(){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("CheckedExceptionDemo2WithTryCatch");
    }
}

class CheckedExceptionDemo2WithThrows {
    public static void method() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("CheckedExceptionDemo2WithThrows");
    }
}