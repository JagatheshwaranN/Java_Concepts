package java.features.language_fundamentals.literals;

public class _05_Binary_Literals_Demo1 {

    public static void main(String[] args) {

        /*
            Java 1.7 version enhancement with respect to Literal as below,

            Binary Literal
            ==============
            For Integral data types until Java 1.6 version is decimal, octal, and hexadecimal forms.
            But, from Java 1.7 version onwards, we can represent the Integral literal in binary form as well.
            The allowed digits of binary form are 0 and 1. The literal value should be prefixed with 0b/0B.
        */

        int i1 = 0B1111;
        System.out.println(i1);

        /*
            Usage of underscore (_) symbols in numeric literals implemented in Java from 1.7 version.
            We can use the underscore between the numeric values.

            Adv: Readability of the code is improved.
        */

        double d1 = 1_23_456.789_123;
        System.out.println(d1);
        double d2 = 123_456.7_8_9;
        System.out.println(d2);

        // At the time of compilation, these underscore symbols will be removed automatically.
        // Hence, after compilation, the above code will become as double d1 = 123456.789123.
        // We can use underscore symbols only between the numbers(digits).
        // If we use anywhere else, then compile time error will be triggered.
        // We can use more than one underscore symbols between the numeric values.

        double d3 = 1__23__456.7_8__9;
        System.out.println(d3);
    }
}
