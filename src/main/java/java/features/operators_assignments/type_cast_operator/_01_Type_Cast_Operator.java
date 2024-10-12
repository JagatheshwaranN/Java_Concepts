package java.features.operators_assignments.type_cast_operator;

public class _01_Type_Cast_Operator {

    public static void main(String[] args) {

        /*
            Type Cast Operator
            ==================
            There are two types of type casting such as Implicit and Explicit.

            Implicit Type Casting
            =====================
            1.	Compiler is responsible to perform the implicit type casting.
            2.	Whenever we are assigning smaller datatype value to bigger data type variable then implicit type casting will be performed.
            3.	It is also known as Widening or Up casting.
            4.	There is no loss of information in this type casting.

            Explicit Type Casting
            =====================
            1.	The programmer is responsible to perform the explicit type casting.
            2.	Whenever we are assigning bigger data type value to smaller data type variable then explicit type casting will be performed.
            3.	It is also known as Narrowing or Down casting.
            4.	There may be a chance of loss of information.
        */
        int i1 = 'a';
        System.out.println(i1); // 97 - Compiler converts char to int automatically by Implicit type casting.
        double d1 = 10;
        System.out.println(d1); // 10.0 - Compiler converts int to double automatically by Implicit type casting.

        /*
            Explicit Type Casting Issue
            ===========================
            Whenever we are assigning the bigger data type value to the smaller data type variable by
            explicit type casting, then the MSB will be lost, and we have to consider only the LSB
            (last 8 bits since its byte).

            int x = 130 -> 0000...010000010 (represent in 32 bit). To get the binary form -> Take LCM with 2.
            byte b = (byte)x -> 10000010 <- Considering only LSB bits and taking 2’s complement form to get
            the value.
            1’s complement of 1 0000010 -> 1111101. Here the value 1 is for -ve sign.
            2’s complement of 1111101 with adding the 1 at last and after calculation -> 1111110.
            2->6+2->5+2->4+2->3+2->2+2->1+2->0 => 126 => -126.
        */
        int i2 = 130;
        // byte b1 = i2; // incompatible types: possible lossy conversion from int to byte
        byte b1 = (byte)i2;
        System.out.println(b1); // -126 - Loss of information.

        // Whenever we are assigning the bigger data type value to the smaller data type variable by explicit
        // type casting, then the MSB will be lost and we have to consider only the LSB (last 16 bits since
        // its short).
        int i3 =150;
        short s1 = (short)i3;
        System.out.println(s1);
        // int x = 150 => 0000...010010110
        // short s = (short)x => 00...010010110 => +150 <= Considering only last 16 LSB bits.

        // If we assign the floating-point values to the integral data type variable by explicit type casting
        // then the digits after the decimal points will be gone.
        double d2 = 130.456;
        int i4 = (int)d2;
        System.out.println(i4);
    }
}
