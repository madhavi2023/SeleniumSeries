package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagenation {
static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		WebElement headerEle = driver.findElement(By.xpath("//h2[@id='tablepress-1-name']"));
		
		
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true);", headerEle);
		Thread.sleep(3000);
		
		WebElement countryEle = driver.findElement(By.xpath("(//td[text()='India'])"));
		
		
		if(countryEle.getText().equals("India")) {
			driver.findElement(By.xpath("(//td[text()='India']/preceding-sibling::td/input)")).click();
			System.out.println("done");
	
		}
	}
	
	
//	public static void countyEle(String value) {
//		
//		driver.findElement(null)
//	}

}
