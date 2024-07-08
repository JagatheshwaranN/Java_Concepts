package beforeJava8.features.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_PredefinedCharacterClass {

    public static void main(String[] args) {

        /*
            Predefined Character Classes
            ============================
            \s => Space character
            \S => Except space character
            \d => Any digit from 0 to 9
            \D => Except digit, any character
            \w => Any word character
            \W => Except word character, special character
            . => Any character
        */
        RegexPreDefinedCharClassDemo.demo();
    }

}

class RegexPreDefinedCharClassDemo {
    static Pattern pattern;

    static Matcher matcher;

    public static void demo(){

        pattern = Pattern.compile("\\s");
        matcher = pattern.matcher("a3B# k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("\\S");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("\\d");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("\\D");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("\\w");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("\\W");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile(".");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
    }

}

