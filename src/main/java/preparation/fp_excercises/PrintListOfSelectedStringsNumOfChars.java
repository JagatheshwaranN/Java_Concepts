package preparation.fp_excercises;

import java.util.List;

public class PrintListOfSelectedStringsNumOfChars {

    public static void main(String[] args) {
        List<String> input = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printSelectedStringsNumOfCharsType1(input);
        printSelectedStringsNumOfCharsType2(input);
        printListOfStringsNumOfChars(input);
    }

    private static void printSelectedStringsNumOfCharsType1(List<String> values) {
        values
                .stream().filter(PrintListOfSelectedStringsNumOfChars::checkValue)
                .map(PrintListOfSelectedStringsNumOfChars::stringLen)
                .forEach(System.out::println);
    }

    private static boolean checkValue(String data) {
        return data.contains("Spring");
    }

    private static int stringLen(String data) {
        return data.length();
    }

    private static void printSelectedStringsNumOfCharsType2(List<String> values) {
        values.stream()
                .filter(value -> value.contains("Spring"))
                .map(data -> data.length())
                .forEach(System.out::println);
    }

    private static void printListOfStringsNumOfChars(List<String> values) {
        values.stream()
                .map(String::length)
                .forEach(System.out::println);
    }

}
