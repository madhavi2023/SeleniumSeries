package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsElementDisplayed {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		boolean flagImg = driver.findElement(By.className("img-responsive")).isDisplayed();
//		if (flagImg)
//			System.out.println("Logo image present---PASS");
//
//		boolean flagSearch = driver.findElement(By.name("search")).isDisplayed();
//
//		if (flagSearch) {
//			System.out.println("Search field present--PASS");
//			driver.findElement(By.name("search")).sendKeys("mac book");
//			driver.findElement(By.cssSelector("#search > span > button")).click();
//		}

//		driver.close();
		
		By logoImg = By.className("img-responsive");
		By search = By.name("search");
		By searchButton = By.xpath("//*[@id=\"search\"]/span/button"); 
		
		if(doElementIsDisplayed(logoImg)) {
			System.out.println("logo image displayed--PASS");
			
		}
		
		if(doElementIsDisplayed(search)) {
			System.out.println("Search field is present--PASS");
			doSendKeys(search,"macbook");
			doClick(searchButton);
		}
			
		
		
	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

	public static boolean doElementIsDisplayed(By locater) {
		return getElement(locater).isDisplayed();

	}

	public static void doSendKeys(By locater, String value) {
		getElement(locater).sendKeys(value);
	}

	public static void doClick(By locater) {
		getElement(locater).click();

	}

}
