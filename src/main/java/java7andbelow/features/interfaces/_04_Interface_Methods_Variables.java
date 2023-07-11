package java7andbelow.features.interfaces;

public class _04_Interface_Methods_Variables {

    public static void main(String[] args) {

        /*
            Interface Method
            ================
            Every method present inside Interface is always Public and Abstract whether we are declaring
            or not.
            interface A
            {
            void m1();
            }
            Public   > To make this m1() to be available for every implementation class (Either class
                       from same package or outside package).
            Abstract > Implementation class only is responsible to provide the implementation.

            Inside Interface, the following method declarations are equal.
            void m1();
            public void m1();
            abstract void m1();
            public abstract void m1();

            As every Interface method is public abstract by default. Hence, we can’t declare the
            interface method with following modifiers.

            Static, Final, Synchronized, Strictfp and Native.
        */

        /*
            Interface Variable
            ==================
            An Interface can contain variables. The main purpose of the Interface variable is to define
            the requirement level constants. Every Interface variable is always Public Static Final.
            Example,
            interface ABC {
            int x = 10;
            }
            Public > To make this variable available to every implementation class.
            Static > Without existing object also, Implementation class has access to this variable.
            Final  > If one implementation class changes the value, then all other implementation
                     classes will be affected. To restrict this every interface variable is always final.

            As every interface variable is always public static final. We can’t declare with the
            following modifiers with interface.

            Protected, Private, Transient and Volatile.

            For interface variables, compulsory we should perform declaration at the time of declaration
            otherwise we will get the compile time error.

            Inside implementation class, we can access the interface variable but we can’t modify the
            values of the variable.
        */
    }
}

interface IDemo5 {
    void method1();
    public void method2();
    abstract void method3();
    public abstract void method4();
}

interface IDemo6 {
    int x1 = 10;
    // int x2; - CTE: = expected
    // int x3;
}

class ServiceProvider2 implements IDemo6 {
    public void display() {
        // x3 = 10; - Cannot assign a value to final variable 'x3
    }
}