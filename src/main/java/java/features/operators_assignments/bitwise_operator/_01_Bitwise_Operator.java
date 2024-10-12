package java.features.operators_assignments.bitwise_operator;

public class _01_Bitwise_Operator {

    public static void main(String[] args) {

        /*
            Bitwise Operator (&, |, ^)
            ==========================
            & - Return True, if both arguments are true
            | - Return True, if any one argument is true
            ^ - Return True, if both arguments are different

            We can apply the bitwise operators for Integral types as well.
            4 -> 100
            5 -> 101
            & --> 100
            |---> 101
            ^---> 001
        */
        System.out.println(true & true);
        System.out.println(false & false);
        System.out.println(true | false);
        System.out.println(false | false);
        System.out.println(true ^ false);

        System.out.println(4 & 5);
        System.out.println(4 | 5);
        System.out.println(4 ^ 5);

        /*
            Bitwise Complement Operator (~)
            ===============================
            We can apply this operator only for integral types but not for boolean type. If we are trying to
            apply for boolean type, then we will get the compile time error.

            For example
            ===========
            SOP(~4); => -5.  (We have to perform the complement for 32 bits and have to perform the 2’s complement
                              form.)
            1. Complement => Write the number in binary form and reverse the given number
            2. 1’s complement => Reverse the above complement number form
            3. 2’s complement => Add 1 at the last and perform the calculation, the resulting value will be the correct
                                 value.
            4. When doing the 1’s complements the MSB becomes 1 which indicates the negative sign.
        */

        System.out.println(~4);
    }
}
