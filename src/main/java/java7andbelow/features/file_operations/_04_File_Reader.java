package java7andbelow.features.file_operations;

public class _04_File_Reader {

    public static void main(String[] args) {

        /*
            FileReader
            ==========
            We can use FileReader to read the character data from the file.

            FileReader Constructors
            =======================
            FileReader fr = new FileReader (String filename);
            FileReader fr = new FileReader (File f);
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
            To close the FileReader object after completion of reading the data from the file.
        */
    }
}
