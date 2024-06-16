package preparation.fp_excercises.part2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileOperations {

    public static void main(String[] args) throws IOException {
        fileRead();
        fileReadAndPrintDistinctStrings();
        listFilesInFolder();
        listFoldersInFolder();
    }

    private static void fileRead() throws IOException {

        Files.lines(Path.of("Java11File.txt")).forEach(System.out::println);
    }

    private static void fileReadAndPrintDistinctStrings() throws IOException {

        Files.lines(Path.of("Java11File.txt"))
                .map(line -> line.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(System.out::println);
    }

    private static void listFilesInFolder() throws IOException {
        Files.list(Paths.get("."))
                .forEach(System.out::println);
    }

    private static void listFoldersInFolder() throws IOException {
        Files.list(Paths.get("."))
                .filter(Files::isDirectory)
                .forEach(System.out::println);
    }

}
