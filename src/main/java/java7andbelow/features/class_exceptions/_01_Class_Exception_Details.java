package java7andbelow.features.class_exceptions;

public class _01_Class_Exception_Details {

    public static void main(String[] args) {

        /*
            NoClassDefFoundError
            ====================
            While using the new() operator, at runtime if the corresponding .class file is not available
            then we will get the runtime exception saying "NoClassDefFoundError".
            For example,
            Test t = new Test(); At runtime, if Test.class is not available, then RE: will trigger.

            ClassNotFoundException
            ======================
            While using the newInstance() method, at runtime if the corresponding .class is not available
            then we will get the runtime exception saying "ClassNotFoundException".
            For example,
            Object o = Class.forName(args[0]).newInstance();
            Java Test Test123; At runtime, if Test123.class is not available, then RE: will trigger.

            new()
            =====
            1. It is a operator in java
            2. We can use new() operator if we know the class name at the beginning.
            3. To use new() operator, the class not required to contain no-arg constructor.
            4. At runtime, if .class file is not available then we will get the runtime exception
               saying "NoClassDefFoundError" and which is unchecked.


            newInstance()
            =============
            1. It is an method present in java.lang.class
            2. We can use the newInstance() method, if we don’t know the class name at the beginning and
               if it's available at runtime.
            3. To use newInstance() method, the class should contain the no-arg constructor. Otherwise,
               we will get RE: Instantiation Exception.
            4. At runtime, if the corresponding .class file is not available then we will get the runtime
               exception saying "ClassNotFoundException" and which is checked.
        */
    }
}
