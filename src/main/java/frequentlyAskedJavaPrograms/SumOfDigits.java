package frequentlyAskedJavaPrograms;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int orginalNum = number;
		int sum = 0;

		while (number != 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		System.out.println("The sum of digits in " + orginalNum + " is " + sum);
		sc.close();

	}

}
