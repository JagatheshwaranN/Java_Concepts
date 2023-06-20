package java7andbelow.features.operators_assignments.short_circuit_operator;

public class _01_Short_Circuit_Operator {

    public static void main(String[] args) {

        /*
            Short Circuit Operator (&&, ||)
            ===============================
            These are exactly same as bitwise operators ( &, |).

            && , ||
            =======
            1. Second argument evaluation is optional
            2. Relatively performance is High.
            3. Applicable only for Boolean data types.

            &, |
            ====
            1. Both arguments should be evaluated.
            2. Relatively performance is Low.
            3. Applicable for both Integral and Boolean data types.

            Note:
            =====
            1. X && Y -> Y will be evaluated if only X is True.
            2. X || Y -> Y will be evaluated only if X is False.
        */
        int x = 10, y = 15;
        if(++x < 10 & ++y < 15){
            x++;
        }else{
            y++;
        }
        System.out.println(x);
        System.out.println(y);

        if(++x < 10 && (x/0 > 10)){
            System.out.println("Hai");
        }
        else {
            System.out.println("Hello");
        }
    }
}
