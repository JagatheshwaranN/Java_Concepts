package java7andbelow.features.language_fundamentals.primitive_datatypes;

public class _03_Int_Demo1 {

    public static void main(String[] args) {

        /*
            Int is the most commonly used data type in Java.

            1 int => 4 bytes => 32 bits

            Max value => +2147483647 and Min Value => -2147483648

            Int value can range from -2147483648 to +2147483647

            Representation => -2->31 to 2->31-1

        */

        int i1 = 2147483647;
        System.out.println(i1);
        int i2 = -2147483648;
        System.out.println(i2);
        // int i3 = 2147483648; - integer number too large.
        // int i4 = 2147483648L; - incompatible types: possible lossy conversion from long to int.
        // int i5 = 10.5; - incompatible types: possible lossy conversion from double to int.
        // int i6 = true - incompatible types: boolean cannot be converted to int.
        // int i7 = "java"; - incompatible types: java.lang.String cannot be converted to int.
    }
}
