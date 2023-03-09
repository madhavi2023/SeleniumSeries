package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverBasics {

	public static void main(String[] args) {

		// 1.launch the chrome browser

		// ChromeDriver driver = new ChromeDriver();

		String Browser = "edge";

		WebDriver driver = null;

		// WebDriver driver = new EdgeDriver();

//		if(Browser.equals("chrome")) {
//			driver = new ChromeDriver();
//		}
//		else if(Browser.equals("Firefox")){
//			driver = new FirefoxDriver();
//		}else if (Browser.equals("edge")) {
//			
//			driver = new EdgeDriver();
//		}
//		else
//		{
//			System.out.println("please pass correct browser");
//		}

		switch (Browser) {

		case "chrome":

			driver = new ChromeDriver();
			break;

		case "firefox":

			driver = new FirefoxDriver();
			break;

		case "edge":

			driver = new EdgeDriver();
			break;

		default:
			System.out.println("browser not found");
			break;

		}

		// Open url google.com
		driver.get("http://www.google.com");

		// get the title of the google page
		String actTitle = driver.getTitle();
		System.out.println("My page Title:" + actTitle);

		// Title Validation
		if (actTitle.equals("Google")) {
			System.out.println("PASS");
		} else {
			System.out.println("FAIL");
		}

		driver.quit();// Close the browser

	}

}
