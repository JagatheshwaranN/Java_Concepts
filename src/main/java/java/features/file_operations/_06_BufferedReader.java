package java.features.file_operations;

import java.io.*;

public class _06_BufferedReader {

    public static void main(String[] args) {

        /*
            BufferedReader
            ==============
            We can use BufferedReader to read the character data from the file.

            The main advantage of BufferedReader when compared with FileReader is we can read
            the data line by line in addition to character by character.

            BufferedReader Constructors
            ===========================
            BufferedReader br = new BufferedReader(Reader r);
            BufferedReader br = new BufferedReader(Reader r, int bufferSize);

            Note: BufferedReader can't communicate directly with the file, and it can
                  communicate via some reader object.
        */

        /*
           Important Methods Present in BufferedReader
           ===========================================
           int read()
           ==========
           It attempts to read next character from the file and returns its Unicode value.
           If the next character is not available then this method returns -1. As this
           method returns Unicode code value (int value), at the time of printing we have
           to perform the type casting.

           int read(char[] ch)
           ===================
           It attempts to read enough character from the file into char array and returns
           the number of characters copied from the file.

           void close()
           ============
           To close the BufferedReader object after the completion of reading the data from
           the file.

           String readLine()
           =================
           It attempts to read the next line from the file and returns it. If the next line
           is not available then this method returns null.
        */
        BufferedReaderDemo1.readDataDemo1();
        BufferedReaderDemo2.readDataDemo2();
        BufferedReaderDemo3.readDataDemo3();

        /*
            Note:
            =====
            1. Whenever we are closing BufferedReader automatically internal FileReader will be
               closed, and we don't need to close the FileReader explicitly.
            2. The most enhanced reader to read character data from the file is BufferedReader.
        */
    }
}

class BufferedReaderDemo1 {

    public static void readDataDemo1(){

        try (BufferedReader reader = new BufferedReader(
                new FileReader("buffered_write.txt"))) {
            int x = reader.read();
            while( x != -1){
                System.out.print((char) x);
                x = reader.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class BufferedReaderDemo2 {

    public static void readDataDemo2(){
        File file = new File("buffered_write.txt");
        char[] fileData = new char[(int) file.length()];
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int x = reader.read(fileData);
            while( x != -1){
                System.out.print(fileData);
                x = reader.read(fileData);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

class BufferedReaderDemo3 {

    public static void readDataDemo3(){
        File file = new File("buffered_write.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line = reader.readLine();
            while( line != null){
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}