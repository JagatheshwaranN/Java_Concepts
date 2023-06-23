package java7andbelow.features.flow_control.selection_statements;

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
            System.out.println("condition false");
        }

        boolean b1 = false;
        if(b1 = false){
            System.out.println("Condition true");
        }else{
            System.out.println("condition false");
        }

        if(b1 == false){
            System.out.println("Condition true");
        }else{
            System.out.println("condition false");
        }

        /*
            Else part and curly braces are optional. Without curly braces, only one statement is allowed
            under if and which should not be declarative statements.
        */

    }
}
