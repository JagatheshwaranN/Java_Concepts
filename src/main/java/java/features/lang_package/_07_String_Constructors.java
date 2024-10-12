package java.features.lang_package;

public class _07_String_Constructors {

    public static void main(String[] args) {

        /*
            Constructors of String Class
            ============================
            String s = new String ();
            Create an empty string object.

            String s = new String (String literal);
            Create a string object on the heap area for the given string literal.

            String s = new String (StringBuffer sb);
            Create an equivalent string object for the given StringBuffer.

            String s = new String (char[] ch);
            Create an equivalent string object for the given char array.

            String s = new String (byte[] b);
            Create an equivalent string object for the given byte array.
        */

        String s1 = new String();
        String s2 = new String("java");
        String s3 = new String(new StringBuffer("program"));
        char[] ch = {'a' , 'b'};
        String s4 = new String (ch);
        byte[] b = {100, 101};
        String s5 = new String (b);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
    }
}
