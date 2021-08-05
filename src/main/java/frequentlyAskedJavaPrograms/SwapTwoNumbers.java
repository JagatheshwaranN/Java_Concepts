package frequentlyAskedJavaPrograms;

public class SwapTwoNumbers {

	public void swapWithThirdVar() {
		int a = 10, b = 5, t = 0;
		System.out.println("Logic 1 - a and b before swap " + a + " " + b);
		t = a; // 10
		a = b; // 5
		b = t; // 10
		System.out.println("Logic 1 - a and b after swap " + a + " " + b);
	}

	public void swapWithAddSub() {
		int a = 10, b = 5;
		System.out.println("Logic 2 - a and b before swap " + a + " " + b);
		a = a + b; // 15
		b = a - b; // 10
		a = a - b; // 5
		System.out.println("Logic 2 - a and b after swap " + a + " " + b);
	}

	public void swapWithMulDiv() {
		System.out.println("This logic should be used only when two numbers are not zeros");
		int a = 10, b = 5;
		System.out.println("Logic 3 - a and b before swap " + a + " " + b);
		a = a * b; // 50
		b = a / b; // 10
		a = a / b; // 5
		System.out.println("Logic 3 - a and b after swap " + a + " " + b);
	}

	public void swapWithXOR() {
		int a = 10, b = 5;
		System.out.println("Logic 4 - a and b before swap " + a + " " + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("Logic 4 - a and b after swap " + a + " " + b);
	}

	public void swapWithSingleStmt() {
		int a = 10, b = 5;
		System.out.println("Logic 5 - a and b before swap " + a + " " + b);
		b = a + b - (a = b);
		System.out.println("Logic 5 - a and b after swap " + a + " " + b);
	}

	public static void main(String ar[]) {

		SwapTwoNumbers swap = new SwapTwoNumbers();
		swap.swapWithThirdVar();
		System.out.println("***********************************************");
		swap.swapWithAddSub();
		System.out.println("***********************************************");
		swap.swapWithMulDiv();
		System.out.println("***********************************************");
		swap.swapWithXOR();
		System.out.println("***********************************************");
		swap.swapWithSingleStmt();
		System.out.println("***********************************************");

	}

}
