package java.features.language_fundamentals.primitive_datatypes;

public class _02_Short_Demo1 {

    public static void main(String[] args) {

        /*
            Short is the most rarely used data type in Java.

            1 short => 2 bytes => 16 bits

            Max value => +32767 and Min Value => -32768

            Short values can range from -32768 to +32767

            Representation => -2->15 to 2->15-1

            Usage
            =====
            Short data type is the best suitable for 16-bit processors like 8085 and 8086 processors.
            But these processors are completely outdated. Hence, corresponding short data type is
            also outdated data type.
        */

        short s1 = 32767;
        System.out.println(s1);
        short s2 = -32768;
        System.out.println(s2);
        // short s3 = 32768; - incompatible types: possible lossy conversion from int to short.
        // short s4 = 10.5; - incompatible types: possible lossy conversion from double to short.
        // short s5 = true; - incompatible types: boolean cannot be converted to short.
        // short s6 = "Java"; - incompatible types: java.lang.String cannot be converted to short.
    }
}
