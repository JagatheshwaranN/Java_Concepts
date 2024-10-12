package java.features.language_fundamentals.literals;

public class _01_Integer_Literals_Demo1 {

    public static void main(String[] args) {

        /*
            Literals
            ========
            A constant value which can be assigned to the variable is called as Literal.

            For ex, int x = 10. Here, int -> Data Type/Key word, x -> Name of variable / Identifier, and

            10 -> Constant value / Literal.
        */

        /*
            For Integral data types, we can specify the literal values in following ways,

            1.	Decimal form (Base 10), allowed digits are 0 to 9.
                int x = 10;

            2.	Octal form (Base 8), allowed digits are 0 to 7. The literal should be prefixed with 0.
                int x = 010;

            3.	Hexadecimal form (Base 16), allowed digits are 0 to 9 and (a to f / A to F) for extra digits.
                This is one of the very few areas where java is not case-sensitive.
                The literal should be prefixed with 0x/0X.
                int x = 0x10;
        */

        // The programmer has choice to provide the values in decimal, octal and hexadecimal forms
        // whereas JVM provides the value only in decimal form.
        int i1 = 10;
        System.out.println(i1);
        int i2 = 0123;
        System.out.println(i2);
        int i3 = 0xabc;
        System.out.println(i3);
        // int i4 = 018 - Integer Number Too Large
        // int i5 = 0xbear; - ';' expected

        // By default, every integral literal is of int type.
        // But we can specify explicitly as long type by suffixed with L or l.

        // int i6 = 10L; - incompatible types: possible lossy conversion from long to int.

        long l1 = 10L;
        System.out.println(l1);
        long l2 = 10;
        System.out.println(l2);
    }
}
