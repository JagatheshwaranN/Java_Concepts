package java7andbelow.features.declaration_access_modifiers;

import static java.lang.Math.sqrt;
import static java.lang.System.out;

public class _03_Static_Import_SOP_Explain {

    public static void main(String[] args) {

        /*
            Static Import
            =============
            1.	Introduced in java 1.5 version. According to SUN, usage of Static import reduces the length of
                the code and increases readability. But according to the world-wide programming experts (Like us)
                usage of Static import creates the confusion and reduces the readability. Hence, if there is
                no specific requirement, it’s not recommended to use Static import.

            2.	Usually, we can access the static members using the class name but whenever we are writing the
                static imports, we can access static members directly without class name.
        */

        // Example without static import
        out.println(Math.sqrt(4));

        // Example with static import
        out.println(sqrt(4));

        /*
            Explanation about System.out.println
            ====================================
            System.out.println();
            Test / System => Test is a class / System is a class present in the java.lang package.
            word / out    => word is a static variable present in Test class of type java.lang.String /
                             out is a static variable present in System class of type PrintStream.
            length() / println() => length() is a method present in String class / Println() is a method
                                    present in PrintStream class.
        */
        class Test {
            static String word = "java";
        }
        Test.word.length();

        // class System {
        //    static PrintStream out;
        // }

        /*
            Out is static variable present in the System class hence we can access the out by using
            the class name System. But whenever we are writing the static import it’s not required
            to use class name, and we can access the out directly.
        */
        out.println("SOP without System class");
    }
}
