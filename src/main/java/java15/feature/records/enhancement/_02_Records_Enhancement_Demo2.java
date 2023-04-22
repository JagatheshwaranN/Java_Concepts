package java15.feature.records.enhancement;

/**
 * Records can implement sealed interfaces, which were also added as a preview
 * feature in Java 15. Accordingly, sealed interfaces may also list records in
 * their "permits" list.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _02_Records_Enhancement_Demo2 {

	public static void main(String[] args) {

		Swift swift = new Swift(600000, "Baleno");
		System.out.println(swift.getDetail());
		Tata tata = new Tata(1000000);
		System.out.println(tata.getDetail());
	}
}

sealed interface Car permits Swift, Tata {

	String getDetail();
}

record Swift(int price, String model) implements Car {

	@Override
	public String getDetail() {
		return "The Swift model " + model + " price is " + price;
	}
}

record Tata(int price) implements Car {

	@Override
	public String getDetail() {

		return "The Tata price is " + price;
	}
}