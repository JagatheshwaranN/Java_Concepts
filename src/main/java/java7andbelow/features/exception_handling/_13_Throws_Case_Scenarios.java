package java7andbelow.features.exception_handling;

import java.io.IOException;

public class _13_Throws_Case_Scenarios {

    public static void main(String[] args) {

        /*
            Case 1: Throws can't use for Class
            ==================================
            We can use the throws keyword for methods and constructors but not for classes.

            Case 2: Throws keyword can be used only for Throwable types
            ===========================================================
            We can use throws keyword only for Throwable types. If we are trying to use for
            normal Java objects then we will get the compile time error saying Incompatible
            Types.

            Case 3: Difference between throw Error and Exception
            ====================================================
            We can use throw with both Exception and Error.

            Case 4: Catch Block not recommended if no exception raise
            =========================================================
            In our program, within the try block if there is no chance of raising the exception
            then we can't write the catch block to handle that exception. Otherwise, we will get
            the compile time error saying "Exception XXX is never thrown in body of corresponding
            try statement". But this rule is applicable only for Fully checked exception.
        */

        ThrowsCase3DemoB.method();
        ThrowsCase4DemoA.method();
        ThrowsCase4DemoB.method();
        ThrowsCase4DemoC.method();
        ThrowsCase4DemoD.method();
    }
}

class ThrowsCase1Demo  { // throws Exception { - '{' expected
    ThrowsCase1Demo() throws Exception {
    }
    public void method() throws Exception {
    }
}

class ThrowsCase2DemoA {
    // java: incompatible types: java7andbelow.features.exception_handling.ThrowsCase2DemoA
    // cannot be converted to java.lang.Throwable
    // public void method() throws ThrowsCase2DemoA {
    // }
}

class ThrowsCase2DemoB extends Throwable {
    public void method() throws ThrowsCase2DemoB {
    }
}

class ThrowsCase3DemoA {
    public void method() {
        // throw new Exception(); - java: unreported exception java.lang.Exception;
        // must be caught or declared to be thrown
    }
}

class ThrowsCase3DemoB {
    public static void method() {
        // throw new Error(); - Exception in thread "main" java.lang.Error
    }
}

class ThrowsCase4DemoA {
    public static void method() {
        // try{
            System.out.println("Hello");
        // }
        // catch(IOException e){ - java: exception java.io.IOException is never thrown
        // in body of corresponding try statement
        // }
    }
}

class ThrowsCase4DemoB {
    public static void method() {
        try {
        System.out.println("Hello");
        }
        catch(ArithmeticException e){
            System.out.println("Catch Block");
        }
    }
}

class ThrowsCase4DemoC {
    public static void method() {
        try {
            System.out.println("Hello");
        }
        catch(Exception e){
            System.out.println("Catch Block");
        }
    }
}

class ThrowsCase4DemoD {
    public static void method() {
        try {
            System.out.println("Hello");
        }
        catch(Error e){
            System.out.println("Catch Block");
        }
    }
}