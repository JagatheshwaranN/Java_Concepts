package frequentlyAskedJavaPrograms;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fr = new FileWriter("D:\\ECLIPSE_ENV\\Workspace\\JavaConcepts\\dataFiles\\writeData.txt");
		BufferedWriter bw = new BufferedWriter(fr);
		bw.write("Welcome to Java programming");
		bw.write("\n");
		bw.write("Have a great day");
		bw.close();
		System.out.println("Done!");

	}

}
