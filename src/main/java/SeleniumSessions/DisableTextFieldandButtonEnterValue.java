package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableTextFieldandButtonEnterValue {

	public static void main(String[] args) throws InterruptedException {
		
		
//		WebDriver driver = new ChromeDriver();
//		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
//
//		WebElement pwd = driver.findElement(By.id("pass"));
//		pwd.sendKeys("Testing@123");//org.openqa.selenium.ElementNotInteractableException: element not interactable
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/register/");
		Thread.sleep(3000);
		WebElement submit_btn = driver.findElement(By.id("submitButton"));
		submit_btn.click();		//org.openqa.selenium.ElementClickInterceptedException: element click intercepted:


	}

}
