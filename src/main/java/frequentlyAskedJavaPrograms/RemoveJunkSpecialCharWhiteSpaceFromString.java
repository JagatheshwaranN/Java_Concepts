package frequentlyAskedJavaPrograms;

public class RemoveJunkSpecialCharWhiteSpaceFromString {

	public static void main(String[] args) {
		String str1 = "@#$%^&* Java Program 0123456789";
		str1 = str1.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(str1);
		
		String str2 = "Java  programming  series";
		str2 = str2.replaceAll("\\s", "");
		System.out.println(str2);

	}

}
