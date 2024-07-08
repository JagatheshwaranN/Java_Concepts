package beforeJava8.features.declaration_access_modifiers;

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
        System.out.println(Math.sqrt(4));

        // Example with static import
        System.out.println(sqrt(4));

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

        /*
            While resolving the static members the compiler will always consider the precedence
            in the following order,
            1.	Current class static members
            2.	Explicit static import
            3.	Implicit static import

            import static java.lang.Integer.MAX_VALUE;
            import static java.lang.Byte.*;
            class Test {
            static int MAX_VALUE = 999;
            public static void main(String[] args) {
            System.out.println(MAX_VALUE); 999
            }
            }
        */

        /*
            Normal Import vs Static Import
            ==============================
            Normal
            ======
            Explicit import
            ===============
            import packagename.classname;
            import java.util.ArrayList;

            Implicit import
            ===============
            import packagename.*;
            import java.util.*;

            Static
            ======
            Explicit import
            ===============
            import static packagename.classname;
            import static java.lang.Math.sqrt;

            Implicit import
            ===============
            import static packagename.classname.*;
            import static java.lang.Math.*;

            Difference between Normal and Static Import
            ===========================================
            We can use normal import to import the classes and interfaces of a particular package. Whenever we are
            using the normal imports, it’s not required to use the fully qualified names, and we can use short names.

            We can use static import to import the static members of a particular class / interface. Whenever we are
            using the static imports, it’s not required to use the class name to access the static members and we can
            access directly.
        */

        /*
            Why Static import not recommended?
            ==================================
            1.	Two packages containing the class / interface with the same name is very rare. Hence, the ambiguity
                problem is very rare in normal import. But, two classes / interfaces contain a variable / method with
                the same name is very common and hence the ambiguity problem is also very common problem in Static import.

            2.	Usage of static import reduces the code readability and creates the confusion. Hence, if there is no
                specific requirement, then it’s not recommended to use Static import.
        */
    }
}
