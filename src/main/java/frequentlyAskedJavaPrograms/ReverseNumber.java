package frequentlyAskedJavaPrograms;

import java.util.Scanner;

public class ReverseNumber {
	
	@SuppressWarnings("resource")
	public static void main(String ar[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse");
		int number = sc.nextInt();
		
		ReverseNumber reverse = new ReverseNumber();
		reverse.reverseNumUsingArithmeticOps(number);
		reverse.reverseNumUsingStrBuffer(number);
		reverse.reverseNumUsingStrBuilder(number);
		
	}
	
	public void reverseNumUsingArithmeticOps(int number) {
		int rev = 0;
		while(number != 0) {
			rev = rev*10+number%10;
			number = number/10;
		}
		System.out.println("The reverse of given number "+rev);
	}
	
	public void reverseNumUsingStrBuffer(int number) {
		StringBuffer sb = new StringBuffer(String.valueOf(number));
		StringBuffer rev = sb.reverse();
		System.out.println("The reverse of given number "+rev);	
	}
	
	public void reverseNumUsingStrBuilder(int number) {
		StringBuilder sb = new StringBuilder();
		sb.append(number);
		StringBuilder rev = sb.reverse();
		System.out.println("The reverse of given number "+rev);	
	}

}
