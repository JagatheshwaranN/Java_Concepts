package excelOperations;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteWebTableDataIntoExcel {

	public static void main(String ar[]) throws IOException {
		WriteWebTableDataIntoExcel.webTableReadOptimization();
		WriteWebTableDataIntoExcel.webTableRead();
	}

	public static void webTableReadOptimization() throws IOException {

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");

		String path = ".\\dataFiles\\populationData2.xlsx";
		ExcelUtility excelUtility = new ExcelUtility(path);

		List<WebElement> tableHeader = driver.findElements(
				By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//thead//th"));
		int totalheaderColumns = tableHeader.size();

		int headerRow = 0, headerColumn = 0;
		String headerCellValue = null;
		String headerSectionXpath = "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//thead//th";
		for (int column = 2; column <= totalheaderColumns; column++) {
			headerColumn = column - 2;
			headerCellValue = driver.findElement(By.xpath(headerSectionXpath + "[" + column + "]")).getText();
			excelUtility.setCellData("World", headerRow, headerColumn, headerCellValue);
		}
		System.out.println("Web table header written succesfully");

		WebElement table = driver.findElement(
				By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//tbody"));
		List<WebElement> tableRows = table.findElements(By.xpath("tr"));
		int totalRowsCount = tableRows.size() - 1;

		for (int row = 0; row <= totalRowsCount; row++) {
			String tableCellValues = null;
			String tableCellXpath = "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//tbody";
			List<WebElement> tableRowColumns = tableRows.get(row).findElements(By.tagName("td"));
			int totalRowColumns = tableRowColumns.size() - 1;
			int column;
			for (column = 0; column <= totalRowColumns; column++) {
				tableCellValues = driver
						.findElement(
								By.xpath(tableCellXpath + "//tr[" + (row + 1) + "]" + "//td[" + (column + 1) + "]"))
						.getText();
				excelUtility.setCellData("World", row + 1, column, tableCellValues);
			}
		}
		System.out.println("Web scrapping is done succesfully");
		driver.close();
	}

	public static void webTableRead() throws IOException {

		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		driver.get("https://en.wikipedia.org/wiki/List_of_countries_and_dependencies_by_population");

		String path = ".\\dataFiles\\populationData1.xlsx";
		ExcelUtility excelUtility = new ExcelUtility(path);

		WebElement table = driver.findElement(
				By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//tbody"));
		List<WebElement> allRows = table.findElements(By.xpath("tr"));
		int totalRowsCount = table.findElements(By.xpath("tr")).size() - 1;

		List<WebElement> headerSection = driver.findElements(
				By.xpath("//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//thead//th"));
		int totalheaderColumns = headerSection.size();

		int headerRow = 0, headerColumn = 0;
		String headerValue = null;
		String headerSectionXpath = "//table[@class='wikitable sortable plainrowheaders jquery-tablesorter']//thead//th";
		for (int column = 2; column <= totalheaderColumns; column++) {
			headerColumn = column - 2;
			headerValue = driver.findElement(By.xpath(headerSectionXpath + "[" + column + "]")).getText();
			excelUtility.setCellData("World", headerRow, headerColumn, headerValue);
		}
		System.out.println("Web table header written succesfully");

		for (int row = 0; row <= totalRowsCount; row++) {
			String country = null;
			String population = null;
			String perOfWorld = null;
			String date = null;
			String source = null;
			List<WebElement> row_columns = allRows.get(row).findElements(By.tagName("td"));
			int rowColumns = row_columns.size() - 1;
			int column;
			for (column = 0; column <= rowColumns; column++) {
				switch (column + 1) {
				case 1:
					country = row_columns.get(column).getText();
					break;
				case 2:
					population = row_columns.get(column).getText();
					break;
				case 3:
					perOfWorld = row_columns.get(column).getText();
					break;
				case 4:
					date = row_columns.get(column).getText();
					break;
				case 5:
					source = row_columns.get(column).getText();
					break;
				}
			}

			System.out.println(country + "|" + population + "|" + perOfWorld + "|" + date + "|" + source);

			for (column = 0; column <= rowColumns - 1; column++) {
				switch (column) {
				case 0:
					excelUtility.setCellData("World", row + 1, column, country);
					break;
				case 1:
					excelUtility.setCellData("World", row + 1, column, population);
					break;
				case 2:
					excelUtility.setCellData("World", row + 1, column, perOfWorld);
					break;
				case 3:
					excelUtility.setCellData("World", row + 1, column, date);
					break;
				case 4:
					excelUtility.setCellData("World", row + 1, column, source);
					break;
				}
			}
		}
		System.out.println("Web scrapping is done succesfully");
		driver.close();
	}
}
