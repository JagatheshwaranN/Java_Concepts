package java9.feature.trywithresource;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class _02_TryWithResourceDemo2 {

	public static void main(String[] args) throws FileNotFoundException {

		BufferedReader br1 = new BufferedReader(
				new FileReader("src/main/java/java9/feature/trywithresource/demo1.txt"));
		BufferedReader br2 = new BufferedReader(
				new FileReader("src/main/java/java9/feature/trywithresource/demo2.txt"));
		try (br1; br2) {
			String line1, line2;
			while ((line1 = br1.readLine()) != null && (line2 = br2.readLine()) != null) {
				System.out.println(line1);
				System.out.println(line2);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
