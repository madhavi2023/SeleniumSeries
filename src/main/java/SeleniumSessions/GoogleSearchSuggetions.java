package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSuggetions {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Naveen automationlabs");
		Thread.sleep(5000);
//		List<WebElement> googleSuggList = driver.findElements(By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span"));
//
//		System.out.println(googleSuggList.size());
//	for(WebElement e : googleSuggList) {
//		String text= e.getText();
//		System.out.println(text);
//		if(text.equals("naveen automationlabs java")) {
//			e.click();
//			break;
//		}
//	}
		By googleSearchLocater = By.xpath("//li[@role='presentation']//div[@class='wM6W7d']/span");
		doSearch(googleSearchLocater,"naveen automationlabs java");
	}

	
	public static void doSearch(By suggListLocater,String suggName) {
		List<WebElement> suggList = driver.findElements(suggListLocater);
		System.out.println(suggList.size());
		
		for(WebElement e : suggList) {
			String text= e.getText();
			System.out.println(text);
			if(text.contains(suggName)) {
				e.click();
				break;
			}
		}
		
		
		
		
	}
}
