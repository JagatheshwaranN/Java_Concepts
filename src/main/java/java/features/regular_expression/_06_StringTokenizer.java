package java.features.regular_expression;

import java.util.StringTokenizer;

public class _06_StringTokenizer {

    public static void main(String[] args) {

        /*
            String Tokenizer
            ================
            It is a specially designed class for Tokenization activity. String Tokenizer present
            in the java.util package.

            Note: The default regular expression for StringTokenizer is space.
        */
        StringTokenizerDemo.demo();
    }
}

class StringTokenizerDemo {

    static StringTokenizer stringTokenizer;
    public static void demo(){
        stringTokenizer = new StringTokenizer("Java Program");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }

        stringTokenizer = new StringTokenizer("www.google.com", ".");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
    }

}
