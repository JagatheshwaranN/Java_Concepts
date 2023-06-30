package java7andbelow.features.flow_control.transfer_statements;

public class _02_Continue_Statement {

    public static void main(String[] args) {

        /*
            Continue
            ========
            1. We can use the Continue statement inside the loops to skip the current iteration and
               continue for the next iteration.

            2. We can use the Continue statement only inside the loops. If we try to use it anywhere
               else then we will get the compile time error.
        */

        for( int i = 0; i < 5; i++){
            if (i == 2)
                continue;
            System.out.print(i+" ");
        }

        // int x = 10;
        // if(x == 10)
            // continue; - continue outside of loop

    }
}
