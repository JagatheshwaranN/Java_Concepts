package beforeJava8.features.language_fundamentals.primitive_datatypes;

public class _07_Boolean_Demo1 {

    public static void main(String[] args) {

        /*
            Boolean - The size is not applicable, but its Virtual Machine dependent.

            Boolean - The range is not applicable, but the allowed values are True and False.
        */

        Boolean b1 = true;
        System.out.print(b1);
        // Boolean b2 = 0; - incompatible types: int cannot be converted to java.lang.Boolean
        // Boolean b3 = 1.0; - incompatible types: double cannot be converted to java.lang.Boolean
        // Boolean b4 = "java"; - incompatible types: java.lang.String cannot be converted to java.lang.Boolean
        // Boolean b5 = False; - cannot find symbol
    }
}
