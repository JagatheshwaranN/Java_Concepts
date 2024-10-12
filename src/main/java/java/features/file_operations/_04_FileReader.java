package java.features.file_operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class _04_FileReader {

    public static void main(String[] args) {

        /*
            FileReader
            ==========
            We can use FileReader to read the character data from the file.

            FileReader Constructors
            =======================
            FileReader fr = new FileReader(String filename);
            FileReader fr = new FileReader(File f);
        */

        /*
            Important Methods Present in FileReader
            =======================================
            int read()
            ==========
            It attempts to read next character from the file and returns its Unicode value.
            If the next character is not available then this method returns -1. As this method
            returns Unicode code value (int value), at the time of printing we have to perform
            the type casting.

            int read(char[] ch)
            ====================
            It attempts to read enough character from the file into char array and returns the
            number of characters copied from the file.

            void close()
            ============
            To close the FileReader object after the completion of reading the data from the file.
        */
        FileReaderDemo1.readFileCharDemo();
        FileReaderDemo2.readFileCharArrDemo();
    }
}

class FileReaderDemo1 {

    public static void readFileCharDemo(){
        try (FileReader fileReader = new FileReader("file_write.txt")){
            int x = fileReader.read();
            while(x != -1){
                System.out.print((char) x);
                x = fileReader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class FileReaderDemo2 {

    public static void readFileCharArrDemo(){
        File file = new File("file_write.txt");
        char[] fileData = new char[(int)file.length()];
        try (FileReader fileReader = new FileReader(file)){
            int x = fileReader.read(fileData);
            while(x != -1) {
                System.out.print(fileData);
                x = fileReader.read(fileData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}