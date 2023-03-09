package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(2000);
		WebElement shopParentEle = driver.findElement(By.cssSelector("a.meganav-shop"));
		Actions act = new Actions(driver);

		act.moveToElement(shopParentEle).build().perform();
		Thread.sleep(2000);
		WebElement lEle2 = driver.findElement(By.linkText("Beverages"));

		act.moveToElement(lEle2).build().perform();
		Thread.sleep(2000);
		WebElement lEle3 = driver.findElement(By.linkText("Tea"));

		act.moveToElement(lEle3).build().perform();
		Thread.sleep(1000);
		WebElement lEle4 = driver.findElement(By.linkText("Tea Bags"));
		lEle4.click();
	}

}
