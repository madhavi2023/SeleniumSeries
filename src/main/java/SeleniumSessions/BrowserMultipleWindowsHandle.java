package SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[contains(@href,'linkedin.com')]")).click();
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));
		WebElement fbEle = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));
		WebElement ytEle = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));
		WebElement liEle = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));

		twEle.click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindowId = it.next();
		System.out.println("parent window id " + parentWindowId);
		String childWindowIdTw = it.next();
		System.out.println("child window id " + childWindowIdTw);
		driver.switchTo().window(childWindowIdTw);
		System.out.println("Child window url " + driver.getCurrentUrl());
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("Parent window url " + driver.getCurrentUrl());
		System.out.println("click on facebook link");
		Thread.sleep(3000);
		fbEle.click();
		Set<String> handles1 = driver.getWindowHandles();
		Iterator<String> it1 = handles1.iterator();
		String parentWindowIdFb = it1.next();
		String childWindowIdFb = it1.next();
		System.out.println("child window id " + childWindowIdFb);
		driver.switchTo().window(childWindowIdFb);
		
		System.out.println("FbChild window url " + driver.getCurrentUrl());
		driver.close();
		driver.switchTo().window(parentWindowIdFb);
		System.out.println("Parent window url " + driver.getCurrentUrl());
		driver.quit();
	}

}
