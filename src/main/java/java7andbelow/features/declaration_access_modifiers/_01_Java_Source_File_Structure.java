package java7andbelow.features.declaration_access_modifiers;

public class _01_Java_Source_File_Structure {

    public static void main(String[] args) {

        /*
            Java Source File Structure
            ==========================
            A java program can contain any number of classes but utmost one class should be declared
            as Public. If there is a public class, then name of the program and name of the public
            class should be matched otherwise we will get the compile time error.

            Case 1:
            If there is no public class, then we can give any name for the below program and there
            are no restrictions.
            class A{
            }
            class B{
            }
            class C{
            }

            Case 2:
            If class B is public, then compulsory the name of the program should be B.java. Otherwise,
            we will get the compile time error saying "class B is public, should be declared in a file
            named B.java"
            class A{
            }
            public class B{
            }
            class C{
            }

            Case 3:
            If class B and C declared as public and name of the program is B.java then we will get compile
            time error saying "class C is public, should be declared in a file named C.java"
            class A{
            }
            public class B{
            }
            public class C{
            }

            We can compile a java program but can run java class.

            Example,

            class A{
            public static void main(String[] args){
            SOP("A class");
            }
            }

            class B{
            public static void main(String[] args){
            SOP("B class");
            }
            }

            class C{
            }

            Save file name as Sample.java. Compile the java program Sample.java, the java program
            compiles without issues.

            java A
            o/p: A class

            java B
            o/p: B class

            java C
            RE: NoSuchMethodError: main()

            java Sample
            RE: NoClassDefFoundError
        */

        /*
            Conclusion
            ==========
            1.	Whenever we are compiling a Java program, for every class present in the program a
                separate .class file will be generated.

            2.	We can compile a java program (Java Source File) but we can run a java .class

            3.	Whenever we execute the corresponding java class, then corresponding class main method
                will be executed. If the class does not contain main method then we will get the runtime
                exception for Main method not found.

            4.	Whenever we execute the corresponding java class, and if the corresponding .class file
                not available then we will get the runtime exception saying NoClassDefFoundError.

            5.	It is not recommended to declare / use multiple classes in a single source file. It is
                highly recommended to declare /user only one class per source file and name of the
                program we have should be same as class name. The main advantage of this approach is
                readability and maintainability of the code is improved.
        */
    }
}
