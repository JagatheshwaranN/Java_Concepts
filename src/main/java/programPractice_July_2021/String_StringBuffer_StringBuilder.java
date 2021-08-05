package programPractice_July_2021;

public class String_StringBuffer_StringBuilder {

	public static void contact1(String str) {
		str = str + " love java";
		System.out.println("String : " + str);
	}

	public static void contact2(StringBuffer str) {
		str = str.append(" love java");
		System.out.println("StringBuffer : " + str);
	}

	public static void contact3(StringBuilder str) {
		str = str.append(" love java");
		System.out.println("StringBuilder : " + str);
	}

	public static void convertStringToStringBuffer(String str) {
		StringBuffer bufObj = new StringBuffer(str);
		System.out.println(bufObj.reverse());
	}

	public static void convertStringToStringBuilder(String str) {
		StringBuilder buildObj = new StringBuilder(str);
		System.out.println(buildObj.append(" is good"));
	}

	public static void covertStringBufferToString() {
		StringBuffer bufObj = new StringBuffer("Java");
		String str = bufObj.toString();
		System.out.println("StringBuffer after convert to String : " + str);
	}

	public static void covertStringBuilderToString() {
		StringBuilder buildObj = new StringBuilder("Java");
		String str = buildObj.toString();
		System.out.println("StringBuilder after convert to String : " + str);
	}

	public static void convertStringBufferToBuilder() {
		StringBuffer bufObj = new StringBuffer("Java");
		String str = bufObj.toString();
		StringBuilder buildObj = new StringBuilder(str);
		System.out.println("StringBuffer after convert to StringBuilder : " + buildObj);
	}

	public static void convertStringBuilderToBuffer() {
		StringBuilder buildObj = new StringBuilder("Program");
		String str = buildObj.toString();
		StringBuffer bufObj = new StringBuffer(str);
		System.out.println("StringBuilder after convert to StringBuffer : " + bufObj);
	}

	public static void main(String ar[]) {

		String str = "I";
		contact1(str);
		// Not changed its value since its unmutable
		System.out.println("String : " + str);

		StringBuffer strbuff = new StringBuffer("I");
		contact2(strbuff);
		// Changed its value since its mutable
		System.out.println("StringBuffer : " + strbuff);

		StringBuilder strbuild = new StringBuilder("I");
		contact3(strbuild);
		// Changed its value since its mutable
		System.out.println("StringBuilder : " + strbuild);

		String valToConvert = "Java";

		convertStringToStringBuffer(valToConvert);

		convertStringToStringBuilder(valToConvert);

		covertStringBufferToString();

		covertStringBuilderToString();

		convertStringBufferToBuilder();

		convertStringBuilderToBuffer();

	}

}
