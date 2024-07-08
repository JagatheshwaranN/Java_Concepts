package beforeJava8.features.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _04_Quantifiers {

    public static void main(String[] args) {

        /*
            Quantifiers
            ===========
            We can use quantifiers to specify the number of occurrences to match.
            a  => Exactly one 'a'
            a+ => At least one 'a'
            a* => Any number of a's including 0 number
            a? => At most one 'a'
        */
        QuantifiersDemo.demo();

    }
}

class QuantifiersDemo {

    static Pattern pattern;

    static Matcher matcher;

    public static void demo(){

        pattern = Pattern.compile("a");
        matcher = pattern.matcher("abbabbba");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("a+");
        matcher = pattern.matcher("abbabbba");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("a*");
        matcher = pattern.matcher("abbabbba");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("a?");
        matcher = pattern.matcher("abbabbba");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
    }

}
