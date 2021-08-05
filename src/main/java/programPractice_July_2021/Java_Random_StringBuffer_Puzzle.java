package programPractice_July_2021;

import java.util.Random;

public class Java_Random_StringBuffer_Puzzle {

	private static Random rd = new Random();

	public static void main(String[] ar) {

		StringBuffer word = null;

		switch (rd.nextInt(2)) {
		case 1:
			word = new StringBuffer('P');
		case 2:
			word = new StringBuffer('G');
		default:
			word = new StringBuffer('M');
		}
		word.append('a');
		word.append('i');
		word.append('n');
		System.out.println(word);
	}

}
