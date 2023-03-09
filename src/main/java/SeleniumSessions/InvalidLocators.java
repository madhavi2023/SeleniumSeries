package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvalidLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		driver.findElement(By.xpath("////input[id='@test']")).sendKeys("Automation");// InvalidSelectorException:
		// invalid selector:

		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Testing");//NoSuchElementException;
	}

}
