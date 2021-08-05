package frequentlyAskedJavaPrograms;

public class FindMaxAndMinElementInArray {

	public static void main(String[] args) {

		int a[] = { 2, 5, 7, 9, 11 };
		int max = a[0];
		int min = a[0];

		for (int i = 1; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.println("Maximum number in array is " + max);
		System.out.println("Minimum number in array is " + min);
	}
}
