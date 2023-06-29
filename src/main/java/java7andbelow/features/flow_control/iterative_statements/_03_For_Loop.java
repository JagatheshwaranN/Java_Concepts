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

        /*
            For Each Loop (Enhanced For Loop - 1.5v)
            ========================================
            Introduced in java 1.5 version, it is a specially designed loop to retrieve the elements of
            arrays and collections.
        */

        // Traditional For Loop
        int[] x1 = {1, 2, 3};
        for(int i = 0; i < x1.length; i++){
            System.out.println(x1[i]);
        }

        // Enhanced For Loop
        for(int x : x1){
            System.out.println(x);
        }

        // 2D Array Iteration using Enhanced For Loop
        int[][] x2 = {{1, 2}, {3, 4}};
        for(int[] x : x2){
            for(int i : x){
                System.out.println(i);
            }
        }

        /*
        Limitations of For Each Loop
        ============================
        1. For Each Loop is the best choice to retrieve the elements of arrays and collections but its
           limitation is, its applicable only for arrays and collections. And, it's not a
           general-purpose loop.

        2. By using the normal for loop, we can print the array elements either in original order or
           in reverse order but using for each loop we can print the array elements only in original
           order.
        */

        // We can't the enhanced for loop for the below traditional loop.
        for(int i = 0; i < 1; i++){
            System.out.println("for loop");
        }

        // We can't the enhanced for loop for the below traditional loop.
        int[] x3 = {1, 2, 3};
        for(int i = x3.length-1; i>=0; i--){
            System.out.println(x3[i]);
        }

        /*
            Iterable Interface
            ==================
            The target element in for each loop should be Iterable object. An object is said to be Iterable if
            and only if corresponding class implements java.lang.iterable interface. Iterable Interface
            introduced in java 1.5 version, and it contains only one method iterator () and its return
            type is Iterator. All array related classes and collection implemented classes already
            implement Iterable interface.Being a programmer, we are not require to do anything just we
            should be aware of the concept.

            Iterable (Interface)
            ====================
            1. It is related to For Each Loop
            2. The target element in for each loop should be Iterable
            3. Present in java.lang package
            4. It contains 1 method - iterator()
        */
    }
}
