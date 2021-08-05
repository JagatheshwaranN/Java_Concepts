package frequentlyAskedJavaPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String ar[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int originalNum = number;
		int reverse = 0;
		while (number != 0) {

			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}
		if (reverse == originalNum)
			System.out.println(reverse + " is a palindrome number");
		else
			System.out.println(reverse + " is not a palindrome number");

		sc.close();
	}
}
