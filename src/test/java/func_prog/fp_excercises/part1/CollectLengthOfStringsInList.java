package func_prog.fp_excercises.part1;

import java.util.List;
import java.util.stream.Collectors;

public class CollectLengthOfStringsInList {

    public static void main(String[] args) {
        List<String> input = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");
        collectLengthOfStringsInList(input);
    }

    private static void collectLengthOfStringsInList(List<String> input) {

        List<Integer> stringLength = input.stream().map(String::length).collect(Collectors.toList());
        System.out.println(stringLength);
    }

}
