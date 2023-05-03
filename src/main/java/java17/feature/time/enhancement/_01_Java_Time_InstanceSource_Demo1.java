package java17.feature.time.enhancement;

import java.time.Instant;
import java.time.InstantSource;

/**
 * The java.time.Clock class is handy for writing tests that check
 * time-dependent functionality. For example, when Clock is injected into the
 * application classes via dependency injection, it can be mocked into tests, or
 * a fixed time for test execution can be set using Clock.fixed().
 * 
 * Since Clock provides the getZone() method, you always have to think about
 * which concrete time zone to instantiate a Clock object with.
 * 
 * To allow alternative, time zone-independent time sources, the interface
 * java.time.InstantSource was extracted from Clock in Java 17. The new
 * interface only provides the methods instant() and millis() for querying the
 * time, where millis() is already implemented as a default method.
 * 
 * https://stackoverflow.com/questions/69199722/what-is-the-main-purpose-of-the-new-interface-java-time-instantsource-over-exist
 * 
 * @author Jagatheshwaran N
 */
public class _01_Java_Time_InstanceSource_Demo1 {

	public static void main(String[] args) {

		var timeTest = new TimerTest(InstantSource.system());
		System.out.println(timeTest.getInstant());
	}
}

class TimerTest {

	InstantSource instantSource;

	public TimerTest(InstantSource instantSource) {
		this.instantSource = instantSource;
	}

	Instant getInstant() {
		return instantSource.instant();
	}
}
