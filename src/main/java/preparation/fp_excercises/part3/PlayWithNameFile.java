package preparation.fp_excercises.part3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@SuppressWarnings("ALL")
public class PlayWithNameFile {

    static Path path = Paths.get("src/main/resources/testData/names.txt");

    public static void main() {
        List<String> names;
        try {
            names = Files.readAllLines(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        countNamesThatStartWithB(names);
        createListWithNamesStartWithCAndHasS(names);
        countCharsOfNameStartWithM(names);
        manipulateNameWhichHasHypen(names);
        findNameWhichHasMoreChars(names);
    }

    static void countNamesThatStartWithB(List<String> names) {
        long namesCount = names.stream()
                .filter(name -> name.startsWith("B"))
                .count();
        System.out.println(namesCount);
    }

    static void createListWithNamesStartWithCAndHasS(List<String> names) {
        List<String> namesList = names.stream()
                .filter(name -> name.startsWith("C"))
                .filter(name -> name.toLowerCase().contains("s"))
                .toList();
        System.out.println(STR."\{namesList.size()} :: \{namesList}");
    }

    static void countCharsOfNameStartWithM(List<String> names) {
        // Approach 1
        String concatName = names.stream()
                .filter(name -> name.startsWith("M"))
                .collect(Collectors.joining());
        System.out.println(concatName.length());

        // Approach 2
        long charCount = names.stream()
                .filter(name -> name.startsWith("M"))
                .map(String::trim)
                .map(String::length)
                .mapToInt(i -> i)
                .sum();
        System.out.println(charCount);
    }

    static void manipulateNameWhichHasHypen(List<String> names) {
        List<String> namesWithHypen = names.stream()
                .filter(name -> name.contains("-"))
                .toList();
        System.out.println(namesWithHypen);

        List<String> namesWithoutHypen = names.stream()
                .filter(name -> name.contains("-"))
                .map(name -> name.replaceAll("-", " "))
                .toList();
        System.out.println(namesWithoutHypen);
    }

    static void findNameWhichHasMoreChars(List<String> names) {
        Optional<String> highestCharName = names.stream()
                .filter(name -> name.contains("-"))
                .map(name -> name.replaceAll("-", " "))
                .max(Comparator.comparing(name -> name.length()));
        System.out.println(highestCharName.get());
    }

}
