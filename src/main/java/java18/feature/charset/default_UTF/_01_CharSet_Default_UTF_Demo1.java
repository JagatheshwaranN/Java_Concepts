package java18.feature.charset.default_UTF;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Before Java 18, the default charset was environment-dependent, meaning the
 * Java Virtual Machine (JVM) chooses the default charset during start-up, based
 * on the run-time environment, like the operating system, the user’s locale,
 * and other factors. For example, on macOS, the default charset is UTF-8; on
 * Windows, the default charset is ‘windows-1252’ (if English locale).
 * 
 * Since the default charset is not the same from machine to machine, APIs that
 * use the default charset may cause unwanted behaviors or errors, especially
 * the IO APIs like java.io.FileReader and java.io.FileWriter.
 * 
 * In Java 18, this JEP makes the default charset to UTF-8. However, we still
 * allow configuring the default charset to others by providing the system
 * property ‘file.encoding’.
 * 
 * @author Jagatheshwaran N
 */
public class _01_CharSet_Default_UTF_Demo1 {

	public static void main(String[] args) throws IOException {

		System.out.println("Default CharSet ==> " + Charset.defaultCharset());
		System.out.println("file.encoding   ==> " + System.getProperty("file.encoding"));
		System.out.println("native.encoding ==> " + System.getProperty("native.encoding"));

		try (FileWriter fw = new FileWriter("happy-learning.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("ハッピーコーディング！");
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		String text = Files.readString(Path.of("happy-learning.txt"));
		System.out.println(text);
	}
}
