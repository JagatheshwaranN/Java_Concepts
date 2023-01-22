package java8.feature.reference;

/**
 * 
 * If the Functional Interface method returns an object, in that case we should
 * go for Constructor Reference.
 * 
 * @author Jagatheshwaran N
 *
 */

interface Interf {

	public Sample get();
}

class Sample {

	Sample() {
		System.out.println("Sample class constructor");
	}
}

public class ConstructorReferenceDemo1 {

	public static void main(String[] args) {

		Interf i = Sample::new;
		i.get();
	}
}
