package java7andbelow.features.exception_handling;

public class _16_Top_Ten_Exceptions {

    public static void main(String[] args) {

        /*
            TOP 10 Exceptions
            =================
            Based on the person who is raising an exception, all exceptions are divided into
            2 categories as below,
                1.	JVM Exceptions
                2.	Programmatic Exceptions

            JVM Exceptions
            ==============
            The exceptions which are raised by the JVM whenever a particular event occurs are
            called as JVM Exceptions.

            Example,
            ArithmeticException
            NullPointerException

            Programmatic Exceptions
            =======================
            The exceptions which are raised explicitly either by programmer or by API developer
            to indicate that something goes wrong are called as Programmatic Exceptions.

            Example,
            TooOldException
            IllegalArgumentException
        */

        /*
            ArrayIndexOutOfBoundsException
            ==============================
            It is a child class of Runtime Exception and hence it's unchecked. Raised by the JVM
            whenever we are trying to access the array element with out-of-range index.
        */
        int []a1 = new int[2];
        // System.out.println(a1[3]); - Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException:
        //Index 3 out of bounds for length 2

        /*
            NullPointerException
            ====================
            It is a child class of Runtime Exception and hence it's unchecked. Raised by the JVM
            whenever we are trying to perform any operation on null.
        */
        String s1 = null;
        // System.out.println(s1.length()); - Exception in thread "main" java.lang.NullPointerException:
        // Cannot invoke "String.length()" because "s1" is null

        /*
            ClassCastException
            ==================
            It is a child class of Runtime Exception and hence it's unchecked. Raised by the JVM
            whenever we are trying to typecast parent object to child type.
        */
        Object o1 = new Object();
        // String s2 = (String) o1; - Exception in thread "main" java.lang.ClassCastException: class
        // java.lang.Object cannot be cast to class java.lang.String

        /*
            StackOverFlowError
            ==================
            It is a child class of Error and hence it's unchecked. Raised by the JVM
            whenever we are trying to perform the recursive method call.
        */
        // method1(); - Exception in thread "main" java.lang.StackOverflowError
    }

    public static void method1(){
        method2();
    }
    public static void method2(){
        method1();
    }
}

