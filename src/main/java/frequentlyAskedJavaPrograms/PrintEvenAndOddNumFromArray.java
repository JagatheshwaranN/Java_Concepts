package frequentlyAskedJavaPrograms;

public class PrintEvenAndOddNumFromArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println("Even number in array " + a[i]);

			} else {
				System.out.println("Odd number in array " + a[i]);
			}
		}

		for (int i : a) {
			if (i % 2 == 0) {
				System.out.println("Even number in array " + i);

			} else {
				System.out.println("Odd number in array " + i);
			}
		}

	}

}
