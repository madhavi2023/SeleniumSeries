package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MultiLevelMenuHandle {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		driver.get("https://www.costco.com/");

		WebElement Shopmenu = driver.findElement(By.id("navigation-dropdown"));
		Actions act = new Actions(driver);
		act.moveToElement(Shopmenu).build().perform();
		WebElement eleLev1 = driver.findElement(By.xpath("//a[text()='Baby']/parent::li"));
		act.moveToElement(eleLev1).build().perform();
		WebElement eleLev2 = driver.findElement(By.xpath("//a[text()='Baby Care & Safety']/parent::li"));
		act.moveToElement(eleLev2).build().perform();

		WebElement eleLev3 = driver.findElement(By.xpath("//a[text()='Baby Monitors']/parent::li"));
		eleLev3.click();

	}

}
