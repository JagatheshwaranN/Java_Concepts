package frequentlyAskedJavaPrograms;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number\n");
		int number1 = sc.nextInt();

		System.out.println("Enter the second number\n");
		int number2 = sc.nextInt();

		System.out.println("Enter the third number\n");
		int number3 = sc.nextInt();

		LargestOfThreeNumbers large = new LargestOfThreeNumbers();
		large.largestNumber(number1, number2, number3);
		large.largestNumberWithTerinaryOps(number1, number2, number3);
		sc.close();
	}

	public void largestNumber(int num1, int num2, int num3) {

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the largest number");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the largest number");
		} else {
			System.out.println(num3 + " is the largest number");
		}
	}

	public void largestNumberWithTerinaryOps(int num1, int num2, int num3) {
		int largest = num1 > num2 ? num1 : num2;
		largest = num3 > largest ? num3 : largest;
		System.out.println(largest + " is the largest number");
	}

}
