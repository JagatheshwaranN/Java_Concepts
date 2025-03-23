package preparation._ip;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileConcept {

    public static void main(String[] args) {
        fileReader();
        bufferedReader();
        fileReadAllLines();
        fileWriter();
        bufferedWriter();
        fileWriteAtOnce();
        fileExits();
        fileDelete();
        fileCreate();
        fileCopy();
    }

    private static void fileReader() {
        try(FileReader fileReader = new FileReader("src/test/java/preparation/_ip/data/data.txt")) {
            int ch;
            while((ch = fileReader.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void bufferedReader() {
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("src/test/java/preparation/_ip/data/data.txt"))) {
            String line;
            while((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileReadAllLines()  {
        try {
            List<String> lines = Files.readAllLines(Paths.get("src/test/java/preparation/_ip/data/data.txt"));
            lines.forEach(System.out::println);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileWriter() {
        try(FileWriter fileWriter = new FileWriter("src/test/java/preparation/_ip/data/output.txt")) {
            fileWriter.write("File Writing Demo");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void bufferedWriter() {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/test/java/preparation/_ip/data/output1.txt"))) {
            bufferedWriter.write("File Writing Demo");
            bufferedWriter.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileWriteAtOnce()  {
        try {
            Files.write(Paths.get("src/test/java/preparation/_ip/data/output2.txt"), Arrays.asList("File Writing Demo Line 1", "File Writing Demo Line 2"), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileExits()  {
        boolean exists = Files.exists(Paths.get("src/test/java/preparation/_ip/data/data.txt"));
        System.out.println(exists);
    }

    private static void fileCreate()  {
        try {
            Files.createFile(Paths.get("src/test/java/preparation/_ip/data/newFile.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileDelete()  {
        try {
            Files.delete(Paths.get("src/test/java/preparation/_ip/data/newFile.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void fileCopy()  {
        try {
            Files.copy(Paths.get("src/test/java/preparation/_ip/data/src.txt"), Paths.get("src/test/java/preparation/_ip/data/dest.txt"), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }





}

