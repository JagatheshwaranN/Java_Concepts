package java7andbelow.features.flow_control.iterative_statements;

public class _03_For_Loop {

    public static void main(String[] args) {

        /*
            For Loop
            ========
            1. For loop is the most commonly used loop in Java. If we know number of iterations in advance,
               then for loop is the best choice.

            Syntax
            ======
            for(initialization; conditional; increment / decrement)
            {
            Action;
            }

            2. Curly braces are optional in For loop and without curly braces we can take only one statement
               and which should not be declarative statement.

            3. The initialization section will be executed only once in loop life cycle. We can declare and
               initialize the local variables of for loop. We can declare any number of variables and should
               be of same type. By mistake, if you are trying to declare different data type variable, then
               you will get compile time error.
        */

        for(int i = 0; i < 2; i++){
            System.out.println("For loop");
        }

        for(int i = 0; i < 2; i++)
            System.out.println("Welcome to For loop");

        // for(int i = 0; i < 2; i++)
        //    int x = 10; - variable declaration not allowed here

        // for(int i = 0, String s = "loop"; i < 2; i++); - ';' expected

        // for(int i = 0, int j = 0; i < 2; i++); - ';' expected

        for(int i = 0, j = 0; i < 2; i++)
            System.out.println("Condition True");

        // In the initialization section, we can take any valid Java statement including Sys-out.
        int i1 = 0;
        for (System.out.println("Hello"); i1 < 1; i1++){
            System.out.println("Hai");
        }

        // In conditional section, we can take any value but should be of type boolean.
        // This part is optional and if we are not taking anything then compiler will always assign true.
        // for (System.out.println("Hello"); ; i1++){
        //    System.out.println("Hai"); - This statement will execute infinite times
        // }

        // In increment/decrement section, we can take any valid Java statement including Sys-out
        // statement.
        int i2 = 0;
        for(System.out.println("Hello"); i2 < 2; System.out.println("Hai")){
            i2++;
        }

        // All three parts of the for loop are independent of each other and optional.
        // for(; ;){
        //    System.out.println("For loop without condition"); - This statement will execute infinite times
        // }

        // for(; ;); - Infinite Loop

        // for(int i3 = 0; true ; i3++){
        //    System.out.println("Hello");
        // }
        // System.out.println("Hi"); - unreachable statement
    }
}
