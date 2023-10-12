package java7andbelow.features.file_operations;

import java.io.File;
import java.io.IOException;

public class _01_File_Intro {

    public static void main(String[] args) throws IOException {

        /*
            File
            ====
            File f = new File("abc.txt");
            This line won't create any physical file. First, it will check is there any physical
            file named with abc.txt is available or not. If its available then f simply refers
            that file. If it's not available then we are just creating java file object to represent
            the name abc.txt.

            We can use Java file object to represent the directory as well.

            Note:
            =====
            In Unix, everything is treated as a file. Java File I/O concept is implemented based on
            Unix operating system. Hence, Java file object can be used to represents both file and
            directory.
        */
        File file = new File("abc.txt");
        System.out.println(file.exists());
        System.out.println(file.createNewFile());
        System.out.println(file.exists());

        File folder = new File("test");
        System.out.println(folder.exists());
        System.out.println(folder.mkdir());
        System.out.println(folder.exists());

        /*
            File Constructors
            =================
            File f = new File(String name);
            Creates a java file object to represent the name of the file /directory in current
            working directory.

            File f = new File(String subdirname, String name);
            Creates a java file object to represent the name of the file /directory present in
            specified subdirectory.

            File f = new File(File subdir, String name);
            Creates a java file object to represent the name of the file /directory present in
            specified subdirectory.
        */

        File f1 = new File ("test", "demo1.txt"); // form 2
        System.out.println(f1.createNewFile());
        File f2 = new File (folder, "demo2.txt"); // form 3
        System.out.println(f2.createNewFile());
    }

}
