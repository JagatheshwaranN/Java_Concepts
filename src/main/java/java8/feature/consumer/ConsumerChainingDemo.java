package java8.feature.consumer;

import java.util.function.Consumer;

class Movie {
	String name;

	Movie(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}

}

public class ConsumerChainingDemo {

	public static void main(String[] args) {

		Consumer<Movie> c1 = m -> System.out.println(m + " movie was released for pongal 2023");
		Consumer<Movie> c2 = m -> System.out.println(m + " movie was good and hit");
		Consumer<Movie> c3 = c1.andThen(c2);
		c3.accept(new Movie("Thunivu"));
	}

}
