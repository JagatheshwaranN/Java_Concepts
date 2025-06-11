package com.files;

import java.io.*;

public class ReaderWriter {

    public static void main(String[] args) {
        FileReader fis = null;
        FileWriter fos = null;
        try {
            fis = new FileReader("src/test/java/com/files/folder/copy.txt");
            fos = new FileWriter("src/test/java/com/files/folder/write.txt");
            int data;
            System.out.println("File Opened.");
            while((data = fis.read()) != -1) {
                fos.write(data);
            }
            System.out.println("File Written.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(fis != null) {
                    fis.close();
                }
                if(fos != null) {
                    fos.close();
                }
                System.out.println("Files Closed.");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
