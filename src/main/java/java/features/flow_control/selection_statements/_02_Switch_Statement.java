package java.features.flow_control.selection_statements;

public class _02_Switch_Statement {

    public static void main(String[] args) {

        /*
            Switch
            ======
            1. If several options are available then it’s not recommended to use the nested if else statement.
               Because, it reduces the code readability. To handle this requirement, we should go for Switch
               statement.

            switch(x){
                case 1: Action 1;
                    break;
                ...
                default:
                    default action;
            }

            2. The allowed argument types for the switch statements are byte, short, char, and int until
               java 1.4 version. But from java 1.5 version onwards, corresponding wrapper classes (Byte, Short,
               Character and Integer) and enum types also allowed. From java 1.7 version onwards, String type
               also allowed.

            3. Curly braces are mandatory for Switch statements. Except Switch everywhere the curly braces are
               optional.

            4. Both the case statement and default statement are optional, i.e., the empty switch statement is
               a valid Java statement.

            5. Inside switch, every statement should be under some case or default statements, i.e.,
               independent statements are not allowed in the switch. Otherwise, we will get the compile
               time error.
        */

        int x1 = 10;
        switch (x1){
            // System.out.println("Switch Statement"); - case, default, or '}' expected
        }

        // Every case label should be compile time constant i.e., constant expression.
        int x2 = 10;
        int x3 = 20;
        switch (x2){
            case 10:
            // case x3: - constant expression required. If we declare the x2 as final,
                // then we won’t get any compile time error.
        }

        // Both switch argument and case label can be expressions. But case label should be constant
        // expression.
        int x4 = 10;
        switch (x4+1){
            case 11:
                System.out.println("11");
                break;

            case 10+20:
                System.out.println("30");
                break;
        }

        // Every case label should be in the range of switch argument type otherwise we will get compile
        // time error.
        byte b1 = 10;
        switch (b1){
            case 10:
                System.out.println("10");
                break;
          // case 130: - incompatible types: possible lossy conversion from int to byte
          //    System.out.println("20");
          //    break;
        }

        // Duplicate case labels are not allowed otherwise we will get the compile time error.
        int x5 = 97;
        switch(x5){
            case 97:
                System.out.println("97");
                break;
            // case 'a': - duplicate case label
            //    System.out.println("a");
            //    break;
        }

        /*
            Case label summary
            ==================
            1.	It should be constant expression.
            2.	The value should be in the range of switch argument type.
            3.	Duplicate case labels are not allowed.
        */
    }
}
