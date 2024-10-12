package java.features.operators_assignments.operator_order;

public class _01_Operator_Order_Precedence {

    public static void main(String[] args) {

        /*
            Operator Precedence
            ===================
            1.	Unary operator
                [], x++, x--
                ++x, --x, ~, !
                new, <type>

            2.	Arithmetic operator
                *, /, %
                +, -

            3.	Shift operator
                >>, >>>, <<

            4.	Comparison operator
                <, <=, >, >=, instanceof

            5.	Equality operator
                ==, !=

            6.	Bitwise operator
                &, ^, |

            7.	Short circuit operator
                &&, ||

            8.	Conditional operator
                ?:

            9.	Assignment operator
                =, +=, -=, *=
        */

        /*
            Evaluation Order of Operands
            ============================
            In Java, we have only operator precedence but not operand precedence. Before applying any operator,
            all operands will be evaluated from LEFT to RIGHT.
        */

        System.out.println(method(1)+method(2)*method(3)/method(4)+method(5)*method(6));
    }

    private static int method(int i){
        return i;
    }
}
