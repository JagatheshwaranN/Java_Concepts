package java.features.operators_assignments.relational_operator;

public class _01_Relational_Operator {

    public static void main(String[] args) {

        /*
            Relational Operators (<, <=, >, >=)
            ===================================
            1. We can apply relational operators for every primitive data type except the boolean data type.

            2. We can’t apply the relational operators for Object data types.

            3. Nesting of the relational operators are not allowed otherwise we will get the compile time
               error.
        */

        System.out.println(10 < 20);
        System.out.println(30 > 20);
        System.out.println(10 <= 10);
        System.out.println(20 >= 20);

        System.out.println(10.5 < 20.0);
        System.out.println(30.5 > 20.10);
        System.out.println(10.0 <= 10.0);
        System.out.println(20.5 >= 20.5);

        System.out.println('B' > 'A');
        System.out.println('a' < 'b');
        System.out.println('A' <= 'A');
        System.out.println('b' >= 'b');

        // System.out.println(true >= true); // bad operand types for binary operator '>='

        // System.out.println("Java" >= "Java"); // bad operand types for binary operator '>='

        // System.out.println(20 > 10 > 5); // bad operand types for binary operator '>'
    }
}
