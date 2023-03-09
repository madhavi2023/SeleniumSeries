package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegistrationTest {

	public WebDriver driver;

	public boolean doRegistration(String firstName, String lastName, String email, String telephone, String password) {
		//driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		//driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		driver.findElement(By.id("input-email")).sendKeys(email);
		driver.findElement(By.id("input-telephone")).sendKeys(telephone);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.id("input-confirm")).sendKeys(password);
		;
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		String msg = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
		
		if( msg.equals("Your Account Has Been Created!")){
			return true;
		}
		else
			return false;
		
	}
	
	public void logout() {
		
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Register")).click();
		
	}

	@DataProvider
	public Object[][] getRigistrationTestData() {
		return new Object[][] { { "Rajani002", "kantha", "Rajani@yahoo.com", "9731621922", "test@123" },
			{ "Samantha1", "kondru", "Samantha1234@gmail.com", "9731621952", "test1@123" },
				{ "Uma1", "Potla", "Uma1234@gmail.com", "9731621942", "test12@123" }, };
	}

	@Test(dataProvider = "getRigistrationTestData")
	public void registrationTest(String fn,String ln,String email,String phone,String password) {
		//doRegistration("Rajani123", "kantha", "Rajani345@gmail.com", "9731621922", "test@123" );
		boolean flag = doRegistration(fn,ln,email,phone,password);
		Assert.assertTrue(flag);
		logout();
	}

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");

	}

	@AfterTest
	public void tearDown() {
		//driver.quit();
	}

}
