package frequentlyAskedJavaPrograms;

public class SearchElementInArray {

	public static void main(String ar[]) {

		SearchElementInArray search = new SearchElementInArray();
		search.findElemntUsingLinearSearch();
	}

	public void findElemntUsingLinearSearch() {

		int input[] = { 10, 20, 40, 50, 30 };
		int search = 50;

		boolean flag = false;
		for (int i = 0; i < input.length; i++) {

			if (search == input[i]) {
				System.out.println("The search element " + input[i] + " found in position " + i);
				flag = true;
				break;
			}
		}
		if (flag == false)
			System.out.println("The search element is not found");
	}
	
	public void findElementUsingBinarySearch() {
		
	}
	
}
