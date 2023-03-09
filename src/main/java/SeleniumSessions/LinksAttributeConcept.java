package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//find all the links avaiable in the page and link href and textname
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksAttributeConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://amazon.com");
		By links = By.tagName("a");
		By images = By.tagName("img");

//	List<WebElement> linksList = getElements(links);
//		System.out.println("Total links -->"+ linksList.size());
//		
//		for(WebElement e :linksList) {
//		String hrefVal =e.getAttribute("href");
//		String linkText = e.getText();
//			System.out.println(hrefVal +"-->"+ linkText);
//			
//		}
//		List<WebElement> imageList = getElements(images);
//		System.out.println("Total Images " + imageList.size());
//		for (WebElement e : imageList) {
//			String srcVal = e.getAttribute("src");
//
//			System.out.println(srcVal);
//		}
		
		
		getElementAttributes(links,"href");
		getElementAttributes(images,"src");
	}
	
	

	public static void getElementAttributes(By locater, String attrName) {
		List<WebElement> eleList = getElements(locater);
		for(WebElement e : eleList) {
		String attrValue =	e.getAttribute(attrName);
		System.out.println(attrValue);
		}
		
	}
	public static List<WebElement> getElements(By locater) {
		return driver.findElements(locater);
	}
}
