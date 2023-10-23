package java7andbelow.features.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_CharacterClass {

    public static void main(String[] args) {

        /*
            Character Classes
            =================
            [abc]        => Either a or b or c
            [^abc]       => Expect a or b or c
            [a-z]        => Any lowercase alphabet symbol from a to z
            [A-Z]        => Any uppercase alphabet symbol from A to Z
            [a-zA-Z]     => Any alphabet symbol
            [0-9]        => Any digit from 0 to 9
            [0-9a-zA-Z]  => Any alphanumeric symbols
            [^0-9a-zA-Z] => Except alphanumeric symbols
        */
        RegexCharClassDemo.demo();
    }

}

class RegexCharClassDemo {
    static Pattern pattern;

    static Matcher matcher;

    public static void demo(){

        pattern = Pattern.compile("[abc]");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("[^abc]");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("[a-z]");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("[A-Z]");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("[a-zA-Z]");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("[0-9]");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("[0-9a-zA-Z]");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
        pattern = Pattern.compile("[^0-9a-zA-Z]");
        matcher = pattern.matcher("a3B#k@9Z");
        while (matcher.find()){
            System.out.println(matcher.start() + " ===== " + matcher.group());
        }
        System.out.println("===============================================");
    }

}

