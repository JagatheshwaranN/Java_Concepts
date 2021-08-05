package frequentlyAskedJavaPrograms;

public class FibonnaciSeries {

	public static void main(String[] args) {

		FibonnaciSeries fibonnaci = new FibonnaciSeries();
		fibonnaci.fibonacci1();
		System.out.println();
		fibonnaci.fibonacci2();

	}

	public void fibonacci1() {
		int n1 = 0, n2 = 1, sum = 0;
		System.out.print(n1 + " " + n2);
		for (int i = 2; i < 10; i++) {
			sum = n1 + n2;
			System.out.print(" " + sum);
			n1 = n2;
			n2 = sum;
		}
	}

	public void fibonacci2() {
		int n1 = -1, n2 = 1, sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = n1 + n2;
			System.out.print(sum+" ");
			n1 = n2;
			n2 = sum;
		}
	}

}
