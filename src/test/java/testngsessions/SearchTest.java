package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SearchTest {
	public WebDriver driver;

	public void doSearch(String seach) {
		driver.findElement(By.xpath("//input[@name='search']")).clear();
		driver.findElement(By.xpath("//input[@name='search']")).sendKeys(seach);
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		driver.findElement(By.linkText("MacBook Pro")).click();
	}

	@DataProvider
	public Object[][] searchData() {
		return new Object[][] { { "MacBook", "MacBook Pro" }, { "Samsung", "Samsung Galaxy Tab 10.1" }, };
	}

	@Test(dataProvider = "searchData")
	public void searchTest(String search,String product) {
		doSearch(search);
	}

	@BeforeTest
	public void setup() {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
