package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParagraphTest {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		List<WebElement> paragraphCount = driver.findElements(By.tagName("p"));
		int count = paragraphCount.size();
		System.out.println("total no.of paragraphs on the page " + count);
		
		for(WebElement e : paragraphCount) {
			 System.out.println(e.getText());
			
		}
		
	

	}
}
