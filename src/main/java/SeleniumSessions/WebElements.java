package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements {

//	create web element and perform action(click,sendkeys,gettext,isDisplayed..)

	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();

		// 1st way of creating webelement

//		driver.findElement(By.id("input-firstname")).sendKeys("Madhu");
//		driver.findElement(By.id("input-lastname")).sendKeys("thudi");
//		driver.findElement(By.id("input-email")).sendKeys("madhu8004@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("9732919999");
//		driver.findElement(By.id("input-password")).sendKeys("madhu123");
//		driver.findElement(By.id("input-confirm")).sendKeys("madhu123");
//		
//		driver.close();	
//		2nd way of creating web element

//		WebElement firstName = driver.findElement(By.id("input-firstname"));
//		WebElement lastName = driver.findElement(By.id("input-lastname"));
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement telephone = driver.findElement(By.id("input-telephone"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		WebElement confpassword = driver.findElement(By.id("input-confirm"));
//		WebElement privacy = driver.findElement(By.name("agree"));
//		WebElement confirm = driver.findElement(By.xpath("//*[@id=\"content\"]/form/div/div/input[2]"));
//		WebElement message = driver.findElement(By.xpath("//*[@id=\"content\"]/h1"));
//		firstName.sendKeys("Madhu");
//		lastName.sendKeys("thudi");
//		emailId.sendKeys("thudin@gmail.com");
//		telephone.sendKeys("9732919999");
//		password.sendKeys("madhu123");
//		confpassword.sendKeys("madhu123");
//		privacy.click();
//		confirm.submit();
//		System.out.println(message.getText());

//		3.by locator method
		// creating By locaters
//		By firstName =By.id("input-firstname");
//		By lastName =By.id("input-lastname");
//		By emailId =By.id("input-email");
//		By telephone =By.id("input-telephone");
//		By password =By.id("input-password");
//		By confpassword =By.id("input-confirm");

		// creating webelements

//		WebElement fName = driver.findElement(firstName);
//		WebElement lName = driver.findElement(lastName);
//		WebElement eId = driver.findElement(emailId);
//		WebElement tphone = driver.findElement(telephone);
//		WebElement pwd = driver.findElement(password);
//		WebElement cpwd = driver.findElement(confpassword);
//		
//		fName.sendKeys("madhvi");
//		lName.sendKeys("thudi");
//		eId.sendKeys("madhu8004@gmail.com");
//		tphone.sendKeys("9736152134");
//		pwd.sendKeys("madhu123");
//		cpwd.sendKeys("madhu123");
//		driver.close();

//		4th By locater +  creating webelement and performing actions

//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By emailId = By.id("input-email");
//		getElement(firstName).sendKeys("madhvi");
//		getElement(lastName).sendKeys("thudi");
//		getElement(emailId).sendKeys("madhu8004@gmail.com");

//		5th By locater + creating generic method for webelements and generic method for actions 
		
//		By firstName = By.id("input-firstname");
//		By lastName = By.id("input-lastname");
//		By emailId = By.id("input-email");
//		dosendKeys(firstName,"madhvi");
//		dosendKeys(lastName,"thudi");
//		dosendKeys(emailId,"madhu8004@gmail.com");
		
//		6 th. By locater +create generic method for webelements and actions create webelement util method
		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By emailId = By.id("input-email");
		By telephone = By.id("input-telephone");
		By password = By.id("input-password");
		By confpassword = By.id("input-confirm");
		
		
		ElementUtil eUtil = new ElementUtil(driver);
		eUtil.dosendKeys(firstName, "madhvi");
		eUtil.dosendKeys(lastName, "thudi");
		eUtil.dosendKeys(emailId, "madhu8004@gmail.com");
		eUtil.dosendKeys(telephone, "9736151234");
		eUtil.dosendKeys(password, "madhu@123");
		eUtil.dosendKeys(confpassword, "madhu@123");

	}

//	public static WebElement getElement(By locater) {
//	 return driver.findElement(locater);
//		
//	}
//
//	public static void dosendKeys(By locater, String value) {
//		getElement(locater).sendKeys(value);
//		
//	}
}
