package beforeJava8.features.file_operations;

import java.io.File;

public class _02_File_Methods {

    public static void main(String[] args) {

        /*
            Important Methods Present in File
            =================================
            boolean exists()
            ================
            This method returns true if the specified file / directory available.

            boolean createNewFile()
            =======================
            This method first will check whether the specified file is available or not. If its
            already available then this method returns false without creating any physical file.
            If the file is not available then this method will create a new file and returns true.

            boolean mkdir()
            ===============
            This method first will check whether the specified directory is available or not. If
            it's already available then this method returns false without creating any physical
            directory. If the directory is not available then this method will create a new
            directory and returns true.

            boolean isFile()
            ================
            This method returns true if the specified file object pointing to physical file.

            boolean isDirectory()
            =====================
            This method returns true if the specified file object pointing to physical directory.

            String[] list()
            ===============
            This method returns the names of all files and subdirectories present in the specified
            directory.

            long length()
            =============
            This method returns the number of chars present in the specified file.

            boolean delete()
            ================
            This method is used to delete the specified file / directory.
        */
        GetFilesCount.fetchFilesCount();
        GetFilesName.fetchFilesName();
    }

}

class GetFilesCount {
    static int count = 0;

    public static void fetchFilesCount(){
        File file = new File("test");
        String[] files = file.list();
        assert files != null;
        for(String f : files){
            count++;
        }
        System.out.println("Files count : "+count);
    }

}

class GetFilesName {

    public static void fetchFilesName(){
        File folder = new File("test");
        String[] files = folder.list();
        assert files != null;
        for(String f : files){
            File file = new File(folder, f);
            if(file.isFile()) {
                System.out.println(file.getName());
            }
        }
    }

}
