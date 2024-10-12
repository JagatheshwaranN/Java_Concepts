package func_prog.fp_excercises.part1;

import java.util.List;

public class PrintListOfSelectedStrings {

    public static void main(String[] args) {
        List<String> input = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printSelectedStringsInListType1(input);
        printSelectedStringsInListType2(input);
        printSpecificStringsInListType1(input);
        printSpecificStringsInListType2(input);
    }

    private static void printSelectedStringsInListType1(List<String> values) {
        values.stream().filter(PrintListOfSelectedStrings::checkValue).forEach(System.out::println);
    }

    private static boolean checkValue(String data) {
        return data.contains("Spring");
    }

    private static void printSelectedStringsInListType2(List<String> values) {
        values.stream().filter(value -> value.contains("Spring")).forEach(System.out::println);
    }

    private static void printSpecificStringsInListType1(List<String> values) {
        values.stream().filter(PrintListOfSelectedStrings::checkData).forEach(System.out::println);
    }

    private static boolean checkData(String data) {
        return data.length() >= 4;
    }

    private static void printSpecificStringsInListType2(List<String> values) {
        values.stream().filter(value -> value.length() >= 4).forEach(System.out::println);
    }
}
