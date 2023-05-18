package java19.feature.records.enhancement;

/**
 * As of Java 19, JDK Enhancement Proposal 405 allows us to use a so-called
 * "record pattern".
 * 
 * @author Jagatheshwaran N
 */
public class _01_Records_PatternMatch_Demo1 {

	record Car(String name, String model) {
	}

	public static void main(String[] args) {
		printCarDetail(new Car("Audi", "A6100"));
	}

// Before Java19
//	@SuppressWarnings("preview")
//	private static void printCarDetail(Object obj) {
//		if (obj instanceof Car car) {
//			System.out.println(car.name + " " + car.model);
//		}
//	}

	@SuppressWarnings("preview")
	private static void printCarDetail(Object obj) {
		if (obj instanceof Car(String name,String model)) {
			System.out.println(name + " " + model);
		}
	}
}
