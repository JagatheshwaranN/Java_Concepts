package java7andbelow.features.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_Regex_Intro {

    public static void main(String[] args) {

        /*
            Regular Expression
            ==================
            If we want to represents a group of strings according to a particular pattern
            then we should go for Regular Expression.

            Examples,
            1.	We can write regular expression to represent all valid mobile numbers.
            2.	We can write regular expression to represent all valid mail ids.

            The main important application areas of Regular Expression are as below,

            1.	To develop validation frameworks
            2.	To develop pattern matching applications (Ctrl+F in Windows) and Grep command
                in Unix.
            3.	To develop translators like Assemblers, Compilers and Interpreters.
            4.	To develop the digital circuits.
            5.	To develop communication protocols like TCP/IP and UDP, etc.
        */

        RegexDemo.demo();

        /*
            Pattern
            =======
            A Pattern object is a compiled version of Regular Expression i.e., it is a Java
            equivalent object of pattern. We can create a pattern object by using the compile()
            method of pattern class.

            public static Pattern compiles(String re)

            Example,
            Pattern pattern = Pattern.compile("ab");
        */

         /*
            Matcher
            =======
            We can use Matcher object to check the given pattern in the target string. We can
            create a matcher object by using matcher() of pattern class.

            public Matcher matcher(String target)

            Example,
            Matcher matcher = pattern.matcher("abbabbba");

            Important Methods of Matcher Class
            ==================================
            boolean find()
            ==============
            It attempts to find the next match and returns true if it's available.

            int start()
            ===========
            It returns the start index of the match.

            int end()
            =========
            It returns the end+1 index of the match.

            String group()
            ==============
            It returns the matched pattern.

            Pattern and Matcher classes present in the java.util.regex package and introduced
            in the java 1.4 version.
        */
    }
}


class RegexDemo {

    public static void demo(){
        int count = 0;
        Pattern pattern = Pattern.compile("ab");
        Matcher matcher = pattern.matcher("abbabbba");
        while(matcher.find()){
            ++count;
            System.out.println(matcher.start() + " ===== " + matcher.end() + " ===== " + matcher.group());
        }
        System.out.println("Total occurrence : " + count);
    }

}

