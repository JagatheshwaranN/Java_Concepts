package java.features.file_operations;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class _07_PrintWriter {

    public static void main(String[] args) {

        /*
            PrintWriter
            ===========
            It is the most enhanced writer to write the character data to the file. The main
            advantage of the PrintWriter over FileWriter and BufferedWriter is, we can write
            any type of primitive data directly to the file.

            PrintWriter Constructors
            ========================
            PrintWriter pw = new PrintWriter(String filename);
            PrintWriter pw = new PrintWriter(File f);
            PrintWriter pw = new PrintWriter(Writer w);

            Note:
            =====
            PrintWriter can communicate directly with the file and also can communicate via
            some writer object as well.
        */

        /*
            Import Methods Present in PrintWriter
            =====================================
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
            To give the guarantee that total data including last character will be returned to
            the file.

            close()
            =======
            To close the FileWriter object after completion of writing the data to the file.

            print(char ch)
            ==============
            To write a character data to the file.

            print(int i)
            ============
            To write an integer value to the file.

            print(boolean b)
            ================
            To write a boolean value to the file.

            print(double d)
            ===============
            To write a double value to the file.

            print(String s)
            ===============
            To write a String value to the file.

            println(char ch)
            ================
            To write a character data to the file and add new line.

            println(int i)
            ==============
            To write an integer value to the file and add new line.

            println(boolean b)
            ==================
            To write a boolean value to the file and add new line.

            println(double d)
            =================
            To write a double value to the file and add new line.

            println(String s)
            =================
            To write a String value to the file and add new line.
        */
        PrintWriterDemo.writerDemo();

        /*
            Points to Remember
            ==================
            1. The most enhanced Writer to write the character data to the file is PrintWriter
               whereas the most enhanced Reader to read the character data from the file is
               BufferedReader.

            2. In General, we can use the Readers and Writers to handle the character data
               (text data) whereas we can use Streams to handle the Binary data (Images, PDFs,
               Videos and Audios). We can use the OutputStream to write the binary data to the
               file and InputStream to read the binary data from the file.
        */

        /*
            Reader and Writer Hierarchy
            ===========================
            Object
            Writer (Abstract Class)
            =======================
            1.	BufferedWriter
            2.	PrintWriter
            3.	OutputStreamWriter
                1.	FileWriter

            Reader (Abstract Class)
            =======================
            1.	BufferedReader
            2.	InputStreamReader
                1.	FileReader
        */
    }
}

class PrintWriterDemo {

    public static void writerDemo(){

        try (FileWriter fileWriter = new FileWriter("print_write.txt")){
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.write(97);
            printWriter.write("pple");
            printWriter.println();
            char[] ch = {'b', 'a', 'n', 'a', 'n', 'a'};
            printWriter.write(ch);
            printWriter.println();
            printWriter.print("orange");
            printWriter.println();
            printWriter.println(100);
            printWriter.println(1000L);
            printWriter.println(100.0F);
            printWriter.println(1000.0);
            printWriter.println('A');
            printWriter.println(true);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}