package java.features.operators_assignments.increment_decrement_operator;

public class _02_Increment_Decrement_Points_To_Know {

    public static void main(String[] args) {

        /*
            Points to Remember
            ==================
            1.  We can apply the increment and decrement operators only on variables and not on constant values.
                If we are trying to apply for constant values, then we will get the compile time error.

            2.  Nesting of the increment and decrement operators are not allowed.

            3.	For final variables, we can’t apply increment and decrement operators.

            4.	We can apply the increment and decrement operators for every primitive data type except the boolean.
        */

        int x1 = 10;
        int y1 = ++x1;
        System.out.println(y1);

        // int y2 = ++10; // unexpected type - required: variable, found: value

        // int y3 = ++(++x1); // unexpected type - required: variable, found: value

        final int x2 = 10;
        // int y4 = ++x2; // cannot assign a value to final variable x2

        char c1 = 'a';
        c1++;
        System.out.println(c1);
        double d1 = 10.5;
        d1++;
        System.out.println(d1);

        /*
            Difference between B++ and B+1
            ==============================
            1.	If we apply any arithmetic operators between two variables a and b, the result type is always
                max (int, type of a, type of b).

            2.	In case of increment and decrement operators, the internal type casting is performed automatically.
        */

        byte b1 = 10;
        byte b2 = 20;
        // byte b3 = b1 + b2; // incompatible types: possible lossy conversion from int to byte

        // Because => max (int, byte, byte)
        // We can solve this compile time error, by performing the type casting.
        byte b4 = (byte)(b1+b2);
        System.out.println(b4);

        byte b5 = 10;
        // b5 = b5 + 1; // incompatible types: possible lossy conversion from int to byte

        // Because => max (int, byte, byte)
        // We can solve this compile time error, by performing the type casting.
        b5 = (byte)(b5+1);
        System.out.println(b5);

        byte b6 = 10;
        b6++;
        // b++ => (Type of b) (b+1);
        System.out.println(b6);
    }
}