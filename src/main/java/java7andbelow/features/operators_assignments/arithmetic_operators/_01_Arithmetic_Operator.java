package java7andbelow.features.operators_assignments.arithmetic_operators;

public class _01_Arithmetic_Operator {

    public static void main(String[] args) {

        /*
            If we apply any arithmetic operator between two variables, the result type is always of
            max (int, type of a, type of b).
            byte + byte   => int
            byte + short  => int
            short + short => int
            byte + long   => long
            long + double => double
            float + long  => float
            char + char   => int
            char + double => double
        */

        System.out.println('a'+'b');
        System.out.println('a'+0.98);

        /*
            About Infinity
            ==============
            In Integral arithmetic (Byte, Short, Int, and Long) there is no way to represent the infinity.
            Hence, if infinity is the result, then we will get the RE: arithmetic exception / by zero. But
            in floating point arithmetic, there is a way to represent the infinity. Because, the Float and
            Double classes contains the two constants NEGATIVE_INFINITY and POSITIVE_INFINITY. Hence,
            even though the result is infinity we won’t get any arithmetic exception in floating point
            arithmetic.
        */
    }
}
