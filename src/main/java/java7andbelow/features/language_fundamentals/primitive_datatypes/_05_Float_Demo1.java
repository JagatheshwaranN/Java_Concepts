package java7andbelow.features.language_fundamentals.primitive_datatypes;

public class _05_Float_Demo1 {

    public static void main(String[] args) {

        /*
            Float datatype can be used to represent 5 to 6 decimal places of accuracy(precision).

            Float follows single precision.

            Size of Float is 4 bytes.

            Float value can range from -3.4 e ->38 to +3.4 e->38.
        */

        float f1 = 123.456789f;
        System.out.println(f1);
        float f2 = 123;
        System.out.println(f2);
        float f3 = 12345678L;
        System.out.println(f3);
        // float f4 = true; - incompatible types: boolean cannot be converted to float.
        // float f5 = "java"; - incompatible types: java.lang.String cannot be converted to float.
    }
}
