package java18.feature.charset.default_UTF;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;

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
