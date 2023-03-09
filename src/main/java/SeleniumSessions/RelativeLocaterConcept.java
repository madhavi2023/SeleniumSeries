package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocaterConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		Thread.sleep(3000);
		WebElement cityEle = driver.findElement(By.linkText("Laval, Canada"));
		String eleRight = driver.findElement(with(By.tagName("p")).toRightOf(cityEle)).getText();
		System.out.println("Right Element : " +eleRight);
		
		String eleLeft = driver.findElement(with(By.tagName("p")).toLeftOf(cityEle)).getText();
		System.out.println("Left Element : " +eleLeft);
		
		String eleAbove = driver.findElement(with(By.tagName("p")).above(cityEle)).getText();
		System.out.println("Above Element : " +eleAbove);
		
		String eleBelow = driver.findElement(with(By.tagName("p")).below(cityEle)).getText();
		System.out.println("Below Element : " +eleBelow);
		
		String eleNear = driver.findElement(with(By.tagName("p")).near(cityEle)).getText();
		System.out.println("Below Element : " +eleNear);
		
	
	
	}
	

}
