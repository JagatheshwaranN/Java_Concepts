package preparation.fp_excercises.part1;

import java.util.List;

public class PrintListOfStrings {

    public static void main(String[] args) {
        List<String> input = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        printStringsInListType1(input);
        printStringsInListType2(input);
    }

    private static void printStringsInListType1(List<String> values) {
        values.stream().forEach(PrintListOfStrings::print);
    }

    private static void print(String data){
        System.out.println(data);
    }

    private static void printStringsInListType2(List<String> values) {
        values.forEach(System.out::println);
    }


}
