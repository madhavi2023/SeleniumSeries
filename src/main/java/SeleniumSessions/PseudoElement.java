package SeleniumSessions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PseudoElement {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

		String script = "return window.getComputedStyle(document.querySelector(\"label[for='input-firstname']\"),'::before').getPropertyValue('content')";

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String mandField = js.executeScript(script).toString();
		System.out.println(mandField);
		if (mandField.contains("*")) {
			System.out.println("First Name is mandatory field");
		}

		String script1 = "return window.getComputedStyle(document.querySelector(\"label[for='input-lastname']\"),'::before').getPropertyValue('content')";
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		String mandField_Last = js1.executeScript(script1).toString();
		System.out.println(mandField_Last);
		if (mandField_Last.contains("*")) {
			System.out.println("Last Name is mandatory field");
		}
	}

}
