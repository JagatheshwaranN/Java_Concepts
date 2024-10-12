package java.features.oops;

public class _07_Method_Overloading {

    public static void main(String[] args) {

        /*
            Method Overloading
            ==================
            1. When two methods are said to be overloaded if and only if both methods having the same method
               name but different argument types.

            2. In C language, the method overloading concept is not available. Hence, we can’t declare the
               multiple methods with same name and different argument types. If there is a change in the
               argument type, compulsory we should go for new method name which increases the complexity of
               the programming.
               Example,
               abs (int)
               labs (long)
               fabs (float)

               3. In Java, we can declare multiple methods with same name and different argument types.
                  Such type of methods is called as Overloaded methods.
                  abs (int)
                  abs (long)
                  abs (float)
                  Having the overloading concept in Java, reduces the complexity of the programming.
        */

        MODemo demo = new MODemo();
        demo.modMethod1();
        demo.modMethod1(10);
        demo.modMethod1(10.5);

        /*
            Note
            ====
            In method overloading, the method resolution always takes care by the Compiler based on the
            reference type. Hence, overloading is also considered as Compile Time Polymorphism / Static
            Polymorphism / Early binding.
        */
    }

}

class MODemo{

    public void modMethod1(){
        System.out.println("No Arg Method");
    }

    public void modMethod1(int i){
        System.out.println("Int Arg Method");
    }

    public void modMethod1(double d){
        System.out.println("Double Arg Method");
    }
}