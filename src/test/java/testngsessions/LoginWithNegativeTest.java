package testngsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginWithNegativeTest {
	public WebDriver driver;

	public boolean doLogin(String userName, String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(userName);
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();

		String errorMsg = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
//		System.out.println(errorMsg);
		if (errorMsg.contains(" No match for E-Mail Address and/or Password.")) {
			return true;
		} else
			return false;

	}
	
	
	

	@DataProvider
	public Object[][] getNegativeTestData() {

		return new Object[][] { { "test@gamil.com", "Test@123" }, 
			{ "test123@gamil.com", "Test1@123" },
			{ "test000@gamil.com", "Test2@123" },

		};
	}
	
	

	
	@Test(dataProvider = "getNegativeTestData")
	public void loginTest(String username, String password) {
		boolean flag = doLogin(username, password);

		Assert.assertTrue(flag);

//		Assert.assertTrue(doLogin("test@gamil.com", "Test@123"));

	}

	@BeforeTest
	public void setup() {
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}

	@AfterTest
	public void teardown() {

		// driver.quit();
	}

}
