package frequentlyAskedJavaPrograms;

import java.util.Scanner;

public class CountEvenAndOddNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int orginalNum = number;
		int evenCount = 0;
		int oddCount = 0;

		while (number > 0) {
			int remainder = number % 10;
			if (remainder % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
			number = number / 10;
		}
		System.out.println("The number of even digits in " + orginalNum + " is " + evenCount);
		System.out.println("The number of odd digits in " + orginalNum + " is " + oddCount);
		sc.close();
	}

}
