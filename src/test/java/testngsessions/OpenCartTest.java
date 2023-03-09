package testngsessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenCartTest extends BaseTest {
	
	
	@Test(priority=1)
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("Page title is : " + title);
		Assert.assertEquals(title, "Your Store");
	}
	
	@Test(priority=2)
	public void SearchExistTest() {
		
	boolean flag = driver.findElement(By.name("search")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	
	
	

}
