package java19.feature.records.enhancement;

public class _02_Records_PatternMatch_Switch_Demo2 {

	record Car(String name, String model) {
	}

	public static void main(String[] args) {
		printCarDetail(new Car("Audi", "A6100"));
	}

	private static void printCarDetail(Object obj) {
		switch (obj) {
		case Car(String name, String model) ->
			System.out.println("Object is Car, Name = " + name + " and Model = " + model);
		default -> {
		}
		}
	}
}
