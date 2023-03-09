package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalImagesTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.com");
		//Finding total no.of images in the page with help of tagname
//		List<WebElement> imageCount = driver.findElements(By.tagName("img"));
		
		//Finding total no.of images in the page with help of Xpath
		
		List<WebElement> imageCount = driver.findElements(By.xpath("//img"));
		int count = imageCount.size();
		System.out.println("total no.of images on the page " + count);

	}

}
