package java7andbelow.features.operators_assignments.other_operators;

public class _01_Conditional_New_Array_Operators {

    public static void main(String[] args) {

        /*
            Conditional Operator (?:)
            =========================
            1. The only possible ternary operator in Java is Conditional operator.

            2. We can perform the nesting of the conditional operator as well.
        */
        int i1 = (10 < 20) ? 30: 40;
        System.out.println(i1);

        int i2 = (10 > 20) ? 30 : ((40 > 50) ? 60 : 70);
        System.out.println(i2);

        /*
            New Operator
            ============
            1. We can use the new operator to create the object.

            2. Note: After creating an object, the constructor will be executed to perform the
               initialization of the object. Hence, the constructor is not for creation of the
               object, and it is only for initialization of the object.
        */
        _01_Conditional_New_Array_Operators object = new _01_Conditional_New_Array_Operators();

        /*
            [] Operator
            ===========
            1. We can use this operator to declare and create the arrays.
        */
        int[] i3 = new int[10];
    }
}
