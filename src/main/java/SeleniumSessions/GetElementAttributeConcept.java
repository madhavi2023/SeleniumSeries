package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

// find Web element Attribute

public class GetElementAttributeConcept {
static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		String placeHolder = driver.findElement(By.name("firstname")).getAttribute("placeholder");
//		System.out.println(placeHolder);
//		String srcVal = driver.findElement(By.className("img-responsive")).getAttribute("src");
//		String titleVal = driver.findElement(By.className("img-responsive")).getAttribute("title");
//		System.out.println(srcVal + "--->" + titleVal);
		
		By fName = By.name("firstname");
		By logo = By.className("img-responsive");
		
		String placeHolder = getElementAttribute(fName,"placeholder");
		String srcValue = getElementAttribute(logo,"src");
		String titleValue = getElementAttribute(logo,"title");
		System.out.println(placeHolder);
		System.out.println(srcValue);
		System.out.println(titleValue);
	}

	
	public static WebElement getElement(By locater) {
		return driver.findElement(locater);
	}
	
	public static String getElementAttribute(By locater, String attrName) {
		return getElement(locater).getAttribute(attrName);
	}
}
