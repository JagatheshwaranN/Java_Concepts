package java.features.language_fundamentals.literals;

public class _03_Boolean_Literals_Demo1 {

    public static void main(String[] args) {

        /*
            The only allowed values for Boolean data type are True / False.
        */

        boolean b1 = true;
        System.out.println(b1);
        boolean b2 = false;
        System.out.println(b2);
        // boolean b3 = 0; - incompatible types: int cannot be converted to boolean.
        // boolean b4 = True; - cannot find symbol.
        // boolean b5 = "False"; - incompatible types: java.lang.String cannot be converted to boolean.
    }
}
