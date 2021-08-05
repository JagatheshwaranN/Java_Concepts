package frequentlyAskedJavaPrograms;

import java.util.Scanner;

public class ReverseString {

	@SuppressWarnings("resource")
	public static void main(String ar[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String input = sc.next();
		ReverseString reverse = new ReverseString();
		reverse.reverseStrUsingConcate(input);
		reverse.reverseStrUsingCharArray(input);
		reverse.reverseStrUsingStrBuffer(input);
	}

	public void reverseStrUsingConcate(String input) {
		String rev = "";
		int len = input.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		System.out.println("The reverse of given String " + rev);
	}

	public void reverseStrUsingCharArray(String input) {
		String rev = "";
		char a[] = input.toCharArray();
		int len = a.length;
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + a[i];
		}
		System.out.println("The reverse of given String " + rev);
	}

	public void reverseStrUsingStrBuffer(String input) {
		StringBuffer sb = new StringBuffer(input);
		System.out.println("The reverse of given String " + sb.reverse());
	}
}
