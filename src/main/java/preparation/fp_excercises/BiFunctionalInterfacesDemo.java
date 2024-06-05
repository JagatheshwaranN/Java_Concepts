package preparation.fp_excercises;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctionalInterfacesDemo {

    public static void main(String[] args) {

        biPredicateDemo();
        biFunctionDemo();
        biConsumerDemo();
    }

    private static void biPredicateDemo() {
        BiPredicate<Integer, String> biPredicate = (x, y) -> x > 10 && y.length() > 5;
        System.out.println(biPredicate.test(15, "Function"));
    }

    private static void biFunctionDemo() {
        BiFunction<Integer, String, String> biFunction = (x, y) -> x +" " + y;
        System.out.println(biFunction.apply(15, "Function"));
    }

    private static void biConsumerDemo() {
        BiConsumer<Integer, String> biConsumer = (X, Y) -> {
                System.out.println(X);
                System.out.println(Y);
        };
        biConsumer.accept(10, "Java");
    }

}
