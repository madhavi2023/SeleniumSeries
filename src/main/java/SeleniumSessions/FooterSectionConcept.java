package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterSectionConcept {
static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		List<String> infoSection=getSectionList("Information");
		System.out.println(infoSection);
		
	}
	
	public static List<String>getSectionList(String headeraName) {
		
		List<WebElement> footerSectionList=driver.findElements(By.xpath("//h5[text()='"+headeraName+"']/following-sibling::ul//a"));
		System.out.println(footerSectionList.size());
		List<String> secValList = new ArrayList<String>();
		for(WebElement e:footerSectionList) {
			String text = e.getText();
			secValList.add(text);
		}
		return secValList;
	}

}
