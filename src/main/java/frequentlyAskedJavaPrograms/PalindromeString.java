package frequentlyAskedJavaPrograms;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = sc.next();
		String originalStr = string;
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse = reverse + string.charAt(i);
		}
		if (reverse.equals(originalStr))
			System.out.println(reverse + " is a palindrome string");
		else
			System.out.println(reverse + " is not a palindrome string");

		sc.close();
	}

}
