package SeleniumSessions;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinkTest {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		//find all the links on the page with tagname locater
//		List<WebElement> linkslist = driver.findElements(By.tagName("a"));
		
		//Finding total no.of images in the page with help of Xpath locater
		
		List<WebElement> linkslist = driver.findElements(By.xpath("//a"));
		int linksCount = linkslist.size();
//		int count=0;
		//find  total count of links
	System.out.println("total links :" + linksCount);	
	//find each link text
//	for(int i=0;i<linksCount;i++) {
//		
//	String text =	linkslist.get(i).getText();
//	if(text.length()>0) {
//	System.out.println(i + ":" + text);
//	 count++;
//	}
//	
//	}
//	System.out.println("links with text :" + count);	
//	
int count=0;
	for(WebElement e :linkslist) {
		String text = e.getText();
		if(text.length()>0) {
		System.out.println(count + ":" + text);
		}
		count++;
	}
	
	}
	
	
}