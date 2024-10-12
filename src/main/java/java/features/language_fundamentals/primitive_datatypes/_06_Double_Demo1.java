package java.features.language_fundamentals.primitive_datatypes;

public class _06_Double_Demo1 {

    public static void main(String[] args) {

        /*
            Double datatype can be used to represent 14 to 15 places of accuracy(precision).

            Double follows double precision.

            Size of Double is 8 bytes.

            Double value can range from -1.7 e->308 to +1.7 e->308.
        */

        double d1 = 12345.12345678901234;
        System.out.println(d1);
        double d2 = 1234567890;
        System.out.println(d2);
        double d3 = 9223372036854775807L;
        System.out.print(d3);
        // double d4 = true; - incompatible types: boolean cannot be converted to double.
        // double d5 = "java"; - incompatible types: java.lang.String cannot be converted to double.
    }
}
