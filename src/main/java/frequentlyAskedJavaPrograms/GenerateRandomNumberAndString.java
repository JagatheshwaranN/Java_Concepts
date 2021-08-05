package frequentlyAskedJavaPrograms;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNumberAndString {

	public static void main(String arg[]) {

		GenerateRandomNumberAndString randomNumber = new GenerateRandomNumberAndString();
		randomNumber.generateRandomNumUsingRandomClass();
		randomNumber.generateRandomNumUsingMathClass();
		randomNumber.generateRandomNumUsingApacheCommon();
		randomNumber.generateRandomStringUsingApacheCommon();
	}

	public void generateRandomNumUsingRandomClass() {
		Random random = new Random();
		int number = random.nextInt(1000);
		System.out.println("Integer generated using Random " + number);
		double number1 = random.nextDouble(); // 0.0 to 1.0
		System.out.println("Decimal generated using Random " + number1);
	}

	public void generateRandomNumUsingMathClass() {
		System.out.println("Decimal generated using Math " + Math.random());

	}

	public void generateRandomNumUsingApacheCommon() {
		int number2 = Integer.parseInt(RandomStringUtils.randomNumeric(5));
		System.out.println("Integer generated using Apacha Common " + number2);
	}

	public void generateRandomStringUsingApacheCommon() {
		String str = RandomStringUtils.randomAlphabetic(5);
		System.out.println("String generated using Apacha Common " + str);
	}
}
