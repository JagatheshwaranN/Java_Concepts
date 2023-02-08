package java9.feature.trywithresource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * 
 * Try-with-resource feature in Java 9 that helps to close resource
 * automatically after being used. In other words, we can say that we don't need
 * to close resources (file, connection, network etc) explicitly,
 * try-with-resource close that automatically by using AutoClosable interface.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _01_TryWithResourceDemo1 {

	public static void trywithResourceType1() {

		try (InputStream inputStream = new FileInputStream("src/main/java/java9/feature/trywithresource/demo1.txt");
				Scanner read = new Scanner(inputStream)) {
			while (read.hasNextLine()) {
				System.out.println(read.nextLine());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void trywithResourceType2() throws FileNotFoundException {

		InputStream inputStream = new FileInputStream("src/main/java/java9/feature/trywithresource/demo1.txt");
		Scanner read = new Scanner(inputStream);
		try (inputStream; read) {
			while (read.hasNextLine()) {
				System.out.println(read.nextLine());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) throws IOException {

		trywithResourceType1();
		System.out.println("**********************************************");
		trywithResourceType2();
	}
}
