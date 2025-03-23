package preparation._ip;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Java8Concept {

    public static void main(String[] args) {
        lambdaExpDemo();
        sortListDemo();
        filterDemo();
        mapDemo();
        reduceDemo();
        optionalNullDemo();
        optionalIfPresentDemo();
        optionalMapDemo();
    }

    private static void lambdaExpDemo() {
        List<String> fruits = Arrays.asList("Apple", "Banana");
        //noinspection LambdaBodyCanBeCodeBlock
        fruits.forEach(x -> System.out.println(x));
    }

    private static void sortListDemo() {
        List<Integer> integerList = Arrays.asList(4, 3, 2, 1, 7, 5);
        integerList.sort((a, b) -> a.compareTo(b));
        System.out.println(integerList);
    }

    private static void filterDemo() {
        List<Integer> integerList = Arrays.asList(4, 3, 2, 1, 7, 5);
        List<Integer> filtered = integerList.stream().filter(x->x>=5).toList();
        System.out.println(filtered);
    }

    private static void mapDemo() {
        List<String> topics = Arrays.asList("java", "python");
        List<String> topicsUC = topics.stream().map(String::toUpperCase).toList();
        System.out.println(topicsUC);
    }

    private static void reduceDemo() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        int sum = numbers.stream().reduce(0, Integer::sum);
        System.out.println(sum);
    }

    private static void optionalNullDemo() {
        String result = (String) Optional.ofNullable(null).orElse("Default");
        System.out.println(result);
    }

    private static void optionalIfPresentDemo() {
        Optional<String> data = Optional.of("Hello");
        data.ifPresent(System.out::println);
    }

    private static void optionalMapDemo() {
        Optional<String> data = Optional.of("Hello");
        Optional<String> upperCase = data.map(String::toUpperCase);
        System.out.println(upperCase.get());
    }

}
