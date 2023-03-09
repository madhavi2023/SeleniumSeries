package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRMTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com/");
		Thread.sleep(4000);
		System.out.println(driver.getTitle());

		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("newautomation");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		Thread.sleep(4000);
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
		.click();
//	driver.findElement(
//		By.xpath("//a[text()='Adam Lambert']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
//		.click();
		
		
	String companyName=	driver.findElement(By.xpath("//a[text()='Ali khan']/parent::td/following-sibling::td/a[@context='company']")).getText();
	System.out.println("User Company name :"+ companyName);
	
	List<WebElement> phoneNumbers= driver.findElements(By.xpath("//a[text()='Ali khan']/parent::td/following-sibling::td/span[@context='phone']"));
	for(WebElement e:phoneNumbers) {
		System.out.println(e.getText());
	}
	String userEmail=driver.findElement(By.xpath("//a[text()='Ali khan']/parent::td/following-sibling::td/a[contains(text(),'.com')]")).getText();
	System.out.println("User emial-id :"+userEmail);
}

}
