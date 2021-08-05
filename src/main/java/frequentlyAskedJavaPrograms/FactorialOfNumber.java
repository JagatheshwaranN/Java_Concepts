package frequentlyAskedJavaPrograms;

public class FactorialOfNumber {
	
	public static void main(String ar[]) {
		FactorialOfNumber factorialOfNumber = new FactorialOfNumber();
		factorialOfNumber.factorialNumber1();
		factorialOfNumber.factorialNumber2();
		int number = 5;
		System.out.println("Factorial of "+number+" is "+factorialOfNumber.factorialUsingRecursive(number));
	}

	public void factorialNumber1() {
		int number = 5;
		int fact = 1;
			
		for(int i = 1;i<=number;i++) {
			fact = fact *i;
		}
		System.out.println("Factorial of "+number+" is "+fact);
	}
	
	public void factorialNumber2() {
		int number = 5;
		int fact = 1;
			
		for(int i = number;i>=1;i--) {
			fact = fact *i;
		}
		System.out.println("Factorial of "+number+" is "+fact);
	}
	
	public int factorialUsingRecursive(int number) {
		if(number==0)
			return 1;
		else
			return (number * factorialUsingRecursive(number-1));
	}
}
