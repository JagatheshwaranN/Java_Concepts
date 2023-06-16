package java7andbelow.features.operators_assignments.arithmetic_operators;

import static java.lang.Double.NaN;

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

        // System.out.println(10/0); // Exception in thread "main" java.lang.ArithmeticException: / by zero

        // System.out.println(10/0.0); // Infinity

        // System.out.println(-10/0.0); // -Infinity

        /*
            NAN
            ===
            In Integral arithmetic (Byte, Short, Int, and Long) there is no way to represents the undefined
            results. Hence, if the results are undefined, we will get the RE: arithmetic exception / by zero.
            But in floating point arithmetic (float and Double) there is a way to represent the undefined results.
            Because, the Float and Double classes contains the constant NAN. Hence, even though the result is
            undefined we won’t get any arithmetic exception in floating point arithmetic.
        */

        // System.out.println(0/0); // Exception in thread "main" java.lang.ArithmeticException: / by zero

        // System.out.println(0.0/0); // NaN

        // System.out.println(-0.0/0); // NaN

        // For any x value including NAN the following expressions returns false.
        double x = 10.0;
        System.out.println( x < NaN);
        System.out.println( x <= NaN);
        System.out.println( x > NaN);
        System.out.println( x >= NaN);
        System.out.println( x == NaN);

        // For any x value including NAN the following expressions returns true.
        System.out.println( x != NaN);
        System.out.println( Float.NaN != Float.NaN);

        System.out.println( Float.NaN == Float.NaN);
        System.out.println( x < Float.NaN);
        System.out.println( x <= Float.NaN);
        System.out.println( x > Float.NaN);
        System.out.println( x >= Float.NaN);
        System.out.println( x == Float.NaN);

        /*
            Arithmetic Exception
            ====================
            1.	It is a Runtime exception but not compile time error.
            2.	It is possible only in Integral arithmetic but not in floating point arithmetic.
            3.	The only operators which cause the arithmetic exception are / and %
        */





    }
}
