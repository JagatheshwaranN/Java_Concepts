package java.features.file_operations;

import java.io.*;

public class _08_FileOperations_Example {

    public static void main(String[] args) {
         fileMergeStraight();
         fileMergeAlternate();
         fileDataExtract();
    }

    public static void fileMergeStraight(){

        try (PrintWriter printWriter = new PrintWriter("file_merge.txt");
             BufferedReader bufferedReader1 = new BufferedReader(new FileReader("file_write.txt"));
             BufferedReader bufferedReader2 = new BufferedReader(new FileReader("buffered_write.txt"))){

            String line = bufferedReader1.readLine();
            while(line != null){
                printWriter.println(line);
                line = bufferedReader1.readLine();
            }
            String line2 = bufferedReader2.readLine();
            while(line2 != null){
                printWriter.println(line2);
                line2 = bufferedReader2.readLine();
            }
            printWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void fileMergeAlternate(){

        try (PrintWriter printWriter = new PrintWriter("file_merge_alternate.txt");
             BufferedReader bufferedReader1 = new BufferedReader(new FileReader("file_write.txt"));
             BufferedReader bufferedReader2 = new BufferedReader(new FileReader("buffered_write.txt"))){

            String line = bufferedReader1.readLine();
            String line2 = bufferedReader2.readLine();
            while((line != null) || (line2 != null)){
                if(line != null){
                    printWriter.println(line);
                    line = bufferedReader1.readLine();
                }
                if(line2 != null){
                    printWriter.println(line2);
                    line2 = bufferedReader2.readLine();
                }
            }
            printWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void fileDataExtract(){

        try (PrintWriter printWriter = new PrintWriter("output.txt");
             BufferedReader bufferedReader1 = new BufferedReader(new FileReader("file_write.txt"));
             BufferedReader bufferedReader2 = new BufferedReader(new FileReader("buffered_write.txt"))){

            String line = bufferedReader1.readLine();

            while(line != null){

                boolean available = false;
                String line2 = bufferedReader2.readLine();

                while(line2 != null) {
                    if(line.equals(line2)){
                        available = true;
                        break;
                    }
                    line2 = bufferedReader2.readLine();
                }

                if(!available){
                    printWriter.println(line);
                }

                line = bufferedReader1.readLine();
            }
            printWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
