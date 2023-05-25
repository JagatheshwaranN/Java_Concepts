package java7andbelow.features.language_fundamentals.primitive_datatypes;

public class _01_Byte_Demo1 {

    public static void main(String[] args) {

        /**
         *
         *  1 byte -> 8 bits
         *
         *  Bytes value can range from -128 to +127
         *
         *  In Bytes, The most significant bit acts as sign bit. 0 means +ve and 1 means -ve.
         *  Positive numbers will be represented directly in memory whereas negative numbers
         *  will be represented in 2’s complement form.
         *
         *  Usage
         *  =====
         *  Byte is the best choice if we want to handle data in terms of Streams either from File or Network.
         *  File or Network supported form is byte.
         *
         */

        byte b1 = 127;
        System.out.println(b1);
        byte b2 = -128;
        System.out.println(b2);
        // byte b3 = 128; - incompatible types: possible lossy conversion from int to byte.
        // byte b4 = 10.5; - incompatible types: possible lossy conversion from double to byte.
        // byte b5 = true; - incompatible types: boolean cannot be converted to byte.
        // byte b6 = "java"; - incompatible types: java.lang.String cannot be converted to byte.
    }
}
