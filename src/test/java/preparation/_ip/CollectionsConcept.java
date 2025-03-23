package preparation._ip;

import java.util.*;

public class CollectionsConcept {

    public static void main(String[] args) {
        listDemo();
        setDemo();
        mapDemo();
        queueDemo();
    }

    private static void listDemo() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Banana");
        System.out.println(fruits);
    }

    private static void setDemo() {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        System.out.println(numbers);
    }

    private static void mapDemo() {
        Map<Integer, String> languages = new HashMap<>();
        languages.put(1, "Java");
        languages.put(2, "Javascript");
        System.out.println(languages);
    }

    private static void queueDemo() {
        Queue<String> queue = new LinkedList<>();
        queue.add("john");
        queue.add("jane");
        System.out.println(queue);
    }

}
