package frequentlyAskedJavaPrograms;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 4, 5 };
		int sum1 = 0;
		int sum2 = 0;
		int len = a.length;
		for (int i = 0; i < len; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of elements in array is " + sum1);

		for (int i : a) {
			sum2 = sum2 + i;
		}
		System.out.println("Sum of elements in array is " + sum2);
	}

}
