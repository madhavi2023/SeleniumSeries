package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestRightSideOfPage {
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		List<WebElement> panelLinksList = driver.findElements(By.xpath("//aside[@id='column-right']//a"));
//		System.out.println("Total No.of panel links :" + panelLinksList.size());
//		
//		for(WebElement e:panelLinksList) {
//		String text = e.getText();
//			System.out.println(text);
//		}
	
		//gives all the links text in the right handside panel
		
	By rightPanelLinks =	By.xpath("//aside[@id='column-right']//a");
	List<String> rightElesList = getElementsTextList(rightPanelLinks);
	System.out.println(rightElesList);
	System.out.println(rightElesList.contains("Login"));
	System.out.println(rightElesList.contains("Wish List"));
	System.out.println(rightElesList.contains("Newsletter"));
	
	// gives all the links text in the footer
	
	By footerLinks = By.xpath("//footer//a");
	List<String> footerLinksText = getElementsTextList(footerLinks);
	System.out.println(footerLinksText);
	}
	
	public static List<WebElement> getElements(By locater) {
		return driver.findElements(locater);
	}
	
	public static List<String> getElementsTextList(By locater) {
		List<String> eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locater);
		for(WebElement e : eleList) {
		String text =	e.getText();
		eleTextList.add(text);
		}
		return eleTextList;
	}

}
