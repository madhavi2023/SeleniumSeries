package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;


/**This method is used to initialize the driver on the basis of given browser
 * 
 * @author madhavi
 * 
 *@return this returns the specific browser driver
 */
public class BrowserUtil {

	private WebDriver driver;

	public WebDriver initDriver(String browserName) {

		System.out.println("Browser name is :" + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		case "safari":
			driver = new SafariDriver();
			break;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
			return driver;
	}

	public void launchUrl(String url) {
		if (url==null) {
			System.out.println("url can not be null");
		}
		if (url.indexOf("https")==0) {
			driver.get(url);
		}
	}
	
	public String getPageTitle() {
	String Title  = driver.getTitle();	
	System.out.println("Page Title is : "+ Title);
	return Title;
	
	}
	public String getPageUrl() {
		String url  = driver.getCurrentUrl();	
		System.out.println("Page Title is : "+ url);
		return url;
	}
	
	public void closeBrowser() {
		
		if(driver!=null) {
			driver.close();
		}
	}
	
public void quitBrowser() {
		
		if(driver!=null) {
			driver.quit();
		}
}
}

