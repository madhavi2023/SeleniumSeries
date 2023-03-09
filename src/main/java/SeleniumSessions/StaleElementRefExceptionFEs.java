package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionFEs {

	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		
	List<WebElement> linksList =	driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a"));
	
	for(int i=0; i<linksList.size(); i++) {
		linksList.get(i).click();
		linksList =	driver.findElements(By.xpath("(//ul[@class='footer-nav'])[1]//a"));
		
	}
	}

}
