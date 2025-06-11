package com.files;

import java.util.StringTokenizer;

public class Tokenizer {

    public static void main(String[] args) {
        String quote = "Never, Give, Up!";
        StringTokenizer tokens = new StringTokenizer(quote, ",", false);
        while(tokens.hasMoreTokens()) {
            System.out.println(tokens.nextToken());
        }
    }

}
