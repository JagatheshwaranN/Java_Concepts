package com.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

    public static void main(String[] args) {

        try(FileReader fr = new FileReader("src/test/java/com/files/folder/write.txt");
            BufferedReader br = new BufferedReader(fr);) {
            String line;
            int count  = 0;
            while((line = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(line);
                while(tokenizer.hasMoreTokens()){
                    System.out.println(tokenizer.nextToken());
                    count++;
                }
            }
            System.out.println(STR."Number of words in the file are : \{count}");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
