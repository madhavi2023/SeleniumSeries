package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandle {
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

		selectUser("Ali khan");
		selectUser("Adam Lambert");
		String cName = getUserCompanyName("Ali khan");
		System.out.println(cName);
		cName = getUserCompanyName("Adam Lambert");
		System.out.println(cName);
	}

//	driver.findElement(By.xpath("//a[text()='Ali khan']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
//	.click();
//driver.findElement(
//	By.xpath("//a[text()='Adam Lambert']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
//	.click();

	public static void selectUser(String username) {

		driver.findElement(
				By.xpath("//a[text()='" + username + "']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
				.click();

	}
	
//	driver.findElement(By.xpath("//a[text()='Ali khan']/parent::td/following-sibling::td/a[@context='company']"));
	
	public static String getUserCompanyName(String userName) {
		return driver.findElement(By.xpath("//a[text()='"+ userName + "']/parent::td/following-sibling::td/a[@context='company']")).getText();
	}


}
