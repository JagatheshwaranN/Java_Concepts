package beforeJava8.features.operators_assignments.assignment_operator;

public class _01_Assignment_Operator {

    public static void main(String[] args) {

        /*
            Assignment Operator
            ===================
            1. There are 3 types of assignment operators.
                1. Simple assignment
                2. Chained assignment
                3. Compound assignment

            2. We can’t perform the chained assignment directly at the time of the declaration.

            3. Sometimes the assignment operator mixed with some other operator such type of operators
               is called as compound assignment operator. The following are the possible compound assignment
               operators in Java.
               +=, -=, *=, /=, %=, &=, |=, ^=, >>=, >>>=, <<=

            4. In the case of the compound assignment operator, internal type casting will be performed
               automatically.
                For example,
                byte b = 10;
                b = b+1;
                SOP(b); => CE: Possible loss of precision -> max(int, byte, int)
                byte b = 10;
                b+=1;
                SOP(b); => 11 -> b = (byte)(b+1);

            5. Sometimes, the chained and compound operators can be combined as below,
                int a, b, c, d;
                a = b = c = d = 20;
                a+= b-= c*= d/= 2;
        */

        int i1 = 10; // Simple Assignment
        int i2, i3, i4, i5;  i2 = i3 = i4 = i5 = 10; // Chained Assignment
        int i6 = 0; i6+=20; // Compound Assignment

        // int i7 = i8 = 20; // cannot find symbol - variable i8

        byte b1 = 10;
        b1 += 1; // b1 = (byte)(b1+1);
        System.out.println(b1);

        int i9, i10, i11, i12;
        i9 = i10 = i11 = i12 = 20;
        i9 += i10 -= i11 *= i12 /= 2;
        System.out.println("i9  => "+i9);
        System.out.println("i10 => "+i10);
        System.out.println("i11 => "+i11);
        System.out.println("i12 => "+i12);
    }
}
