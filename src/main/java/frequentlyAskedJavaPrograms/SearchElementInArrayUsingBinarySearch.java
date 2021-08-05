package frequentlyAskedJavaPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementInArrayUsingBinarySearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		
		SearchElementInArrayUsingBinarySearch search = new SearchElementInArrayUsingBinarySearch();
		search.binarySearch1(number);
		search.binarySearch2(number);
		sc.close();
	}

	public void binarySearch1(int number) {
		int numbers[] = {10,20,30,40,50,60,70,80,90,100};
		boolean flag = false;
		
		int searchElement = number;
		int lower = 0;
		int higher = numbers.length-1;
		
		while (lower<=higher) {
			int mid = (lower+higher)/2;
			
			if(numbers[mid] == searchElement) {
				System.out.println("Element found... : "+numbers[mid]);
				flag = true;
				break;
			}
			if(numbers[mid]<searchElement) {
				lower = mid+1;
			}
			if(numbers[mid]>searchElement) {
				higher = mid-1;
			}
		}
		if(flag == false) {
			System.out.println("Element not found...");
		}
	}
	
	public void binarySearch2(int key) {
		int numbers[] = {10,20,30,40,50,60,70,80,90,100};
		System.out.println(Arrays.binarySearch(numbers, key));
	}
}
