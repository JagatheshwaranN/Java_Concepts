package frequentlyAskedJavaPrograms;

import java.util.Arrays;
import java.util.Collections;

public class SortArrayElementsUsingBuiltInMethods {

	public static void main(String[] args) {

		SortArrayElementsUsingBuiltInMethods sorting = new SortArrayElementsUsingBuiltInMethods();
		sorting.parallelSort();
		sorting.sort();
		sorting.reverseSort();
	}

	public void parallelSort() {
		int numbers[] = { 50, 10, 30, 70, 20 };
		System.out.println("Array elements before sort : " + Arrays.toString(numbers));
		Arrays.parallelSort(numbers);
		System.out.println("Array elements after sort : " + Arrays.toString(numbers));
	}

	public void sort() {
		int numbers[] = { 50, 10, 30, 70, 20 };
		System.out.println("Array elements before sort : " + Arrays.toString(numbers));
		Arrays.sort(numbers);
		System.out.println("Array elements after sort : " + Arrays.toString(numbers));
	}

	public void reverseSort() {
		Integer numbers[] = { 50, 10, 30, 70, 20 };
		System.out.println("Array elements before sort : " + Arrays.toString(numbers));
		Arrays.sort(numbers, Collections.reverseOrder());
		System.out.println("Array elements after sort : " + Arrays.toString(numbers));
	}

}
