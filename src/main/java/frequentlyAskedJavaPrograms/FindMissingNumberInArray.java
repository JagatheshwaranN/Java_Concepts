package frequentlyAskedJavaPrograms;

public class FindMissingNumberInArray {

	public static void main(String[] args) {

		// Array should not have duplicate values
		// Array don't need to be in sorted order
		// Array values should be in range

		int a[] = { 1, 2, 4, 5 };
		int sum1 = 0;
		int sum2 = 0;
		int len = a.length;
		for (int i = 0; i < len; i++) {
			sum1 = sum1 + a[i];
		}
		System.out.println("Sum of elements in array is " + sum1);
		for (int i = 1; i <= 5; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("Sum of elements in array is " + sum2);

		int missingNum = sum2 - sum1;
		System.out.println("Missing number in an array is " + missingNum);
	}

}
