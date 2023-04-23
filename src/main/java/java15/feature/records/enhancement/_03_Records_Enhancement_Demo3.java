package java15.feature.records.enhancement;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Records can also be defined within methods to store intermediate values.
 * Unlike local classes, a local record is implicitly static. This means they
 * cannot access variables and instance members of the enclosing methods which
 * is actually great since it prevents capturing of values by the record. Local
 * records are a great boon for Java developers who would earlier have to create
 * helper records.
 * 
 * @author Jagatheshwaran N
 *
 */
public class _03_Records_Enhancement_Demo3 {

	public static void main(String[] args) {

		Merchant alex = new Merchant("Alex");
		Merchant john = new Merchant("John");
		Merchant blake = new Merchant("Blake");
		Merchant erica = new Merchant("Erica");

		List<Merchant> merchantsList = List.of(alex, john, blake, erica);
		List<Sale> salesList = List.of(new Sale(alex, LocalDate.of(2023, Month.APRIL, 17), 11034.20),
				new Sale(john, LocalDate.of(2023, Month.APRIL, 18), 8234.22),
				new Sale(blake, LocalDate.of(2023, Month.APRIL, 19), 11000.47),
				new Sale(erica, LocalDate.of(2023, Month.APRIL, 20), 19654.20));

		_03_Records_Enhancement_Demo3 demo = new _03_Records_Enhancement_Demo3();

		List<Merchant> topMerchant = demo.findTopMerchant(salesList, merchantsList, 2023, Month.APRIL);
		topMerchant.stream().forEach(m -> System.out.println(m.name()));

	}

	record Merchant(String name) {
	}

	record Sale(Merchant merchant, LocalDate date, double value) {
	}

	List<Merchant> findTopMerchant(List<Sale> sales, List<Merchant> merchants, int year, Month month) {

		record MerchantSales(Merchant merchant, double sales) {
		}

		return merchants.stream()
				.map(merchant -> new MerchantSales(merchant, this.computeSales(sales, merchant, year, month)))
				.sorted((m1, m2) -> Double.compare(m2.sales(), m1.sales())).map(MerchantSales::merchant)
				.collect(Collectors.toList());
	}

	double computeSales(List<Sale> sales, Merchant merchant, int year, Month month) {

		return sales.stream().filter(s -> s.merchant().name().equals(merchant.name()) && s.date().getYear() == year
				&& s.date().getMonth() == month).mapToDouble(s -> s.value()).sum();
	}
}
