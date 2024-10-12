package java.features.flow_control.transfer_statements;

public class _01_Break_Statement {

    public static void main(String[] args) {

        /*
            Transfer Statements
            ===================
            We have 2 types of transfer statements such as Break and Continue.
        */

        /*  Break
            =====
            We can use the break statement in the following places as below,
            1.	Inside switch - To stop fall through
            2.	Inside loop - To break loop execution based on some condition
            3.	Inside labelled block - To break labelled block execution based on some condition
        */
        int x = 1;
        switch(x){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Zero");
        }

        for(int i = 0; i < 3; i++){
            System.out.println(i);
            if (i == 1){
                break;
            }
        }

        labelledBlock:{
            System.out.println("Begin");
            if (x == 1){
                break labelledBlock;
            }
            System.out.println("End");
        }
    }
}
