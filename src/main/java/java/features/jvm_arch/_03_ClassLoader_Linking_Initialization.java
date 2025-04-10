package java.features.jvm_arch;

public class _03_ClassLoader_Linking_Initialization {

    public static void main(String[] args) {

        /*
            Linking
            =======
            Linking consists of 3 activities such as Verify, Prepare and Resolve.

            Verification / Verify
            ======================
            It is the process of ensuring that binary representation of a class is
            structurally correct or not. i.e., JVM will check whether the .class is
            generated by valid compiler or not i.e., .class file is properly formatted
            or not. Internally, Byte Code Verifier is responsible for this activity.
            BCV is a part of the class loader subsystem. If verification fails, then
            we will get runtime exception saying java.lang.VerifyError.

            Preparation
            ===========
            In this phase, JVM will allocate memory for a class level static variables
            and assign default values.
            Note:
            =====
            In the initialization phase, original values will be assigned to the static
            variables, and here only default values will be assigned.

            Resolve
            =======
            It is the process of replacing symbolic names in the program with original
            memory references from the Method Area.

            Example,
            class Test {
                public static void main (String[] args) {
                    String s = new String("java");
                    Student s1 = new Student ();
                }
            }

            For the above class, class loader loads Test.class, String.class,
            Student.class and Object.class. The names of these classes are stored
            in the constant pool of Test class. In the resolution phase, these names
            are replaced with original memory level references from the Method Area.
        */

        /*
            Initialization
            ==============
            In this phase, all static variables are assigned with original values, and
            static blocks will be executed from Parent to Child and from Top to Bottom.

            Note: While loading, linking and initialization, if any error occurs, then
            we will get the runtime exception saying java.lang.LinkageError.
        */
    }

}
