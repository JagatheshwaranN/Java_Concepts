package beforeJava8.features.regular_expression;

import java.util.Arrays;
import java.util.regex.Pattern;

public class _05_PatternSplit_StringSplit {

    public static void main(String[] args) {

        /*
            Pattern Class Split
            ===================
            We can use pattern class split method to split the target string according
            to a particular pattern.
        */
        PatternSplit.demo();

        /*
            String Class Split
            ==================
            String class also contains split() method to split the target string according
            to a particular pattern.
        */
        StringSplit.demo();

        /*
            Note:
            =====
            Pattern class split method can take target string as argument whereas String class
            split method can take pattern as argument.
        */
    }

}

class PatternSplit {

    static Pattern pattern;

    public static void demo(){
        pattern = Pattern.compile("\\s");
        String[] strArr1 = pattern.split("Java Programming Language");
        System.out.println(Arrays.toString(strArr1));
        System.out.println("=============================================");
        pattern = Pattern.compile("[.]");
        String[] strArr2 = pattern.split("www.google.com");
        System.out.println(Arrays.toString(strArr2));
        System.out.println("=============================================");
    }

}

class StringSplit {

    public static void demo(){
        String s1 = "Java Programming Language";
        String[] strArr1 = s1.split("\\s");
        System.out.println(Arrays.toString(strArr1));
        System.out.println("=============================================");
        String s2 = "www.google.com";
        String[] strArr2 = s2.split("\\.");
        System.out.println(Arrays.toString(strArr2));
        System.out.println("=============================================");
    }

}