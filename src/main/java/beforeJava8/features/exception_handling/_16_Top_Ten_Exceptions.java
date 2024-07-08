package beforeJava8.features.exception_handling;

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
            to indicate that something goes wrong is called as Programmatic Exceptions.

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
            whenever we are trying to typecast the parent object to the child type.
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

        /*
            NoClassDefFoundError
            ====================
            It is a child class of Error and hence it's unchecked. Raised by the JVM
            whenever JVM unable to find the required .class file.
            Example,
            java Test
            If Test.class is not available, then we will get the RuntimeException saying
            NoClassDefFoundError: Test.
        */

        /*
            ExceptionInInitializerError
            ===========================
            It is a child class of Error and hence it's unchecked. Raised by the JVM
            if any exception occurs while executing the static variable assignments
            and static blocks.
        */

        /*
            IllegalArgumentException
            ========================
            It is a child class of Runtime Exception and hence it's unchecked. Raised
            explicitly either by Programmer or by API developer to indicate that a method
            has been invoked with illegal argument.

            The valid range of Thread priorities is 1 to 10. If we are trying to set the
            priority with any other value then we will get the runtime exception saying
            RE: IllegalArgumentException.
        */
        // method3(); - Exception in thread "main" java.lang.IllegalArgumentException

        /*
            NumberFormatException
            =====================
            It is a direct child class of IllegalArgumentException and which is child
            class of Runtime Exception and hence it's unchecked. Raised explicitly either
            by Programmer or by API developer to indicate that we are trying to convert
            the string to number and the string is not properly formatted.
        */
        // int x = Integer.parseInt("Ten"); - Exception in thread "main" java.lang.Number
        // FormatException: For input string: "Ten"

        /*
            IllegalStateException
            =====================
            It is a child class of Runtime Exception and hence it's unchecked. Raised
            explicitly either by Programmer or by API developer to indicate that a method
            has been invoked at wrong time.

            After starting of a thread, we are not allowed to restart the same thread once
            again otherwise we will get the runtime exception saying IllegalThreadStateException.
        */
        // method4(); - Exception in thread "main" java.lang.IllegalThreadStateException

        /*
            Assertion Error
            ===============
            It is a child class of Error and hence it's unchecked. Raised explicitly either
            by Programmer or by API developer to indicate that assert statement fails.

            If x is not greater than 10 then we will get the runtime exception saying
            AssertionError.

            int x = 5;
            assert ( x > 10); -> RE: AssertionError
        */
    }

    public static void method1(){
        method2();
    }
    public static void method2(){
        method1();
    }

    static {
        // Exception in thread "main" java.lang.ExceptionInInitializerError
        // Caused by: java.lang.ArithmeticException: / by zero
        // System.out.println(10/0);
        System.out.println("Static Block");
    }

    public static void method3(){
        Thread t = new Thread();
        t.setPriority(15);
    }

    public static void method4(){
        Thread t = new Thread();
        t.start();
        t.start();
    }
}


