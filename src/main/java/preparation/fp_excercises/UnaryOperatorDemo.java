package preparation.fp_excercises;

import java.util.function.*;
public class UnaryOperatorDemo {

    public static void main(String[] args) {

        UnaryOperator<Integer> unaryOperator = (x) -> x * 3;
        System.out.println(unaryOperator.apply(10));

    }
}
