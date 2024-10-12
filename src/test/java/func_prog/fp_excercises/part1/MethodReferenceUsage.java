package func_prog.fp_excercises.part1;

import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceUsage {

    public static void main(String[] args) {

        List<String> input = List.of("Spring", "Spring Boot", "API", "MicroServices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");


        input.stream()
                // Member Reference with Non-Static Method
                .map(String::toUpperCase)
                // Member Reference with Static Method
                .forEach(MethodReferenceUsage::display);

        // Method Reference with Constructor
        Supplier<String> data = String::new;
        System.out.println(data.get());
    }

    private static void display(String value){
        System.out.println(value);
    }
}
