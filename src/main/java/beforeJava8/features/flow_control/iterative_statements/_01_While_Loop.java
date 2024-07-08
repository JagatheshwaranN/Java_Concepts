package beforeJava8.features.flow_control.iterative_statements;

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
        while (i < x){
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

        // If the variables are final then it's always same value, so compiler will check for its value.
        final int x3 = 10;
        final int x4 = 20;
        // while(x3 < x4){
        //    System.out.println("Condition true");
        // }
        // System.out.println("Out of while loop"); - unreachable statement

        // while(x3 > x4) {
            // System.out.println("Condition false"); - unreachable statement
        // }
        // System.out.println("Out of while loop");

        /*
            Points to Remember
            ==================
            1. Every final variable will be replaced by the value at the compile time only.

            2. If every argument is final variable (compile time constant) then that operation should
               be performed at the compile time only.
        */
        final int x5 = 10;
        final int x6 = 20;
        int x7 = 30;
        // System.out.println(x5); - After compilation, it will be 10
        // System.out.println(x7); - After compilation, it will be x7

        // System.out.println(x5+x6); - After compilation, it will be 30
        // System.out.println(x7+x5); - After compilation, it will be x7+10
        // System.out.println(x5<x6); - After compilation, it will be true
        // System.out.println(x5<x7); - After compilation, it will be 10<x7
    }
}
