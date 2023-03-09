package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SpiceJetMoveToElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		
		WebElement menuAddOn = driver.findElement(By.xpath("//div[text()='Add-ons']"));
		Actions act = new Actions(driver);
		
		act.moveToElement(menuAddOn).build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Student Discount']")).click();
		
		
		
//		WebElement menuSpiceClub = driver.findElement(By.xpath("(//div[text()='SpiceClub'])[1]"));
//		
//		act.moveToElement(menuSpiceClub).build().perform();
//		Thread.sleep(2000);
//		
		
		
	}

}
