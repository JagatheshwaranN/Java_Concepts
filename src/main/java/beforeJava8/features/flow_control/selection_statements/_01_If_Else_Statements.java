package beforeJava8.features.flow_control.selection_statements;

public class _01_If_Else_Statements {

    public static void main(String[] args) {

        /*
            Syntax
            ======
            if(condition){
            condition true;
            }else{
            condition false;
            }

            The argument to the if statement is boolean type. By mistake, if we are trying to provide
            any other type, then we will get the compile time error.
        */
        int x1 = 10;
        // if(x1){ // incompatible types: int cannot be converted to boolean
        //    System.out.println("hello");
        //}

        //if(x1 = 10) // incompatible types: int cannot be converted to boolean

        if(x1 == 20){
            System.out.println("Condition true");
        }else{
            System.out.println("Condition false");
        }

        boolean b1 = false;
        if(b1 = false){
            System.out.println("Condition true");
        }else{
            System.out.println("Condition false");
        }

        if(b1 == false){
            System.out.println("Condition true");
        }else{
            System.out.println("Condition false");
        }

        /*
            Else part and curly braces are optional. Without curly braces, only one statement is allowed
            under if and which should not be declarative statements.

            if(true)
                int x2 = 10; // variable declaration not allowed here
        */

        // Semicolon is a valid Java statement which is also known as empty statement.
        if(true);

        // There is no dangling else problem in Java and every else is mapped to the nearest if statement.
        if(true)
            if(true)
                System.out.println("Condition true");
        else{
                System.out.println("Condition false");
            }
    }
}
