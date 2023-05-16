package java19.feature.sysout.syserr.property;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * One change that you won't find in the Java 19 feature announcements but only
 * kept deep in the release notes is something every Java developer should know
 * about.
 * 
 * If you run an existing application with Java 19, you may see question marks
 * on the console instead of special characters.
 * 
 * This is because, as of Java 19, the operating system's default encoding is
 * used for printing to System.out and System.err - for example, "Cp1252" on
 * Windows. To change the output to UTF-8, you have to add the following VM
 * options when calling the application.
 * 
 * -Dstdout.encoding=utf8 -Dstderr.encoding=utf8
 * 
 * @author Jagatheshwaran N
 */
public class _01_SysOut_SysErr_Property_Demo1 {

	public static void main(String[] args) throws IOException {

		try (FileWriter fw = new FileWriter("lovelearning.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("你好");
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		String content = Files.readString(Path.of("lovelearning.txt"));
		System.out.println(content);
	}
}
