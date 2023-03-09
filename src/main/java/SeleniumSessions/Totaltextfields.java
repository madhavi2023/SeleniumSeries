package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totaltextfields {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<WebElement> textfields = driver.findElements(By.xpath("//form//input[@placeholder]"));
		int count = textfields.size();
		System.out.println("total no.of textfields : " + count);
		
		for(WebElement e : textfields) {
			
			String text = e.getAttribute("name");
			System.out.println(text);
		}
		}

}
