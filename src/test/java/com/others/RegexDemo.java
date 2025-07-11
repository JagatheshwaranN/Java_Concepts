package com.others;

import java.io.File;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {

    public static void main(String[] args) {
        simple();
        someMore();
        checkFiles();
    }

    static void simple() {
        Pattern pattern = Pattern.compile("abc");
        Matcher matcher = pattern.matcher("abcdefgabchijkabc");
        while (matcher.find()) {
            System.out.println(matcher.start());
            System.out.println(matcher.end());
            System.out.println(matcher.group());
        }
    }

    static void someMore() {
        System.out.println(Pattern.matches("[abc]", "a"));
        System.out.println(Pattern.matches("[abc]", "ab"));
        System.out.println(Pattern.matches("[abc]?", "a"));
        System.out.println(Pattern.matches("[abc]+", "abc"));
        System.out.println(Pattern.matches("[abc]*", "abcabc"));
        System.out.println("************");
        System.out.println(Pattern.matches("\\d", "1"));
        System.out.println(Pattern.matches("\\D", "1"));
        System.out.println(Pattern.matches("\\s", " "));
        System.out.println(Pattern.matches("[a-zA-z0-9]{5}", "abC12"));
        System.out.println(Pattern.matches("[a-zA-z0-9]{5}", "abC1"));
        System.out.println(Pattern.matches("[a-zA-z0-9]*", "abcdeABCDE1234512345"));

        Pattern pattern = Pattern.compile("^[a-zA-Z0-9_.-]+@[a-zA-Z0-9_.-]+$");
        Matcher matcher = pattern.matcher("test@gmail.com");
        if (matcher.matches()) {
            System.out.println("Valid email ID");
        } else {
            System.out.println("Invalid email ID");
        }
    }

    static void checkFiles() {
        File folder = new File("src/test/java/com/files/folder/");
        String[] fileNames = folder.list();
        Pattern pattern = Pattern.compile("[a-zA-Z0-9]+[.]txt");
        int count = 0;
        assert fileNames != null;
        for (String fileName : fileNames) {
            Matcher matcher = pattern.matcher(fileName);
            if (matcher.matches()) {
                System.out.println(fileName);
                count++;
            }
        }
        System.out.println("Number of files: " + count);
    }

}
