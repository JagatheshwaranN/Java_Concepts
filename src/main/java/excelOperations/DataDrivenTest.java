package excelOperations;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTest {

	WebDriver driver;

	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver", ".\\BrowserDrivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test(dataProvider = "LoginData")
	public void loginTest(String user, String pwd, String exp) {
		driver.get("https://admin-demo.nopcommerce.com/login");

		WebElement txtEmail = driver.findElement(By.id("Email"));
		txtEmail.clear();
		txtEmail.sendKeys(user);

		WebElement txtPassword = driver.findElement(By.id("Password"));
		txtPassword.clear();
		txtPassword.sendKeys(pwd);

		driver.findElement(By.xpath("//input[@value='Log in']")).click(); // Login button

		String exp_title = "Dashboard / nopCommerce administration";
		String act_title = driver.getTitle();

		if (exp.equals("Valid")) {
			if (exp_title.equals(act_title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(true);
			} else {
				Assert.assertTrue(false);
			}
		} else if (exp.equals("Invalid")) {
			if (exp_title.equals(act_title)) {
				driver.findElement(By.linkText("Logout")).click();
				Assert.assertTrue(false);
			} else {
				Assert.assertTrue(true);
			}
		}

	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@DataProvider(name = "LoginData")
	public String[][] getData() throws IOException {
		/*
		 * String loginData[][] = { { "admin@yourstore.com", "admin", "Valid" }, {
		 * "admin@yourstore.com", "adm", "Invalid" }, { "adm@yourstore.com", "admin",
		 * "Invalid" }, { "adm@yourstore.com", "adm", "Invalid" } };
		 */

		String path = ".\\dataFiles\\loginData.xlsx";
		ExcelUtility excelUtility = new ExcelUtility(path);
		int totalRows = excelUtility.getRowCount("login");
		int totalcolumns = excelUtility.getCellCount("login", 1);
		String[][] loginValues = new String[totalRows][totalcolumns];
		for (int nextRow = 1; nextRow <= totalRows; nextRow++) {
			for (int nextCol = 0; nextCol < totalcolumns; nextCol++) {
				loginValues[nextRow - 1][nextCol] = excelUtility.getCellData("login", nextRow, nextCol);
			}
		}
		return loginValues;
	}
}
