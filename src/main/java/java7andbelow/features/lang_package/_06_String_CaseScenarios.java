package java7andbelow.features.lang_package;

public class _06_String_CaseScenarios {

    public static void main(String[] args) {

        /*
            Case 1: Mutability
            ==================
            String s1 = new String("Java");
            s1.concat("Programming");
            SOP(s1); // Java

            Once we create a String object, we can't perform any changes in the existing object.
            If we are trying to perform any change with those changes any new object will be created.
            This non-changeable behavior is called as immutability of the String.

            StringBuffer s1 = new StringBuffer("Java");
            s1.append(" Programming");
            SOP(s1); // Java Programming

            Once we create a StringBuffer object, we can perform any change in the existing object.
            This changeable behavior is called as mutability of the StringBuffer.
        */

        String s1 = new String("Java");
        s1.concat("Programming");
        System.out.println(s1);

        String s2 = new String("Java");
        s2 = s2.concat(" Programming");
        System.out.println(s2);

        StringBuffer sb1 = new StringBuffer("Java");
        sb1.append(" Programming");
        System.out.println(sb1);

    }
}
