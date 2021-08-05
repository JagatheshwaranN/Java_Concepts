package lambdaExpressions;

@FunctionalInterface // It is used invoke Lambda expression
interface Flight {
	public void bookFlight();
}

// Normal Class - This class is replaced by Lambda expression
class AirOne implements Flight {
	@Override
	public void bookFlight() {
		System.out.println("Book your flight using normal method");
	}
}

@FunctionalInterface // It is used invoke Lambda expression
interface Bus {
	public void bookBus(String source);
}

// Normal Class - This class is replaced by Lambda expression
class BusOne implements Bus {
	@Override
	public void bookBus(String source) {
		System.out.println("By normal method trip started at " + source);
	}
}

@FunctionalInterface // It is used invoke Lambda expression
interface Ship {
	public String bookShip(String source, String destination);
}

// Normal Class - This class is replaced by Lambda expression
class ShipOne implements Ship {
	@Override
	public String bookShip(String source, String destination) {
		System.out.println("Thru normal method journey started at " + source + " and ended at " + destination);
		return ("Price for journey is Rs.500");
	}
}

public class LambdaExpressionDemo {

	public static void main(String ar[]) {

		// Normal Method
		Flight airOne1 = new AirOne();
		airOne1.bookFlight();

		// Lambda Method - Print statement
		Flight airOne2 = () -> System.out.println("Book your flight using lambda method");
		airOne2.bookFlight();

		// Normal Method
		Bus busOne1 = new BusOne();
		busOne1.bookBus("Bangalore");

		// Lambda Method - Accept arguments and prints the statement
		Bus busOne2 = (String src) -> System.out.println("By lambda method trip started at " + src);
		busOne2.bookBus("Chennai");

		// Normal Method
		Ship shipOne1 = new ShipOne();
		System.out.println(shipOne1.bookShip("Chennai", "Bangalore"));

		// Lambda Method - Accept arguments and return the value
		Ship shipOne2 = (String src, String dest) -> {
			System.out.println("Thru lambda method journey started at " + src + " and ended at " + dest);
			return ("Price for journey is Rs.500");
		};
		System.out.println(shipOne2.bookShip("Bangalore", "Chennai"));
	}
}
