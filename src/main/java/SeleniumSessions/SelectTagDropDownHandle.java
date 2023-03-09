package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
//		WebElement countryDropDown = driver.findElement(country);

//		dropdown ---htmltag==> select
//		use Select clss in selenium

//		Select select = new Select(countryDropDown);
//		select.selectByIndex(5);
//		Thread.sleep(1000);
//		select.selectByValue("Algeria");
//		Thread.sleep(1000);
//		select.selectByVisibleText("India");
		
		By country = By.id("Form_getForm_Country");
		doSelectDropDownByIndex(country,5);
		doSelectDropDownByValue(country,"Algeria");
	}

	public static WebElement getElement(By locater) {
		return driver.findElement(locater);

	}

	public static void doSelectDropDownByIndex(By locater, int index) {

		Select select = new Select(getElement(locater));
		select.selectByIndex(index);
	}

	public static void doSelectDropDownByValue(By locater, String Value) {

		Select select = new Select(getElement(locater));
		select.selectByValue(Value);
	}
	
	public static void doSelectDropDownByVIsibleText(By locater, String text) {

		Select select = new Select(getElement(locater));
		select.selectByVisibleText(text);
	}

}
