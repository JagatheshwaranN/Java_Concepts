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
            The overloaded + and += operators are also meant for concatenation purpose only.

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
            not at the middle of the string.

            public int indexOf(char ch)
            ===========================
            Returns index of the first occurrence of the specified character.

            public int lastIndexOf(char ch)
            ===============================
            Returns index of the last occurrence of the specified character.
        */

        /*
            Important Note
            ==============
            Because of the runtime operation if there is a change in the content then with
            those changes a new object will be created on the heap area. If there is no change
            in the content then existing object will be reused and new object won't be created.
            Whether the object present in heap / SCP, the rule is same.

            String s1 = new String (“java”);
            String s2 = s1.toUpperCase();
            String s3 = s1.toLowerCase();
            SOP (s1 == S2); // false
            SOP (s1 == S3); // true
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

        // Object Creation
        String s11 = new String("java");
        String s12 = s11.toUpperCase();
        String s13 = s11.toLowerCase();
        System.out.println(s11);
        System.out.println(s12);
        System.out.println(s13);
        System.out.println(s11 == s12);
        System.out.println(s11 == s13);
        System.out.println("********************");
        String s14 = "java";
        String s15 = s14;
        String s16 = s14.toString();
        System.out.println(s14 == s15);
        System.out.println(s14 == s16);
        String s17 = s14.toLowerCase(); // No new object will be created
        String s18 = s14.toUpperCase(); // New object will be created
        String s19 = s18.toLowerCase(); // New object will be created
        System.out.println(s17);
        System.out.println(s18);
        System.out.println(s19);


    }
}
