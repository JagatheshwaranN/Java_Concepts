package java12.feature.stream.enhancement;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _02_Teeing_Collector_Demo2 {

	public static void main(String[] args) {

		double average = Stream.of(1, 2, 3, 4, 5).collect(Collectors.teeing(Collectors.summingDouble(n -> n),
				Collectors.counting(), (sum, count) -> sum / count));
		System.out.println(average);
	}
}
