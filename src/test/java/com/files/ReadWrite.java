package com.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadWrite {

    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("src/test/java/com/files/folder/copy.jpg");
            fos = new FileOutputStream("src/test/java/com/files/folder/write.jpg");
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
