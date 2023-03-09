package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterLinks {

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		By footerlinks = By.xpath("//div[@jscontroller='NzU6V']//a");
		List<WebElement> footerList = driver.findElements(footerlinks);
		System.out.println(footerList.size());

		for (WebElement e : footerList) {
			String text = e.getText();
			System.out.println(text);
		}
	}
}
