package java7andbelow.features.flow_control.iterative_statements;

public class _01_While_Loop {

    public static void main(String[] args) {

        /*
            While Loop
            ==========
            1. If we don’t know the number of iterations in advance, then we should go for while loop.
               Syntax
               ======
               While(condition){
               action;
               }

            2. The argument should be boolean type, if we are trying to provide any other type, then we
               will get the compile time error.

            3. Curly braces are optional and without curly braces we can take only one statement under
               while which should not be declarative statement.
        */
        int x = 3;
        int i = 1;
        while (i < 3){
            System.out.println(i);
            i++;
        }

        // while(x){ - incompatible types: int cannot be converted to boolean
        // System.out.println("x");
        // }

        // while(i < 4)
        //    System.out.println("condition true");

        // while(true)
            // int x = 10; - variable declaration not allowed here

        while(true) {
            int y = 10;
            break;
        }

        // while(true){
        //    System.out.println("condition true");
        // }
        // System.out.println("Out of while loop"); - unreachable statement

        // Since the below are normal variables and it always not same value, so compiler will not
        // check for its value.
        int x1 = 10, x2 = 20;
        // while (x1 < x2){
        //    System.out.println("condition true");
        // }

        while (x1 > x2){
            System.out.println("condition true");
        }
        System.out.println("out of while loop");
    }
}
