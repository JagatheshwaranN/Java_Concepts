package java.features.operators_assignments.boolean_complement_operator;

public class _01_Boolean_Complement_Operator {

    public static void main(String[] args) {

        /*
            Boolean Complement Operator (!)
            ===============================
            We can apply this operator only for boolean types but not for integral types.

            &,|,^ => Applicable for both Integral and Boolean types
            ~ => Applicable only for Integral type
            ! => Applicable only for Boolean type
        */
        System.out.println(!false);
        // System.out.println(!4); // bad operand type int for unary operator '!'
    }
}
