package java12.feature.stream.enhancement;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _03_Teeing_Collector_Demo3 {

	public static void main(String[] args) {

		Result result = Stream.of(5, 10, 15, 7, 20).collect(Collectors.teeing(Collectors.counting(), Collectors.filtering(n->Integer.parseInt(n.toString()) > 10, Collectors.toList()), Result::new));
		System.out.println(result);

	}
}
