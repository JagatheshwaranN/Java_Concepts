package frequentlyAskedJavaPrograms;

import java.util.Arrays;

public class CheckArraysAreEqual {

	public static void main(String[] args) {
		CheckArraysAreEqual checkArray = new CheckArraysAreEqual();
		checkArray.checkArrayEqual1();
		checkArray.checkArrayEqual2();
	}

	public void checkArrayEqual1() {
		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 3, 4, 5 };
		boolean status = Arrays.equals(a1, a2);
		if (status == true) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("Arrays are not equal");
		}
	}

	public void checkArrayEqual2() {
		int a1[] = { 1, 2, 3, 4, 5 };
		int a2[] = { 1, 2, 3, 4, 5};
		boolean status = true;
		if (a1.length == a2.length) {
			for (int i = 0; i < a1.length; i++) {
				if (a1[i] != a2[i]) {
					status = false;
				}
			}
			if (status == true) {
				System.out.println("Arrays are equal");
			} else {
				System.out.println("Arrays are not equal");
			}
		} else {
			System.out.println("Arrays are not equal");
		}
	}

}
