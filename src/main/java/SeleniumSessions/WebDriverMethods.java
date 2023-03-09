package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		if (url.contains("amazon.com")){
				System.out.println("Pass");
	
	}
		
		//String pgSrc = driver.getPageSource();
		//System.out.println(pgSrc);
		
		driver.quit();
		
		
		
		
	}
}
