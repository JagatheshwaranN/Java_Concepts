package java7andbelow.features.file_operations;

import java.io.FileWriter;
import java.io.IOException;

public class _03_File_Writer {

    public static void main(String[] args) {

        /*
            FileWriter
            ==========
            We can use FileWriter to write character data to the file.

            FileWriter Constructors
            =======================
            FileWriter fw = new FileWriter(String filename);

            FileWriter fw = new FileWriter(File f);

            The above File Writers are meant for overriding of existing data. Instead of overriding,
            if we want to perform append operation then we have to create FileWriter by using the
            following constructors,

            FileWriter fw = new FileWriter(String filename, boolean append);

            FileWriter fw = new FileWriter(File f, boolean append);

            Note: If the specified file is not already available then all the above constructors
                  will create the file.
        */

        /*
            Important Methods Present in FileWriter
            =======================================
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
        */

        /*
            In the below program, FileWriter can perform overriding of existing data. Instead of
            overriding, if we want to perform append operation then we have to create FileWriter
            object as follows,

            FileWriter fw = new FileWriter ("file_write.txt", true);
        */
        FileWriterDemo.writerDemo();

        FileWriterDemo.writerAppendDemo();
        /*
            Points to Remember
            ==================
            The main problem with the FileWriter is, we have to insert line separator (\n) manually
            and which is varied from system to system. It's difficulty to the Programmer, we can
            solve this problem using BufferedWriter and PrintWriter classes.
        */
    }

}

class FileWriterDemo {

    public static void writerDemo(){

        try(FileWriter fileWriter = new FileWriter("file_write.txt")){

            fileWriter.write(97);

            fileWriter.write("pple\nbanana");
            fileWriter.write("\n");

            char[] arr = {'o','r','a','n','g','e'};
            fileWriter.write(arr);
            fileWriter.write("\n");

            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writerAppendDemo(){

        try(FileWriter fileWriter = new FileWriter("file_write.txt", true)){

            fileWriter.write("grapes");
            fileWriter.write("\n");

            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
