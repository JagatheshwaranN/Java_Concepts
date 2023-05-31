package java7andbelow.features.language_fundamentals.literals;

public class _04_Char_Literals_Demo1 {

    public static void main(String[] args) {

        /*
            We can specify Char literal as single literal within single quotes.
        */

        char c1 = 'a';
        System.out.println(c1);
        // char c2 = b; - cannot find symbol.
        // char c3 = "c"; - incompatible types: java.lang.String cannot be converted to char.
        // char c4 = 'de'; - unclosed character literal.

        /*
        We can specify Char literal as Integral literal which represents the Unicode value of the character.

        The Integral literal can be specified in decimal, octal, hexadecimal forms and allowed range is 65535.
        */

        char c5 = 97;
        System.out.println(c5);
        char c6 = 0xabc;
        System.out.println(c6);
        char c7 = 0777;
        System.out.println(c7);
        char c8 = 65535;
        System.out.println(c8);
        // char c9 = 65536; - incompatible types: possible lossy conversion from int to char.

        /*
            We can represent the Char literal in Unicode representation which is nothing but '\u0061'.

            xxxx => 4-digit hexadecimal number.
        */
        char c10 = '\u0061';
        System.out.println(c10); // (97)->16 => 61. The hexadecimal of 97 is 61. We need to take the LCM.

        // Every escape character is a valid Char Literal.
        char c11 = '\n';
        System.out.println(c11);
        char c12 = '\t';
        System.out.println(c12);
        // char c13 = '\m'; - illegal escape character

        /*
            Any sequence of characters within double quote is treated as String Literal.
        */
        String s1 = "java";
        System.out.println(s1);
    }
}
