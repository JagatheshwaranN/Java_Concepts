package beforeJava8.features.language_fundamentals.main_method;

public class _01_Main_Method_Intro {

    static final synchronized strictfp public void main(String... param) {

        /*
            1.	Whether class contains the main method or not and whether the main is declared according to the
                requirement or not, these things won’t be checked by the Compiler. At runtime, JVM is responsible
                to check these things. If JVM unable to find the main method then we will get the runtime exception
                as below,
                    "Error: Main method not found in class Test, please define the main method as:
                     public static void main(String[] args)
                     or a JavaFX application class must extend javafx.application.Application"

            2.	At runtime, JVM always searches for the main() method with the following prototype.
                    a.	Why public, To call by JVM from anywhere.
                    b.	Why static, Without the existence of object, JVM has to call this method.
                    c.	Why void, main() won’t return anything to JVM.
                    d.	Why main name, This is the name which is configured inside the JVM.
                    e.	Why String[] args, This is command line arguments. Most commonly used datatype in Java is String
                        so only the command line argument takes String array and also String datatype can be converted
                        into other datatype easily.
                public static void main(String[] args)

            3.	The above syntax is very strict and if we perform any change then we will get the Runtime Exception
                saying "Error: Main method not found..."

            4.	Even though the above syntax is very strict, the following changes are acceptable.
                    a.	Instead of public static, we can take it as static public
                    b.	We can declare string array in any acceptable form such as main(String[] args),
                        main(String []args), and main(String args[]).
                    c.	Instead of args, we can take any valid identifier such as main(String[] qe).
                    d.	We can replace the String array with the Var-Arg parameter.
                    e.	We can declare the main method with the following modifiers as below
                static final synchronized strictfp public void main(String... we)
        */

        System.out.println("Main Method Intro");
    }
}
