package java8.feature.reference;

/**
 * 
 * If the Functional Interface method returns an object, in that case we should
 * go for Constructor Reference.
 * 
 * @author Jagatheshwaran N
 *
 */

interface Interf1 {

	public SampleDemo get(String s);
}

class SampleDemo {

	SampleDemo(String s) {
		System.out.println("Sample class constructor "+s);
	}
}

public class _5_ConstructorReferenceDemo2 {

	public static void main(String[] args) {

		Interf1 i = SampleDemo::new;
		i.get("called");
	}
}
