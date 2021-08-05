package frequentlyAskedJavaPrograms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadDataFromTextFile {
	
	public static void main(String ar[]) throws IOException {
		ReadDataFromTextFile read = new ReadDataFromTextFile();
		read.readTextFileUsingFileReader();
		read.readTextFileUsingFile1();
		read.readTextFileUsingFile2();
		
	}
	
	public void readTextFileUsingFileReader() throws IOException {
		FileReader fr = new FileReader("D:\\ECLIPSE_ENV\\Workspace\\JavaConcepts\\dataFiles\\readData.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine())!=null) {
			System.out.println(line);
		}
		br.close();
		fr.close();
	}

	public void readTextFileUsingFile1() throws FileNotFoundException {
		File file = new File("D:\\ECLIPSE_ENV\\Workspace\\JavaConcepts\\dataFiles\\readData.txt");
		Scanner sc = new Scanner(file);
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
	}
	
	public void readTextFileUsingFile2() throws FileNotFoundException {
		File file = new File("D:\\ECLIPSE_ENV\\Workspace\\JavaConcepts\\dataFiles\\readData.txt");
		Scanner sc = new Scanner(file);
		sc.useDelimiter("\\z");
		System.out.println(sc.next());
		sc.close();
	}
	
}
