package frequentlyAskedJavaPrograms;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		int orginalNum = number;
		int count = 0;
		while(number!=0) {
			number = number/10;
			count++;
		}
		System.out.println("The number of digits in "+orginalNum+ " is "+count);
		sc.close();

	}

}
