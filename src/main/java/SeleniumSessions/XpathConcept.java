package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathConcept {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//custom path formula
		//  //htmltag[@attr='value']
		//input[@type='text' and @name='search']  Xpath for Firstname
		
		//h2[text()='Returning Customer'] ==> example Xpath for text() value
		
		//a[text()='Forgotten Password'] ==> forgotten password on login page

	}

}
