package java7andbelow.features.flow_control.iterative_statements;

public class _02_Do_While_Loop {

    public static void main(String[] args) {

        /*
            Do While Loop
            =============
            1. If we want to execute the loop body at least once irrespective of the condition check,
            then we should go for do while loop.

            Syntax
            ======
            do{
                Action;
            }while(condition);

            2. Curly braces are optional for do while loop and without curly braces we can take only
            one statement and which should not be declarative statement.

            3. After while statement compulsory we have to add the ';'(semicolon) statement.
        */
        int x = 3;
        int i = 0;
        do{
            System.out.println("Hello");
            i++;
        }while(i < x);

        // Invalid Loop
        // do;
        // while (true);

        do{
            int x1 = 10;
            i++;
        }while(i < x);

        // do
        //    int x2 = 10; - variable declaration not allowed here
        // while(true);

        // Invalid Loop
        // do
        // while(true);

        // do while(true)
        //     System.out.println("Do While Loop");
        // while (false);

        // do
        //     while(true) {
        //        System.out.println("Do While Loop");
        //    }
        // while (false);
    }
}
