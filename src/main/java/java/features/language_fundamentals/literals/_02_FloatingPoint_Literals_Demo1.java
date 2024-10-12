package java.features.language_fundamentals.literals;

public class _02_FloatingPoint_Literals_Demo1 {

    public static void main(String[] args) {

        /*
            By default, every floating-point literal is of double type and hence we can’t assign directly
            to the float variable.

            But we can specify floating point literal by suffixed with F/f.
        */

        float f1 = 123.456f;
        System.out.println(f1);
        // float f2 = 123.456; - incompatible types: possible lossy conversion from double to float.

        double d1 = 123.456;
        System.out.println(d1);

        // We can specify floating point literal as double type by suffixed with D/d.
        // Of course, this convention is not required.
        double d2 = 123.45d;
        System.out.println(d2);

        // float f3 = 123.45d; - incompatible types: possible lossy conversion from double to float.

        // The floating point literals can only be represented in the decimal form.
        double d3 = 123.456;
        System.out.println(d3);
        double d4 = 0123.45;
        System.out.println(d4);
        // double d5 = 0x123.45; - malformed floating-point literal

        // We can assign Integral literal directly to Floating point variable and that Integral literal
        // can be specified in decimal / octal / hexadecimal forms.
        double d6 = 123;
        double d7 = 0xabc;
        double d8 = 0786.0;
        // double d9 = 0786; - Integer number too large
        // double d10 = oxface.0; -  ';' expected
    }
}
