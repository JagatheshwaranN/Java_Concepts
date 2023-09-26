package java7andbelow.features.lang_package;

public class _08_String_Methods {

    public static void main(String[] args) {

        /*
            Important Methods of String Class
            =================================

            public char charAt (int index)
            ==============================
            Returns the character locating at the specified index.

            public String concat (String s)
            ===============================
            The overloaded + and += operators also meant for concatenation purpose only.

            public boolean equals (Object o)
            ================================
            To perform content comparison where case is important. This is overriding version
            of Object class equals method.

            public boolean equalsIgnoreCase (Object o)
            ==========================================
            To perform content comparison where case is not important.

            public String substring (int begin)
            ===================================
            Returns the sub string from the beginning index to the end of the string.

            public String substring (int begin, int end)
            ============================================
            Returns the sub string from the beginning index to the end-1 index.

            public int length()
            ===================
            Returns the number of chars present in the string.

            Note: Length variable applicable for Arrays but not for String whereas length() method
                  applicable for String but not for Arrays.

            public String replace (char oldCh, char newCh)
            ==============================================
            It is used to replace the given chars in the string with the new chars.

            public String toLowerCase()
            ===========================
            Returns the given string in lower case.

            public String toUpperCase()
            ===========================
            Returns the given string in upper case.

            public String trim()
            ====================
            To remove the blank spaces, present at the beginning and end of the string but
            not the middle blank spaces.

            public int indexOf(char ch)
            ===========================
            Returns index of the first occurrence of the specified character.

            public int lastIndexOf(char ch)
            ===============================
            Returns index of the last occurrence of the specified character.

        */

        // charAt
        String s1 = "Java";
        System.out.println(s1.charAt(2));

        // concat
        String s2 = "Java";
        String s3 = s2.concat(" Programming");
        String s4 = s2 + " programming";
        String s5 = s2 += " programming";
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        // equals
        System.out.println(s1.equals("Java"));
        System.out.println(s1.equals("JAVA"));

        // equalsIgnoreCase
        System.out.println(s1.equalsIgnoreCase("Java"));
        System.out.println(s1.equalsIgnoreCase("JAVA"));

        // substring
        String s6 = "ABCDEFGHIJ";
        System.out.println(s6.substring(2));
        System.out.println(s6.substring(2, 9));

        // length
        System.out.println(s6.length());

        // replace
        String s7 = "abab";
        System.out.println(s7.replace('a', 'c'));

        // lower-case
        String s8 = "LOWER";
        System.out.println(s8.toLowerCase());

        // upper-case
        String s9 = "upper";
        System.out.println(s9.toUpperCase());

        // trim
        String s10 = "   Java Programming    ";
        System.out.println(s10.trim());

        // index-of
        System.out.println(s7.indexOf('b'));

        // last index-of
        System.out.println(s7.lastIndexOf('a'));
    }
}
