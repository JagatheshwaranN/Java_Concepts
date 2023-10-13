package java7andbelow.features.file_operations;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class _05_BufferedWriter {

    public static void main(String[] args) {

        /*
            Limitations of FileWriter and FileReader
            ========================================
            By using the FileReader, we can read the data char by char which is not convenient
            to the programmer.

            Usage of FileWriter and FileReader is not recommended because,

            1.	While writing data by FileWriter we have to insert line separator (\n) manually
                which is varied from system to system and difficult to Programmer.

            2.	By using FileReader we can read data character by character, which is not convenient
                to the Programmer.

            3.	To overcome these problems, we should go for BufferedWriter and BufferedReader.
        */

        /*
            BufferedWriter
            ==============
            We can use BufferedWriter to write the char data to the file.

            BufferedWriter Constructors
            ===========================
            BufferedWriter bw = new BufferedWriter(Writer w);
            BufferedWriter bw = new BufferedWriter(Writer w, int bufferSize);

            Note:
            =====
            BufferedWriter can't communicate directly with the file. It can communicate via
            some writer object.

            Which of the following are valid?
            =================================
            BufferedWriter bw = new BufferedWriter("abc.txt"); - Not valid
            BufferedWriter bw = new BufferedWriter(new File("abc.txt")); - Not valid
            BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
            BufferedWriter bw = new BufferedWriter(new BufferedWriter(new FileWriter("abc.txt")));
        */

        /*
            Important Methods Present in BufferedWriter
            ===========================================
            write(int ch)
            =============
            To write a single character to the file.

            write(char[] ch)
            ================
            To write an array of character to the file.

            write(String ch)
            ================
            To write a string to the file.

            flush()
            =======
            To give the guarantee that total data including last character will be returned
            to the file.

            close()
            =======
            To close the FileWriter object after completion of writing the data to the file.

            newline()
            =========
            To insert a line separator.
        */
        BufferedWriterDemo.bufferedWriter();
    }
}

class BufferedWriterDemo {

    public static void bufferedWriter(){

        try (FileWriter fileWriter = new FileWriter("buffered_write.txt")){
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(97);
            bufferedWriter.write("pple");
            bufferedWriter.newLine();

            bufferedWriter.write("orange");
            bufferedWriter.newLine();

            char[] ch = {'b','a','n','a','n','a'};
            bufferedWriter.write(ch);
            bufferedWriter.newLine();

            bufferedWriter.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
