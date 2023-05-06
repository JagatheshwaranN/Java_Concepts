package java17.feature.enhanced.randomnumber.generator;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

/**
 * Through JDK Enhancement Proposal 356, Java 17 introduced a framework of
 * interfaces inheriting from each other for the existing algorithms and new
 * algorithms so that the concrete algorithms are easily interchangeable in the
 * future.
 * 
 * Introduced a new interface called RandomGenerator to make future pseudorandom
 * number generator (PRNG) algorithms easier to implement or use.
 * 
 * The methods common to all random number generators like nextInt() and
 * nextDouble() are defined in RandomGenerator.
 * 
 * Java 17 also refactored the legacy random classes like java.util.Random,
 * SplittableRandom and SecureRandom to extend the new RandomGenerator
 * interface.
 * 
 * @author Jagatheshwaran N
 */
public class _01_Enhanced_Random_Number_Generator_Demo1 {

	public static void main(String[] args) {

		// Legacy
		// RandomGeneratorFactory.of("Random").create(40);

		// Default L32X64MixRandom
		// RandomGenerator generator = RandomGeneratorFactory.getDefault().create();

		// Passing the same seed to random, and then calling it will give you the same
		// set of numbers for example, seed = 999
		RandomGenerator generator = RandomGeneratorFactory.of("Xoshiro256PlusPlus").create(999);
		System.out.println(generator.getClass());
		int counter = 0;
		while (counter <= 10) {
			int number = generator.nextInt(12);
			counter++;
			System.out.println(number);
		}

		// The below code generates all the Java 17 PRNG algorithms
		RandomGeneratorFactory.all().map(factory -> factory.group() + " : " + factory.name()).sorted()
				.forEach(System.out::println);
	}
}
