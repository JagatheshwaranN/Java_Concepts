package java.features.language_fundamentals.primitive_datatypes;

public class _04_Long_Demo1 {

    public static void main(String[] args) {

        /*
            Sometimes Int may not be enough to hold the big values. Then we should use long data type.
            For ex,
            1.	The amount of distance travelled by light in 1000 days, to hold this value Int may not be enough.
                We should go for long data type such as long l = 126000 * 60 * 60 * 24 * 1000;
            2.	The number of chars present in the big file may exceed int range.
                Hence, the return type of length method is long and not int. long l = f. length ();

            1 long => 8 bytes => 64 bits

            Max value => 9,223,372,036,854,775,807 and Min value => -9,223,372,036,854,775,808

            Long value can range from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

            Representation => -2->63 to 2->63-1
        */

        long l1 = 2147483648L;
        System.out.println(l1);
        long l2 = 9223372036854775807L;
        System.out.println(l2);
        long l3 = -9223372036854775808L;
        System.out.println(l3);
        // long l4 = 9223372036854775808L; - integer number too large.
        // long l5 = 922337.203685477; - incompatible types: possible lossy conversion from double to long.
        // long l6 = true; - incompatible types: boolean cannot be converted to long.
        // long l7 = "java" - incompatible types: java.lang.String cannot be converted to long.
    }
}
