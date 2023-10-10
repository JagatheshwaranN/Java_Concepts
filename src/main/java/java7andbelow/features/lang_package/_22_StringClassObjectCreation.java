package java7andbelow.features.lang_package;

public class _22_StringClassObjectCreation {

    public static void main(String[] args) {

        String s1 = new String("You can't change me!");
        String s2 = new String("You can't change me!");
        System.out.println(s1 == s2);
        String s3 = "You can't change me!";
        System.out.println(s1 == s3);
        String s4 = "You can't change me!";
        System.out.println(s3 == s4);
        String s5 = "You can't "+"change me!";
        System.out.println(s4 == s5);
        String s6 = "You can't ";
        String s7 = s6 + "change me!";
        System.out.println(s3 == s7);
        final String s8 = "You can't ";
        String s9 = s8 + "change me!";
        System.out.println(s3 == s9);
        System.out.println(s6 == s8);

        /*
            Conclusion
            ==========
            String s5 = "You can't " + "change me!";
            The above operation will be performed at compile time only because both arguments
            are compile time constants.

            String s7 = s6 + " change me!";
            The above operation will be performed at run time only because at least one argument
            is normal variable.

            String s9 = s8 + " change me!";
            The above operation will be performed at compile time only because both arguments
            are compile time constants.
        */

        /*
            Interning of String Objects
            ===========================
            1. By using Heap object reference, if we want to get the corresponding SCP object
               reference then we should go for intern() method.

            2. If the corresponding SCP object is not available then intern() method itself will
               create the corresponding SCP object.
        */
        String s10 = new String("Java");
        String s11 = s10.intern();
        System.out.println(s10 == s11);
        String s12 = "Java";
        System.out.println(s11 == s12);

        String s13 = new String("Java");
        String s14 = s13.concat("Program");
        String s15 = s14.intern();
        System.out.println(s14 == s15);
        String s16 = "JavaProgram";
        System.out.println(s15 == s16);
    }

}
