package java19.feature.records.enhancement;

public class _03_Records_Nested_PatternMatch_Demo3 {

	record JourneyStartDay(int sDay) {
	}

	record JourneyEndDay(int eDay) {

	}

	record JourneyTotalDays(JourneyStartDay jsd, JourneyEndDay jed) {

	}

	public static void main(String[] args) {
		calculateTotalJourneyDays(new JourneyTotalDays(new JourneyStartDay(1), new JourneyEndDay(10)));
	}

	@SuppressWarnings("preview")
	private static void calculateTotalJourneyDays(Object obj) {
		if (obj instanceof JourneyTotalDays(JourneyStartDay(int sDay),JourneyEndDay(int eDay))) {
			System.out.println("Total number of journey days is " + (eDay - sDay));
		}
	}
}
