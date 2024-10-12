package func_prog.fp_excercises.part1;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionDemo {

    public static void main(String[] args) {

        Supplier<Integer> randomNumber = () -> {
            Random random = new Random();
            return random.nextInt(1000);
        };
        System.out.println(randomNumber.get());
    }

}
