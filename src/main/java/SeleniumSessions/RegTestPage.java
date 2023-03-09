package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegTestPage {

	public static void main(String[] args) {
		
		String BrowserName="edge";
		
		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.initDriver(BrowserName);
		brUtil.launchUrl("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		String title = brUtil.getPageTitle();
		System.out.println(title);
		
		//By locaters for Registration page . object repository
		
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confpassword = By.id("input-confirm");
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.dosendKeys(firstName, "madhvi");
		eUtil.dosendKeys(lastName, "rao");
		eUtil.dosendKeys(emailId, "madhu123@gmail.com");
		eUtil.dosendKeys(telephone, "9736151234");
		eUtil.dosendKeys(password, "madhu@123");
		eUtil.dosendKeys(confpassword, "madhu@123");
	}

}
